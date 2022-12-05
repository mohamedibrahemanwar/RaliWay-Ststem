package com.company;
//By : Mohamed Ibrahem Anwar .... ID: 2051811542

import java.util.ArrayList;
import java.util.Date;

public class Trips  extends TripsMethod implements Comparable<Trips> {
    protected int id;
    protected Passenger passenger;
    protected Driver driver;
    protected  int MaxNumber = 30;

    protected  Date date = new Date();
    protected  String fromWhere;
    protected  String toWhere;
    protected  String modelPlane;



    public Trips() {
    }


    public Trips(int id, Passenger passenger, Driver driver, int MaxNumber, String fromWhere, String toWhere, String modelPlane) {
        this.id = id;
        this.passenger = passenger;
        this.driver = driver;
        this.MaxNumber = MaxNumber;
        this.fromWhere = fromWhere;
        this.toWhere = toWhere;
        this.modelPlane = modelPlane;
    }

    public  Date getDate() {
        return date;
    }

    public  int getId() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }



    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public ArrayList<Passenger> getPassengerlist(){
        return PassengerList;
    }
    public ArrayList<Driver> getDriverList(){
        return DriverList;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setMaxNumber(int MaxNumber) {
        this.MaxNumber = MaxNumber;
    }

    public  int getMaxNumber() {
        return MaxNumber;
    }


    public  String getFromWhere() {
        return fromWhere;
    }

    public void setFromWhere(String fromWhere) {
        this.fromWhere = fromWhere;
    }

    public  String getToWhere() {
        return toWhere;
    }

    public void setToWhere(String toWhere) {
        this.toWhere = toWhere;
    }

    public  String getModelPlane() {
        return modelPlane;
    }

    public void setModelPlane(String modelPlane) {
        this.modelPlane = modelPlane;
    }


    @Override
    public int compareTo(Trips trips) {
            if (this.getId() < trips.getId())
                return 1;
            else if (this.getId() > trips.getId())
                return -1;
            else
                return 0;
        }
     ArrayList<Driver> DriverList = new ArrayList<>();
     ArrayList<Passenger> PassengerList = new ArrayList<>();

    @Override
    public String toString() {
        return  " Date = " + getDate() +" / "+ " Trips{" +  "  trip number = " +getId() + "/  Max number inside trip  = " +getMaxNumber()+ "\n"
                + "  from where :  " + getFromWhere() + "  to where : " + getToWhere() +
                getDriverList() + "\n" +
                getPassengerlist() + "\n" +
                '}';
    }



}
