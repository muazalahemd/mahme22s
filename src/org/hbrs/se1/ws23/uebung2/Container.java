package org.hbrs.se1.ws23.uebung2;

import java.util.ArrayList;

public class Container {

    ArrayList <Member> myList = new ArrayList<>();


    public void addMember(Member m) throws ContainerException {

        for (Member i : myList){
            if(i.getID().equals(m.getID())) {
            throw new ContainerException("Das Member-Objekt mit der ID " + m.getID()
                    + " ist bereits vorhanden!");
            }
        }
        myList.add(m);
    }

    public void dump(){
        myList.forEach((n) -> System.out.println(n));
    }

    public int size(){
        return myList.size();
    }

    public String deleteMember(Integer id){
        String deleted;
        for (Member n: myList) {
            if(n.getID().equals(id)){
                deleted = "Diese ID " + id +" wird entfernt...";
                myList.remove(n);
                return deleted;
            }
        }

        return "Diese ID " + id + " ist nicht vorhanden";
    }


}
