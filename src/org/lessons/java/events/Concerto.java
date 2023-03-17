package org.lessons.java.events;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento{

    private LocalTime ora;
    private BigDecimal prezzo;

    DecimalFormat df = new DecimalFormat("##.##" + "€");

    public Concerto(String eventTitle, LocalDate eventDate, int totalSitNumber, LocalTime ora, BigDecimal prezzo) {
        super(eventTitle, eventDate, totalSitNumber);
        this.ora = ora;
        this.prezzo = prezzo;
    }

    public LocalTime getOra() {
        return ora;
    }

    public void setOra(LocalTime ora) {
        this.ora = ora;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public String getPrezzoFormatted(){
        return df.format(prezzo);
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "ora=" + ora +
                ", prezzo=" + prezzo +
                '}';
    }
}
