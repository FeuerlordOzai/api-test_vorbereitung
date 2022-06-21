package com.example.test_vorbereitung;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestVorbereitungApplicationTests {

    TestVorbereitung sut = new TestVorbereitung();

    @Test
    void squareTest() {

        int a = 10;
        int expected = 100;

        int result = sut.square(a);

        assertEquals(expected,result);
    }

    @Test
    void fahrenheitTest() {

        int f = 100;
        double expected = 37.77777777777778;

        double result = sut.fahrenheit(f);

        assertEquals(expected,result);
    }

    @Test
    void capitalTest() {

        String c = "Spain";
        String expected = "Madrid";

        String result = sut.LookUp.get(c);

        assertEquals(expected,result);
    }

}
