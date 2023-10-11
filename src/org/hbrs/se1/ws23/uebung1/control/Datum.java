package org.hbrs.se1.ws23.uebung1.control;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Locale;

public class Datum {

    public static String getDatum() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM/yyyy", Locale.GERMAN);
        LocalDateTime now = LocalDateTime.now();
        String n = dtf.format(now);
        n = n.replace(".", "");
        return n;
    }
}
