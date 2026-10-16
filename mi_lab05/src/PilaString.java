public class PilaString {
    private int cim;
    private String[] elements;

    public PilaString(int tamany) {
        cim = -1;
        elements = new String[tamany];
    }

    public void apilar(String valor) {
        if (cim < elements.length - 1) {
            cim++;
            elements[cim] = valor;
        }
    }

    public String desapilar() {
        String aux;
        if (cim > -1) {
            aux = elements[cim];
            cim--;
            return aux;
        } else {
            return null;
        }
    }

    public String cim() {
        if (cim != -1) return elements[cim];
        else return null;
    }

    public boolean pilaBuida() {
        if (cim == -1) return true;
        else return false;
    }

    public int tamanyPila() {
        return (cim + 1);
    }
}
