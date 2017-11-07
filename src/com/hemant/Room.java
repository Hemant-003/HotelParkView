package com.hemant;

public class Room {
    private int roomNumber;
    private RoomType type;

    Room(int roomNumber, RoomType type) {
        this.roomNumber = roomNumber;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room - " + "roomNumber=" + roomNumber + ", type=" + type;
    }
}
