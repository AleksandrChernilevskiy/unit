package ru.netology;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldLimitValue() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        AssertJUnit.assertEquals(actual, expected);
    }

    @Test
    public void shouldUnderLimitValue() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 0;

        AssertJUnit.assertEquals(actual, expected);
    }

    @Test
    public void shouldBoundaryValue() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        AssertJUnit.assertEquals(actual, expected);
    }

    @Test
    public void shouldZeroValue() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        AssertJUnit.assertEquals(actual, expected);
    }
}