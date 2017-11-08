package com.company;

public class Main {

    public static void main(String[] args) {
        Hotel hotel = new Hotel(8);


//        System.out.println(hotel);



        try {
            Booking booking1 = hotel.checkIn("company", RoomType.SINGLE, PaymentType.CASH);
            Booking booking2 = hotel.checkIn("Raj", RoomType.SINGLE, PaymentType.CASH);
            Booking booking3 = hotel.checkIn("Aakash", RoomType.DOUBLE, PaymentType.UPI);
            System.out.println(hotel.getOccupiedRooms());

            Booking booking4 = hotel.checkIn("Ravi", RoomType.DOUBLE, PaymentType.CARD);

            Room room = new Room(5,RoomType.SINGLE);
            hotel.stateOfRoom(room);

            System.out.println(hotel.getOccupiedRooms());
            hotel.getAvailableRooms();
            System.out.println(booking1);
            System.out.println(booking2);
            System.out.println(booking3);
            System.out.println(booking4);

            hotel.checkIn("Vinod", RoomType.DOUBLE, PaymentType.CARD);
        } catch (RoomUnAvailableException e) {
            System.out.println("Sorry Requested type of room is unavailable");
        }

    }
}