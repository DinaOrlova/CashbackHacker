package ru.netology.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void remainToMin1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        int expected = 1000;
        int actual = cashbackHackService.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainToMin999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1;

        int expected = 999;
        int actual = cashbackHackService.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainToMin500() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 500;

        int expected = 500;
        int actual = cashbackHackService.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainToMin1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;

        int expected = 1;
        int actual = cashbackHackService.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainToMin0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remain999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;

        int expected = 999;
        int actual = cashbackHackService.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remain700() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 6300;

        int expected = 700;
        int actual = cashbackHackService.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainToMin1000j5() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        int expected = 1000;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void remainToMin999j5() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1;

        int expected = 999;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void remainToMin500j5() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 500;

        int expected = 500;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void remainToMin1j5() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;

        int expected = 1;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void remainToMin0j5() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void remain999j5() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;

        int expected = 999;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void remain700j5() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 6300;

        int expected = 700;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }
}