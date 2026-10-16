public class Diccionari {

    //Atributs 

    private int nParaules;
    private Paraula[] llista; //Llista de tipus paraula 

    //Constructor (mètode per donar valor inicial als atributs) que crea la llista amb la quantitat máxima indicada

    public Diccionari (int n) {
        this.nParaules = 0; 
        this.llista = new Paraula[n];
    }

    //Retorna la quantitat d'entrades usades actualment

    public int numParaules () {
        return nParaules;

    }

    //Retorna la paraula usada en l'índex demanat (i)

    public Paraula paraulaIessima (int i) {
        if (i >= 0 && i < nParaules) {
            return llista[i];
        }
        return null;

    }

    //Mètode per afegir paraules ordenades alfabèticament com a la versió dos 

    public boolean afegirParaula (Paraula p) {
        //Verifiquem si la llista està plena

        if (nParaules >= llista.length) {
            return false;

        }

        //Comprovar si existeix la paraula igual amb la definició igual

        for (int i = 0; i < nParaules; i++) {
            if (llista[i].esAquestaParaula(p.getNom()) && llista[i].teAquestaDefinicio(p.getDefinicio())) {
                //Si ja existeix la definició exacta, no fem res i sortim
                
                return false;
            }
        }

        //Cerca de la posició d'inserció alfabètica

        int pos = 0;
        while (pos < nParaules && p.getNom().compareToIgnoreCase(llista[pos].getNom()) > 0) {
            pos++;
        }

        //Desplacem els elements cap a la dreta per fer lloc

        for (int i = nParaules; i > pos; i--) {
            llista[i] = llista[i - 1];
        }

        //Insertem la còpia de la paraula i incrementem el comptador

        llista[pos] = p.copia();
        nParaules++;

        return true;

    }

    //Mètode per esborrar una paraula amb totes les seves definicions

    public boolean esborrarParaula (String nom) {
        boolean trobat = false;
        int i = 0;

        while (i < nParaules) {
            if (llista[i].esAquestaParaula(nom)) {
                trobat = true;
                //Desplacem tots els elements a l'esquerra per cobrir el buit
                for (int j = i; j < nParaules - 1; j++) {
                    llista[j] = llista[j + 1];
                }
                llista[nParaules - 1] = null;
                nParaules--;
                //No incrementem 'i' perquè la nova paraula a la posició 'i' s'ha de comprovar
            } else {
                i++;
            }
        }

        return trobat;

    }

    //Mètode per consultar el número de definicions d'una paraula

    public int numDefinicions (String nom) {
        int comptador = 0;
        for (int i = 0; i < nParaules; i++) {
            if (llista[i].esAquestaParaula(nom)) {
                comptador++;
            }
        }
        return comptador;

    }

    //Mètode per consultar la definició i-èssima d'una paraula

    public String definicioIessima (String nom, int i) {
        int comptador = 0;
        for (int j = 0; j < nParaules; j++) {
            if (llista[j].esAquestaParaula(nom)) {
                comptador++;
                if (comptador == i) {
                    return llista[j].getDefinicio();
                }
            }
        }
        return null;

    }

    //Mètode per consultar totes les definicions d'una paraula

    public String obtenirDefinicions (String nom) {
        String res = "";
        int comptador = 1;
        for (int i = 0; i < nParaules; i++) {
            if (llista[i].esAquestaParaula(nom)) {
                res = res + comptador + ". " + llista[i].getDefinicio() + "\n";
                comptador++;
            }
        }
        if (comptador == 1) {
            return "No s'ha trobat cap definició per a la paraula: " + nom;
        }
        return res;

    }

    //Mètode toString per mostrar el contingut del diccionari

    public String toString () {
        String res = "";
        for (int i = 0; i < nParaules; i++) {
            res = res + llista[i].toString() + "\n";
        }
        return res;

    }

}