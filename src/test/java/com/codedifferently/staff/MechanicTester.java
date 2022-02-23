package com.codedifferently.staff;

import com.codedifferently.vehicles.bikes.MotorCycle;
import com.codedifferently.vehicles.bikes.Ninja;
import com.codedifferently.vehicles.cars.Audi;
import com.codedifferently.vehicles.cars.Car;
import org.junit.jupiter.api.Test;

public class MechanicTester {

    @Test
    public void mechanicTest01(){
        Mechanic<MotorCycle> mechanic = new Mechanic("Tyron");
        Ninja ninja = new Ninja();
        Audi audi = new Audi();
        mechanic.fixEngine(ninja);


        Mechanic<Car> mechanic1 = new Mechanic<>("Bob");
        mechanic1.fixEngine(audi);
    }
}
