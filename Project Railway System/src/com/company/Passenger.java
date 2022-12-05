package com.company;
//By : Mohamed Ibrahem Anwar .... ID: 2051811542

public class Passenger extends Person{
    protected String Tall;
    protected boolean isHaveChildren;

    public Passenger(){};
    public Passenger(String address, String name, String id, String phoneNumber, int age, String Tall, boolean isHaveChildren) {
        super(address, name, id, phoneNumber, age);
        this.Tall = Tall;
        this.isHaveChildren = isHaveChildren;
    }

    @Override
    public String getId() {
        return "0"+super.getId();
    }

    public String getTall() {
        return Tall;
    }

    public void setTall(String Tall) {
        this.Tall = Tall;
    }

    public boolean isHaveChildren() {
        return isHaveChildren;
    }

    public void setHaveChildren(boolean haveChildren) {
        isHaveChildren = haveChildren;
    }
//method equal
    public boolean equals(Object o){
     Passenger p1 = (Passenger)  o;
     if(this.getId().equals(p1.getId())){
         return true;
     }
     else return false;
    }
    @Override
    public String toString() {
        return "Passenger{" +
                " name=" + getName() + '\'' +
                ", age=" + getAge() +
                "Your Tall ='" + getTall() + '\'' +
                ", id='" + getAge() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", isHaveChildren=" + isHaveChildren + '}';
    }
}
