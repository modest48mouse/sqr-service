package ru.netology;
import ru.netology.javaqasqr.services.SqrService;

public class Main {
    public static void main(String[] args) {
        SqrService service = new SqrService();
        System.out.println(service.calcSqr(200, 300));
    }
}