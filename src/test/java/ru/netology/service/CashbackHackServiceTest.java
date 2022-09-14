package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    int expected;
    int actual;
    @Test
    public void calcRemainIfMidl() {
        expected = 401;
        actual = service.remain(10_599);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void calcRemainIfZero() {
        expected = 1000;
        actual = service.remain(0);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void calcRemainIfEqualBoundary() {
        expected = 0;
        actual = service.remain(1000);
        Assert.assertEquals(expected,actual);
    }

}
