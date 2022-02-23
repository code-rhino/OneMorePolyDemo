package com.codedifferently.staff;

import com.codedifferently.interfaces.Washer;

public class DetailSpecialist<T> extends Staff implements Washer<T> {
    public DetailSpecialist(String name) {
        super(name);
    }

    @Override
    public void wash(T vehicle) {

    }
}
