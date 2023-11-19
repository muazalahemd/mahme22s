package org.hbrs.se1.ws23.uebung3.persistence;

import java.util.List;

public class MemberView {

    public void dump( List<Member> liste ) {
        System.out.println("Ausgabe aller Member-Objekte: ");
        // Loesung mit For each:
        for (Member p : liste) {
            System.out.println("ID: " + p.toString() );
        }
    }
}
