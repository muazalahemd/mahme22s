package org.hbrs.se1.ws23.uebung3.persistence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    Member m1 ;
    Member m2, m3;
    Container c;
    @BeforeEach
    void setUp() throws IOException {
        c = Container.getInstance();
        m1  = new ConcreteMember(1);
        m2 =  new ConcreteMember(2);
        m3 =  new ConcreteMember(3);
    }
    @Test
    void strore() throws ContainerException, IOException, PersistenceException {
        c.addMember(m1);
        c.addMember(m2);
        c.addMember(m3);
        PersistenceStrategyStream<Member> ps = new PersistenceStrategyStream<>();
        c.strore();
    }

    @Test
    void load() {
    }
}