package org.lessons.java.events;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Evento prova = new Evento("Clementino - Palapartenope", LocalDate.of(2023, 11, 21), 6300);
        System.out.println(prova);
    }
}
