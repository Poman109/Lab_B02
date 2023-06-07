
package com.apilab_01.apibasics01;

public class Person {
    private String firstName;
    private String lastName;
    private String hkid;

    public Person(String firstName, String lastName, String hkid){
        this.firstName = firstName;
        this.lastName = lastName;
        this.hkid = hkid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getHkid() {
        return hkid;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setHkid(String hkid) {
        this.hkid = hkid;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



}