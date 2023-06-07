package com.apilab_01.apibasics01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication

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
}
