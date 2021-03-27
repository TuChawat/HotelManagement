package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;

public class Hotel {
    private int rating;
    private String name;
    private Map<CustmerType, Rate> rate;

    public Hotel(String name, int rating, HashMap<CustmerType, Rate> rate){
        this.name = name;
        this.rating = rating;
        this.rate = rate;
    }
}
