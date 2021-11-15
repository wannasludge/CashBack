package ru.netology.Service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackServiceTest {
    @Test
    public void ShouldCheckCashbackAmountLessThan1000() {
        CashBackService service = new CashBackService();
        int actual = service.remain(400);
        int expected = 600;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCheckCashbackAmountMoreThan1000() {
        CashBackService service = new CashBackService();
        int actual = service.remain(1600);
        int expected = 400;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCheckCashbackAmountEqual1000() {
        CashBackService service = new CashBackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCheckCashbackAmountEqualZero() {
        CashBackService service = new CashBackService();
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }
}