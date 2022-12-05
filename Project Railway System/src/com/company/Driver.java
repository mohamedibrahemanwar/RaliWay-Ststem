package com.company;
//By : Mohamed Ibrahem Anwar .... ID: 2051811542

public class Driver extends Person {
    protected String gender;
    protected int Exyperience_year;

    public Driver(){};
    public Driver(String address, String name, String id, String phoneNumber, int age, String gender, int exyperience_year) {
        super(address, name, id, phoneNumber, age);
        this.gender = gender;
        Exyperience_year = exyperience_year;
    }

    @Override
    public String getId() {
        return "20"+super.getId();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getExyperience_year() {
        return Exyperience_year;
    }

    public void setExyperience_year(int exyperience_year) {
        Exyperience_year = exyperience_year;
    }

    @Override
    public String toString() {
        return " Driver{ " +
                " name = " + getName() + '\'' +
                ", age = " + getAge() +
                " , gender = '" + getGender() + '\'' +
                ", id = '" + getId() + '\'' +
                ", phoneNumber = '" + getPhoneNumber() + '\'' +
                ", address = '" + getAddress() + '\'' +
                ", Exyperience_year = " + getExyperience_year() + '}';
    }
}
