package com.company;
//By : Mohamed Ibrahem Anwar .... ID: 2051811542

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public abstract class TripsMethod {
    // Offering a new trip
    protected static ArrayList<Trips> TripsList = new ArrayList<>();

    public void addTrip(Trips trips) {
        TripsList.add(trips);
        System.out.println("Successful Add trip..");
    }

    public void addDriver(Trips trips,Driver d) {
        trips.getDriverList().add(d);
        System.out.println("Successful Add Driver..");
    }

    //check if passenger in trip or no
    public boolean cheackPassenger(Passenger passenger, Trips trips) {
        boolean flag = false;
        for (int i = 0; i < trips.getPassengerlist().size(); i++) {
            if (passenger.getId().equals(trips.getPassengerlist().get(i).getId())) {
                flag = true;
                break;
            } else {
                checkTrip(passenger, trips);
            }
        }
        return flag;
    }

    //check if trip existing
    public boolean checkTrip(Passenger passenger, Trips trips) {
        boolean flag1 = false;
        for (int i = 0; i < TripsList.size(); i++) {
            if (TripsList.get(i).getId() == (trips.getId())) {
                flag1 = true;
                break;
            } else {
                checkSizeAndaddToAdd(passenger, trips);
            }
        }
        return flag1;
    }

    //check size and add passenger
    public void checkSizeAndaddToAdd(Passenger passenger,Trips trips) {
        if (trips.getPassengerlist().size() < trips.getMaxNumber()) {
            trips.getPassengerlist().add(passenger);
            System.out.println("Successful Passenger Done...");
        } else {
            System.out.println("Passenger is not add ...\"");
        }
    }

    //to remove from array
    public void removvvePass(Passenger passenger, Trips trips) {
        trips.getPassengerlist().remove(passenger);
    }

    //to check and add passenger
    public void addPassengerTotrip(Passenger passenger, Trips trips) {
        if (cheackPassenger(passenger, trips)) {
            System.out.println("found");
        } else if (checkTrip(passenger, trips)) {
            checkSizeAndaddToAdd(passenger, trips);
        } else {
        }

    }

    //to check and remove passenger
    public void checkRemovePassenger(Passenger passenger, Trips trips) {
        if (cheackPassenger(passenger, trips)) {
            removvvePass(passenger, trips);
            System.out.println("Successful remove");
        } else if (checkTrip(passenger, trips)) {
        } else {
            System.out.println("Not found");
        }
    }

    //to get average passenger
    public void AvgPassenger(Trips trips) {

        int sum = 0;
        for (int i=0; i< trips.getPassengerlist().size(); i++) {
            sum += i;
        }
        System.out.println("The avrege number is : " + sum / trips.getPassengerlist().size());
    }

    //Show Trips
    public static void Show() {
        Collections.sort(TripsList);
        for (Trips x : TripsList) {
            System.out.println(x);
        }
    }



    //Sava date in file
    public static void saveData(String s, ArrayList<Trips> tt) {
        try {
            File file = new File("D:\\Mohamed Ibrahem\\AOU\\M251\\Tasks Dr.Mostafa\\tma_251\\FileData.txt");
            PrintWriter wt = new PrintWriter(file);
            tt.forEach(saveFile ->{
                wt.println(saveFile);
                ;});
            wt.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
        }