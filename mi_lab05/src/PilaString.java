public class PilaString {
    private int cim;
    private String[] elements;

    //Pedir explicación de todo el programa 

    public PilaString(int tamany) {
        cim = -1;
        elements = new String[tamany];
    }

    public void apilar(String valor) { //Apila de abajo para arriba los valores 
        if (cim < elements.length - 1) {
            cim++;
            elements[cim] = valor;
        }
    }

    public String desapilar() { //Desapila de arriba para abajo los valores
        String aux;
        if (cim > -1) {
            aux = elements[cim];
            cim--;
            return aux;
        } else {
            return null;
        }
    }

    public String cim() { //Devuelve lo que está en la cima de la pila 
        if (cim != -1) return elements[cim];
        else return null;
    }

    public boolean pilaBuida() { //Si la pila está vacia o no , devuelve boolean 
        if (cim == -1) return true;
        else return false;
    }

    public int tamanyPila() { //Devuelve el tamaño de la pila
        return (cim + 1);
    }
}
