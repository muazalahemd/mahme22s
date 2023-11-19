package org.hbrs.se1.ws23.uebung4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utilties {



    // Sortieren
    public static List<UserStory> sort(List<UserStory> liste){
        Collections.sort(liste);
    return liste;
    }


    //Suche nach vorhandenen Titels!
    public static List<UserStory> projektSearch(List<UserStory> l, String n) {
        List<UserStory> o = new ArrayList<>();
        for (UserStory e: l){
            if(e.getProject().equals(n))
                o.add(e);
        }
        return o;
    }
}
