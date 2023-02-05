package ru.netology.javaqasqr.services;

public class SqrService {

    /*
     10 11 12 13 14 15 16 17 18 .... 99
     100 .. start ... end ...
     100 .. 200 ... 300 ...
     */
    public int calcSqr(int start, int end) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i > end) {
                break;
            }
            if (i * i >= start) {
                count = count + 1;
            }
        }
        return count;
    }
}

    /*
    public int foo(int start, int end) {
        int i = 10;
        int count = 0;
        while (i <= 99) {
            if (i * i > end) {
                break;
            }
            if (i * i >= start) {
                count = count + 1;
            }
            i = i + 1;
        }
        return count;
    }
        */
