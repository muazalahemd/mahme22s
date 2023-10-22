package org.hbrs.se1.ws23.uebung2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    Container c;
    Member m1;
    Member m2;
    Member m3;
    Member m4;
    Member m5;

    @BeforeEach
    void neu() {
        c = new Container(); // Initialize the class-level field
        m1 = new ConcreteMember(1); // Initialize the class-level field
        m2 = new ConcreteMember(2); // Initialize the class-level field
        m3 = new ConcreteMember(3); // Initialize the class-level field
        m4 = new ConcreteMember(4); // Initialize the class-level field
        m5 = new ConcreteMember(4); // Initialize the class-level field
    }


    @Test
    void addMember() throws ContainerException {

        c.addMember(m1);
        c.addMember(m2);
        c.addMember(m3);
        c.addMember(m4);
        assertThrows(ContainerException.class, () -> c.addMember(m5));
    }

    @Test
    void dump() throws ContainerException {
        c.addMember(m1);
        c.addMember(m2);
        c.addMember(m3);
        c.addMember(m4);
        c.dump();
    }

    @Test
    void size() throws ContainerException {
        assertEquals(0,c.size());

        c.addMember(m1);
        c.addMember(m2);

        assertEquals(2,c.size());

        c.deleteMember(1);

        assertEquals(1,c.size());

        c.addMember(m3);
        c.addMember(m4);

        assertEquals(3,c.size());

        c.deleteMember(3);

        assertEquals(2,c.size());

        c.deleteMember(4);
        c.deleteMember(2);

        assertEquals(0,c.size());
    }

    @Test
    void deleteMember() throws ContainerException {
        c.addMember(m1);
        c.addMember(m2);
        c.addMember(m3);
        c.addMember(m4);

        assertEquals("Diese ID " + 4 +" wird entfernt...", c.deleteMember(4));

        assertEquals(3,c.size());

        assertEquals("Diese ID " + 4 + " ist nicht vorhanden",c.deleteMember(4));
        c.deleteMember(3);
        c.deleteMember(2);
        c.deleteMember(1);

        assertEquals("Diese ID " + 4 + " ist nicht vorhanden",c.deleteMember(4));



    }
}