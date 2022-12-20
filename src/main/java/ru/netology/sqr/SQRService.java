package ru.netology.sqr;

public class SQRService {
    public int calcSquares (int min, int max) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int ii = i * i;
            if (ii >= min && ii <= max) {
                counter++;
            }
        }
        return counter;
    }
}
