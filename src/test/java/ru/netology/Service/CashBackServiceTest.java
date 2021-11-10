package ru.netology.Service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackServiceTest {
    @Test
    public void ShouldCheckCashbackAmountLessThan1000() {
        CashBackService service = new CashBackService();
        int actual = service.remain(400);
        int expected = 600;
        assertEquals(actual, expected);
    }

    @Test
    public void ShouldCheckCashbackAmountMoreThan1000() {
        CashBackService service = new CashBackService();
        int actual = service.remain(1600);
        int expected = 400;
        assertEquals(actual, expected);
    }
    @Test
    public void ShouldCheckCashbackAmountEqual1000() {
        CashBackService service = new CashBackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
    @Test
    public void ShouldCheckCashbackAmountEqualZero() {
        CashBackService service = new CashBackService();
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }
}