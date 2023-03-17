package org.lessons.java.events;

import java.time.DateTimeException;
import java.time.LocalDate;
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

        } catch (IllegalArgumentException | DateTimeException e) {
            System.out.println(e.getMessage());
        }







        scan.close();




    }
}
