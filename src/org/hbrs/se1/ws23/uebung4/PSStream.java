package org.hbrs.se1.ws23.uebung4;

import org.hbrs.se1.ws23.solutions.uebung3.persistence.PersistenceException;
import org.hbrs.se1.ws23.solutions.uebung3.persistence.PersistenceStrategyStream;

import java.util.List;

public class PSStream {

    PersistenceStrategyStream <UserStory> ps = new PersistenceStrategyStream<>();

    public void save(List<UserStory> l) throws PersistenceException {
        ps.openConnection();
        ps.save(l);
        ps.closeConnection();
    }

    public List<UserStory> load () throws PersistenceException {
        ps.openConnection();
        List<UserStory> l = ps.load();
        //ps.closeConnection()
        return l;
    }

    public void close() throws PersistenceException {
        ps.closeConnection();
    }
}
