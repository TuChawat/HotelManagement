package com.bridgelabz;

import com.sun.deploy.net.MessageHeader;

import java.util.List;

public class HotelManagement {

    private List<Hotel> hotels;

    public static void welcomeCustmer(){
        System.out.println("Welcome to Hotel Management System");
    }

    public boolean addHotel(Hotel hotel) {
        return this.hotels.add(hotel);
    }

}
