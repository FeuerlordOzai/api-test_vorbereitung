package com.example.test_vorbereitung;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestVorbereitungContoller {

    TestVorbereitung t = new TestVorbereitung();

    @RequestMapping("/square")
    public int square(@RequestParam int a)
    {
        return t.square(a);
    }

}
