package org.hbrs.se1.ws23.uebung9;


public class GraphicDocument extends CoreDokument {
  private String url;


  public GraphicDocument(String u) {
    url = u;
  }

  public String getUrl() {
    return url;
  }
  public void setUrl(String u) {
    url = u;
  }
}
