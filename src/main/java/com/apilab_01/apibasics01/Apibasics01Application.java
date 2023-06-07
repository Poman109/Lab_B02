package com.apilab_01.apibasics01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
@RestController

public class Apibasics01Application {
	 List<Person> people = new ArrayList<Person>();

	public static void main(String[] args) {
		SpringApplication.run(Apibasics01Application.class, args);
	}

	@PostMapping("/person/create")
	public Person createData(@RequestBody Person person) {
		people.add(person);
		return person;

	}

	@GetMapping("/person/all")
	public List<Person> getAllPeople(){
		return people;
	}

	@PutMapping("/person/update")
	public ResponseEntity changeData(@RequestBody Person updateData ) {
		for (Person person : people) {
			if (person != null) {
				if (person.getHkid().equals(updateData.getHkid())) {
					person.setFirstName(updateData.getFirstName());
					person.setLastName(updateData.getLastName());
					return ResponseEntity.status(HttpStatus.OK).body(person);
				}
			}
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping("/person/delete")
	public Person deletePerson(@RequestBody Person deletPerson) throws PersonNotFoundException {
		for(Person person : people){
			if(!person.getHkid().equals(deletPerson.getHkid())){
				continue;
			}
			people.remove(person);
			return person;
		}
		throw new PersonNotFoundException();
	}



}
