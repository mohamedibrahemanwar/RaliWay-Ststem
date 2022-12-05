package com.company;
//By : Mohamed Ibrahem Anwar .... ID: 2051811542

import java.util.ArrayList;

public class Person {
    protected String address;
    protected String name;
    protected String id;
    protected String phoneNumber;
    protected int age;

    public Person(){};
    public Person(String address, String name, String id, String phoneNumber, int age) {
        this.address = address;
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Passenger> setId(String id) {
        this.id = id;
        return null;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address = '" + getAddress() + '\'' +
                ", name = '" + getName() + '\'' +
                ", id = '" + getId() + '\'' +
                ", phoneNumber = '" + getPhoneNumber() + '\'' +
                ", age = " + getAge() +
                '}';
    }
}
