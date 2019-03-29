package com.example.shai3.hackathonandroid.moudle;

public class OrderStatus {
    private Taxi taxi;
    private User user;

    public OrderStatus(Taxi taxi, User user) {
        this.taxi = taxi;
        this.user = user;
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
