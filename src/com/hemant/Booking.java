package com.hemant;

public class Booking {
    Customer customer;
    Room room;
    PaymentType paymentType;

    public Booking(Customer customer, Room room, PaymentType paymentType) {

        this.customer = customer;
        this.room = room;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Booking " + "customer=" + customer + ", room=" + room +
                ", paymentType=" + paymentType;

    }
}
