package org.hbrs.se1.ws23.uebung9;


import java.util.ArrayList;
import java.util.List;

public class ComplexDokument {

  private List<CoreDokument> coreDokuments = new ArrayList<>();

  public void addDocument(CoreDokument dok) {
    coreDokuments.add(dok);
  }
  public void removeDokument(CoreDokument dok) {
    coreDokuments.remove(dok);
  }
}
