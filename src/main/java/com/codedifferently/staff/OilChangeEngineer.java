package com.codedifferently.staff;

import com.codedifferently.interfaces.OilChanger;
import com.codedifferently.interfaces.Washer;

public class OilChangeEngineer<T> extends Staff implements Washer<T>, OilChanger<T> {
    public OilChangeEngineer(String name) {
        super(name);
    }

    @Override
    public void changeOil(T vehicle) {

    }

    @Override
    public void wash(T vehicle) {

    }
}
