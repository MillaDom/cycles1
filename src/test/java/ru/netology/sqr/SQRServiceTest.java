package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void CalculateSquaresInInterval() {
        SQRService service = new SQRService();
        int actual = service.calcSquares(200, 300);
        int expected = 3;
        assertEquals(expected, actual);

    }

    @Test
    public void CalculateSquaresOutIntervalPlusMin() {
        SQRService service = new SQRService();
        int actual = service.calcSquares(0, 100);
        int expected = 1;
        assertEquals(expected, actual);

    }

    @Test
    public void CalculateSquaresOutIntervalPlusMax() {
        SQRService service = new SQRService();
        int actual = service.calcSquares(9801, 100000);
        int expected = 1;
        assertEquals(expected, actual);

    }

    @Test
    public void CalculateSquaresOutIntervalMin() {
        SQRService service = new SQRService();
        int actual = service.calcSquares(0, 99);
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void CalculateSquaresOutIntervalMax() {
        SQRService service = new SQRService();
        int actual = service.calcSquares(9802, 99999);
        int expected = 0;
        assertEquals(expected, actual);

    }
}