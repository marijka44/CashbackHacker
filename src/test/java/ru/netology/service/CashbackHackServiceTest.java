package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {


    @Test
    public void testBuyingBelowTheBorder() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = 100;
        int expected = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void testBuyingAboveTheBorder() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;
        int actual = 800;
        int expected = service.remain(amount);

        assertEquals(actual, expected);


    }
}
