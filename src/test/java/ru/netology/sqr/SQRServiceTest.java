package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void service() {
        SQRService service = new SQRService();
        int actual = service.calcSqr(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

}