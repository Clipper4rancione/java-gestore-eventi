package org.lessons.java.events;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {

    // ATTRIBUTES

    private String eventTitle;
    private LocalDate eventDate;
    private int totalSitNumber;
    private int bookedSitNumber = 0;

    // CONSTRUCTOR

    public Evento(String eventTitle, LocalDate eventDate, int totalSitNumber) {

        this.eventTitle = eventTitle;

        // CONTROLLO SULLA DATA E SUI POSTI A SEDERE
        if (eventDate.isBefore(LocalDate.now())) {
            throw new DateTimeException("Impossibile creare l'evento in una data passata.");
        }
        if (totalSitNumber < 0){
            throw new IllegalArgumentException("Il numero di posti totali non può essere negativo. Inserisci un numero superiore a 0");
        }

        this.eventDate = eventDate;
        this.totalSitNumber = totalSitNumber;

    }

    // GETTERS AND SETTERS

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public int getTotalSitNumber() {
        return totalSitNumber;
    }

    public int getBookedSitNumber() {
        return bookedSitNumber;
    }

    public String getFormattedDate(){
        return eventDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    // METHODS

    public void prenota(){
        if (eventDate.isBefore(eventDate)){
            throw new DateTimeException("L'evento che stai cercando di prenotare è già passato");
        }
        if (bookedSitNumber >= totalSitNumber){
            throw new IllegalArgumentException("L'evento è Sold Out. :(" );
        }
        bookedSitNumber++;
    }
    public void disdici(){
        if (eventDate.isBefore(eventDate)){
            throw new DateTimeException("L'evento che stai cercando di disdire è già passato");
        }
        if ( bookedSitNumber == 0){
            throw new IllegalArgumentException("Al momento non ci sono prenotazioni");
        }
        bookedSitNumber--;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "eventTitle='" + eventTitle + '\'' +
                ", eventDate=" + getFormattedDate() +
                ", totalSitNumber=" + totalSitNumber +
                ", bookedSitNumber=" + bookedSitNumber +
                '}';
    }
}
