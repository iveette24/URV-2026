public class Poligon
{
  private Punt[] vertexs;
  private int numPunts;

  public Poligon(int mida) {
    vertexs = new Punt[mida];
    numPunts = 0;
  }

  public void afegeixVertex(Punt p) {
    if (numPunts < vertexs.length) {
      vertexs[numPunts] = p;
      numPunts++;
    }
   
  }

  public Punt getPunt (int posicio) {
    Punt aux = null;
    if (posicio < numPunts && posicio >= 0){
      aux = vertexs[posicio].copia();
      
    }
    return aux;

    //En cas de que la posició sigui incorrecta, retornarà null, sino, es retorna el punt.
      
  }

  public void setPunt (int posicio, Punt p) {
      if (posicio < numPunts && posicio >= 0){
        vertexs[posicio] = p.copia();
      }
  }


  @Override
  public String toString() {
    String aux = "";
    for (int i = 0; i < numPunts; i++) {
      aux += "\n" + vertexs[i];
    }
    return aux;
  }

  public Poligon copia() {
    Poligon p = new Poligon(vertexs.length);

    for (int i = 0; i < numPunts; i++) {
      p.afegeixVertex(vertexs[i]); //El métode afegeixVertex ya hace la copia del punto, 
    }                              //por lo que no es necesario hacer p.afegeixVertex(vertexs[i].copia());
    return p;
  }

  public int getPerimetre() {
    int perimetre = 0;
    for (int i = 1; i < numPunts; i++) {
      perimetre += vertexs[i].distancia(vertexs[(i - 1)]);
    }
    perimetre += vertexs[numPunts - 1].distancia(vertexs[0]); // Afegim la distància entre l'últim i el primer punt

    return perimetre;
  }

  

}