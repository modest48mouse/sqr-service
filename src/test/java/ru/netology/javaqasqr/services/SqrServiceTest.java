package ru.netology.javaqasqr.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.javaqasqr.services.SqrService;

public class SqrServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")

    public void shouldCalcSqr(int start, int end, int expected) {
        SqrService service = new SqrService();

        //int expected = 3;
        int actual = service.calcSqr(200, 300);

        Assertions.assertEquals(expected, actual);
    }
}
