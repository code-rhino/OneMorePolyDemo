package com.codedifferently.shops;

import com.codedifferently.staff.Mechanic;
import com.codedifferently.vehicles.bikes.MotorCycle;

public class BikeShop {
    private Mechanic<MotorCycle> mechanic;

    public BikeShop(){
        this.mechanic = new Mechanic<>("Abdul");
    }
}
