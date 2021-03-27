package com.bridgelabz;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;

public class HotelManagementTest {
    private Hotel lakewood;
    private Hotel bridgewood;
    private Hotel ridgewood;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        HotelManagement hotelManagement = new HotelManagement();

        HashMap<CustmerType, Rate> custmerTypeRateMap = new HashMap<>();
        custmerTypeRateMap.put(CustmerType.REGULAR, new Rate(110,90));
        custmerTypeRateMap.put(CustmerType.REWARD, new Rate(80,80));
        lakewood = new Hotel("Lakewood",3, custmerTypeRateMap);

        custmerTypeRateMap = new HashMap<>();
        custmerTypeRateMap.put(CustmerType.REGULAR, new Rate(160,40));
        custmerTypeRateMap.put(CustmerType.REWARD, new Rate(110,50));
        bridgewood = new Hotel("Bridgewood",4, custmerTypeRateMap);

        custmerTypeRateMap = new HashMap<>();
        custmerTypeRateMap.put(CustmerType.REGULAR, new Rate(220,150));
        custmerTypeRateMap.put(CustmerType.REWARD, new Rate(100,40));
        ridgewood = new Hotel("Ridgewood",3, custmerTypeRateMap);
        hotelManagement.addHotel(lakewood);
        hotelManagement.addHotel(bridgewood);
        hotelManagement.addHotel(ridgewood);
    }

    @Test
    public void whenCalledDisplayMethod_shouldDisplayWelcomeMessage(){
        HotelManagement.welcomeCustmer();
    }
}
