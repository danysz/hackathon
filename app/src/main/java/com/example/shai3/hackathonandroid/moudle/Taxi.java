package com.example.shai3.hackathonandroid.moudle;

import java.util.ArrayList;

public class Taxi {
    private int passengerCount;
    private String location;
    private String destination;
    private Boolean inMotion;
    public Taxi(String location, String dest){
       this.passengerCount=7;
        this.location=location;
         this.inMotion=false;
        this.destination= dest;
    }
    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Boolean getInMotion() {
        return inMotion;
    }

    public void setInMotion(Boolean inMotion) {
        this.inMotion = inMotion;
    }
};




