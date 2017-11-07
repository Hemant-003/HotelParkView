package com.hemant;

public class Room {
    private int roomNumber;
    private RoomType type;
    boolean occupied = false;

    Room(int roomNumber, RoomType type) {
        this.roomNumber = roomNumber;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room - " + "roomNumber=" + roomNumber + ", type=" + type;
    }

    public void book() throws RoomUnAvailableException {
        if (occupied == false)
            occupied = true;
        else throw new RoomUnAvailableException();
    }

    public boolean isAvailable() {
        return !occupied;
    }

    public boolean isType(RoomType type) {
        return this.type.equals(type);
    }
}
