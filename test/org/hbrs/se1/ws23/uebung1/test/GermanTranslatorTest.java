package org.hbrs.se1.ws23.uebung1.test;

import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    @Test
    void aPositiveTest() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(1);

        assertEquals(value, "eins");

        value = translator.translateNumber(5);

        assertEquals(value, "fuenf");

        value = translator.translateNumber(10);

        assertEquals(value, "zehn");
    }


    @Test
    void aNegativerTest() {
        GermanTranslator translator = new GermanTranslator();

        int number = -1;
        String n =( "Übersetzung der Zahl "+ number +" nicht möglich (Versionsnummer des " +
                "Translators: " + translator.version +") ");

        String value = translator.translateNumber(number);
        assertEquals(value, n);


        number = 11;
        value = translator.translateNumber(number);
        n = ( "Übersetzung der Zahl "+ number +" nicht möglich (Versionsnummer des " +
                "Translators: " + translator.version +") ");
        assertEquals(value, n);


    }
    @Test
    void aGrenzwertTest(){
        String n ="";
        int number = 0;
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(number);
        n =( "Übersetzung der Zahl "+ number +" nicht möglich (Versionsnummer des " +
                "Translators: " + translator.version +") ");

        assertEquals(value, n);
        }
}