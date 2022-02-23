package com.codedifferently.shops;

import com.codedifferently.staff.Mechanic;
import com.codedifferently.vehicles.cars.Car;

public class CarShop {
    private Mechanic<Car> mechanic;

    public CarShop(){
        this.mechanic = new Mechanic<>("Abdul");
    }

    public CarShop(Mechanic<Car> mechanic){
        this.mechanic = mechanic;
    }
}
