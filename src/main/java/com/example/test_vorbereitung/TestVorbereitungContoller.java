package com.example.test_vorbereitung;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TestVorbereitungContoller {

    HashMap<String,String> LookUp = new HashMap<>(){{put("Austria","Vienna");put("Spain","Madrid");put("Deutschland","Berlin");}};
    TestVorbereitung t = new TestVorbereitung();

    @RequestMapping("/square")
    public int square(@RequestParam int a)
    {
        return t.square(a);
    }

    @RequestMapping("/fahrenheit")
    public double fahrenheit(@RequestParam double f)
    {
        return t.fahrenheit(f);
    }

    @RequestMapping("/capital")
    public String capital(@RequestParam String c)
    {
        return LookUp.get(c);
    }

}
