package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    @Test
    public void testPurchaseZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = 1000;
        int expected = service.remain(amount);

        assertEquals(actual, expected);

    }
    @Test
    public void testPurchaseAtTheBorderThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = 0;
        int expected = service.remain(amount);

        assertEquals(actual, expected);

    }
}