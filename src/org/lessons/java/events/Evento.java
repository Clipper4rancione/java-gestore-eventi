package org.lessons.java.events;

import java.time.LocalDate;

public class Evento {

    // ATTRIBUTES

    private String eventTitle;
    private LocalDate eventDate;
    private int totalSitNumber;
    private int bookedSitNumber = 0;

    // CONSTRUCTOR

    public Evento(String eventTitle, String eventDate, int totalSitNumber, int bookedSitNumber) {

        this.eventTitle = eventTitle;
        this.eventDate = LocalDate.parse(eventDate);
        this.totalSitNumber = totalSitNumber;
        this.bookedSitNumber = bookedSitNumber;
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
}
