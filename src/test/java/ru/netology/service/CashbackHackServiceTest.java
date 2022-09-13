
package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

class CashbackHackServiceTest {
    @Test
    void calcRemainIfMidl() {
        CashbackHackService service = new CashbackHackService();
        int expected = 401;
        int actual = service.remain(10_599);
        assertEquals(actual, expected);
    }
    @Test
    void calcRemainIfZero() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }
    @Test
    void calcRemainIfEqualBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }
}