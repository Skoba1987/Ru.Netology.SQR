package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void test() {
        StatsService service = new StatsService();
        long[]sales = {8,15,13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 8+15+13+15+17+20+19+20+7+14+14+18;
        Assertions.assertEquals(expected, actual);
    }

    @Test
            public void test () {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.countBelowAvg(sales);
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

}