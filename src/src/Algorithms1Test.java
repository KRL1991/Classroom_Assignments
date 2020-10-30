package src;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Algorithms1Test {

    @org.junit.jupiter.api.Test
    void randomBoyName() {
        Algorithms1 algorithms1 = new Algorithms1();
        String randomName = algorithms1.randomBoyName();
        assertEquals(randomName,"Faktor");


    }
}