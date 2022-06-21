package com.example.test_vorbereitung;

import java.util.HashMap;

public class TestVorbereitung {

    HashMap<String,String> LookUp = new HashMap<>(){{put("Austria","Vienna");put("Spain","Madrid");put("Germany","Berlin");}};
    public int square(int a)
    {
        return a*a;
    }

    public double fahrenheit(double f)
    {
        return ((f-32)*(5/9d));
    }

}
