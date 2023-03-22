package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void EenEnEen_telop_geeftTweeTerug(){
        int getal1 = 1;
        int getal2 = 1;
        Main calculator = new Main();
        int resultaat = calculator.telop(getal1, getal2);
        Assertions.assertEquals(2, resultaat);
    }

    public void ZevenEnTwee_telop_geeftNegenTerug(){
        int getal1 = 7;
        int getal2 = 2;
        Main calculator = new Main();
        int resultaat = calculator.telop(getal1, getal2);
        Assertions.assertEquals(2, resultaat);
    }

    public void ZevenEnTwee_telop_geeftNietDrieTerug(){
        int getal1 = 7;
        int getal2 = 2;
        Main calculator = new Main();
        int resultaat = calculator.telop(getal1, getal2);
        Assertions.assertEquals(3, resultaat);
    }

    public void ZevenEnNegen_telop_geeftNietDrieTerug(){
        int getal1 = 7;
        int getal2 = 9;
        Main calculator = new Main();
        int resultaat = calculator.telop(getal1, getal2);
        Assertions.assertEquals(3, resultaat);
    }
}
