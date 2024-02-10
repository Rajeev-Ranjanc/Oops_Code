package com.rajeev.singleton;

public class single_ton {
    private single_ton() {

    }

    private static single_ton instance;

    public static single_ton getInstance() {

        if (instance == null) {
//          Check whether only one object is created or not
            instance = new single_ton();
        }

        return instance;
    }

}
