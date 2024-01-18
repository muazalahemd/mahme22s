package org.hbrs.se1.ws23.uebung9;

public class TextDokument extends CoreDokument {
  private String content;
  private Encoding encoding;

  public TextDokument(String inhalt, Encoding e) {
    content = inhalt;
    encoding = e;
  }
}
