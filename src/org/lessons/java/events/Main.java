package org.lessons.java.events;

import java.math.BigDecimal;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Nome dell'evento: ");
        String eventTitle = scan.nextLine();
        System.out.print("Anno dell'evento: ");
        int year = Integer.parseInt(scan.nextLine());
        System.out.print("Mese dell'evento: ");
        int month = Integer.parseInt(scan.nextLine());
        System.out.print("Giorno dell'evento: ");
        int day = Integer.parseInt(scan.nextLine());
        LocalDate eventDate = LocalDate.of(year, month, day);
        System.out.print("A che ora si terrà l'evento? (indica solo l'ora, no minuti, no secondi) ");
        int hour = Integer.parseInt(scan.nextLine());
        LocalTime eventHour = LocalTime.of(hour, 0, 0);
        System.out.print("Quanto costerà il biglietto: ");
        int price = Integer.parseInt(scan.nextLine());
        System.out.print("Numero di posti disponibili: ");
        int totalSitNumber = Integer.parseInt(scan.nextLine());



        try {
            Evento event = new Evento(eventTitle, eventDate, totalSitNumber);
            System.out.println("Il tuo evento: " + event);

            System.out.print("Quanti biglietti vuoi acquistare? ");
            int bookingTicket = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < bookingTicket; i++) {
                event.prenota();
            }
            System.out.println("Hai prenotato " + event.getBookedSitNumber() + " biglietti su " + event.getTotalSitNumber());


            System.out.print("Quanti biglietti vuoi disdire? ");
            int canceledTicket = Integer.parseInt(scan.nextLine());

                    for (int i = 0; i < canceledTicket; i++) {
                        event.disdici();
                    }
                    System.out.println("Hai cancellato la prenotazione di " + canceledTicket + " biglietti");

            System.out.println("Posti prenotati: " + event.getBookedSitNumber() + " su " + event.getTotalSitNumber() + " posti");

        } catch (IllegalArgumentException | DateTimeException e) {
            System.out.println(e.getMessage());
        }

        Concerto conc = new Concerto(eventTitle, eventDate, totalSitNumber, eventHour, BigDecimal.valueOf(price));

        System.out.println("Complimenti! hai completato l'acquisto del biglietto, eccoti il resoconto: ");
        System.out.println();
        System.out.println(conc);
        System.out.println("***************");
        System.out.println(eventTitle + " alle " + eventHour + " il " + eventDate + " Prezzo del biglietto cad. " + price + "€");





        scan.close();




    }
}
