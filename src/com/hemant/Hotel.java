package com.hemant;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name = "Park View Hotel";
    private List<Room> rooms = new ArrayList<Room>();

    public Hotel(int numberOfRooms) {
        RoomType type;
        for (int i = 0; i < numberOfRooms; i++) {
            if (i % 2 == 0)
                type = RoomType.SINGLE;
            else type = RoomType.DOUBLE;
            rooms.add(new Room(i + 1, type));
        }
    }

    public void checkout(Customer guest){
        // Free room
    }

    public void getOccupiedRooms(){

    }

    public void listRooms(){

    }

    public boolean isAvailable(int roomNumber){
        return false;
    }

    @Override
    public String toString() {
        StringBuilder toStringResult = new StringBuilder("Welcome to " + name + "\n");
        for (Room room : rooms) {
            toStringResult.append(room.toString()).append("\n");
        }
        return toStringResult.toString();
    }

    Booking checkIn(String name, RoomType type, PaymentType paymentType) throws RoomUnAvailableException {
        return new Booking(new Customer(name), getNextAvailableRoom(type), paymentType);
    }

    private Room getNextAvailableRoom(RoomType type) throws RoomUnAvailableException {
        for (Room room : rooms) {
            if (room.isAvailable() && room.isType(type)){
                room.book();
                return room;
            }
        }
        throw new RoomUnAvailableException();
    }
}
