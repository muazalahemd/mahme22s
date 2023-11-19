package org.hbrs.se1.ws23.uebung3.persistence;

public class ConcreteMember implements Member {


    private Member m;
    private Integer  ID;
    public ConcreteMember (Integer id) {
        ID = id;
    }

    public String toString() {
        return "Member (ID [" + getID() +"])";
    }


    @Override
    public Integer getID() {
        return ID;
    }
}
