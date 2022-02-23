package com.codedifferently.staff;

import com.codedifferently.interfaces.EngineMaintenance;
import com.codedifferently.interfaces.OilChanger;

public class Mechanic<T> extends Staff implements OilChanger<T>, EngineMaintenance<T> {
    public Mechanic(String name) {
        super(name);
    }

    @Override
    public void changeOil(T vehicle) {

    }

    @Override
    public String fixEngine(T vehicle) {
        return vehicle.toString();
    }
}
