package com.company;
//By : Mohamed Ibrahem Anwar .... ID: 2051811542
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
Passenger p1 = new Passenger("cairo","mhoamed hema","99999","0100000",20,"Male",true);
Driver d1 = new Driver("Fayon","Ahmed","0011","011503510",20,"Male",3);
Trips t1 = new Trips(2,p1,d1,3,"egypt","cairo","ck-4");


//        System.out.println(t1.toString());
while(true) {
    System.out.println("Welcome in Railway trips Please enter a number ...");
    System.out.println("1 - Offering a new trip ");
    System.out.println("2 - Add passenger to trip ");
    System.out.println("3 - Remove passenger to trip ");
    System.out.println("4 - Average number of passenger ");
    System.out.println("5 - Display the data ");
    System.out.println("6 - Save in file  ");
    System.out.println("7 - Close  ");
    int urchoice = input.nextInt();
    switch (urchoice){
        case 1:
            d1 = new Driver();
            System.out.println("Please Enter number of trips");
            int userEnterTripNum = input.nextInt();
            System.out.println("Please Add ur Driver information");
            System.out.println("Please enter The driver's Address");
            d1.setAddress(input.next());
            System.out.println("Please enter The driver's Name");
            d1.setName(input.next());
            System.out.println("Please enter The driver's Id");
            d1.setId(input.next());
            System.out.println("Please enter The driver's Phone Number");
            d1.setPhoneNumber(input.next());
            System.out.println("Please enter The driver's age");
            d1.setAge(input.nextInt());
            System.out.println("Please enter The driver's Gender");
            d1.setGender(input.next());
            System.out.println("Please enter The driver's Experience years");
            d1.setExyperience_year(input.nextInt());
            for (int i =0; i<userEnterTripNum;i++){
                t1 = new Trips();
                t1.getDate();
                System.out.println("Please enter The Trip' ID ");
                t1.setid(input.nextInt());
                System.out.println("Please enter The Max Number ");
                t1.setMaxNumber(input.nextInt());
                System.out.println("Please enter The Trip from where ");
                t1.setFromWhere(input.next());
                System.out.println("Please enter The Trip to where ");
                t1.setToWhere(input.next());
                System.out.println("Please enter The Model plane");
                t1.setModelPlane(input.next());
            }
            t1.addTrip(t1);
            t1.addDriver(t1,d1);
            break;
        case 2:
            System.out.println("Enter Number of Passengers");
            int EnterNumberPAssengers = input.nextInt();
            for (int i =0; i< EnterNumberPAssengers;i++){
                p1 = new Passenger();
                System.out.println("Enter Passengre's Address");
                p1.setAddress(input.next());
                System.out.println("Enter Passengre's Name");
                p1.setName(input.next());
                System.out.println("Enter Passengre's id");
                p1.setId(input.next());
                System.out.println("Enter Passengre's Phone Number");
                p1.setPhoneNumber(input.next());
                System.out.println("Enter Passengre's Age");
                p1.setAge(input.nextInt());
                System.out.println("Enter Passengre's Tall (Cm)");
                p1.setTall(input.next());
                System.out.println("Enter Passengre's (is Have Children) please type true or false");
                p1.setHaveChildren(input.nextBoolean());
            }
            t1.addPassengerTotrip(p1,t1);

            break;
        case 3:
            t1.checkRemovePassenger(p1,t1);
            break;
        case 4:
            t1.AvgPassenger(t1);
            break;
        case 5:
            TripsMethod.Show();
            break;
        case 6:
           TripsMethod.saveData("mohamedFile.txt",Trips.TripsList);
           break;
        case 7:
            System.out.println("Exit");
            break;
    }


}

    }
}
