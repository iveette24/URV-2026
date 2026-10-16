import java.util.Scanner;

public class UsaDiccionari {

    static Scanner teclat = new Scanner(System.in);

    public static void main(String[] args) {
        int opcio;
        Diccionari diccio = new Diccionari(30); // Definim un diccionari per a 30 paraules

        // Afegim les paraules de prova inicials
        afegirParaulesInicials(diccio);

        mostraMenu();
        opcio = Integer.parseInt(teclat.nextLine());

        while (opcio != 7) {
            switch (opcio) {
                case 1:
                    opcio1(diccio);
                    break;
                case 2:
                    opcio2(diccio);
                    break;
                case 3:
                    opcio3(diccio);
                    break;
                case 4:
                    opcio4(diccio);
                    break;
                case 5:
                    opcio5(diccio);
                    break;
                case 6:
                    opcio6(diccio);
                    break;
            }
            mostraMenu();
            opcio = Integer.parseInt(teclat.nextLine());
        }
    }

    private static void afegirParaulesInicials(Diccionari diccio) {
        Paraula p = new Paraula("Vector", "Element d'un espai vectorial amb tantes components com dimensió de l'espai");
        diccio.afegirParaula(p);

        p.setDefinicio("Estructura de dades formada per un conjunt d'elements que són accessibles pel seu índex");
        diccio.afegirParaula(p);

        // Provem que si afegim una definició repetida, no s'afegeix
        diccio.afegirParaula(p);
        diccio.afegirParaula(p);

        diccio.afegirParaula(new Paraula("Arbre", "Estructura de dades no lineal"));
        diccio.afegirParaula(new Paraula("Taula de dispersió", "Estructura de dades no lineal"));
        diccio.afegirParaula(new Paraula("Arbre", "Planta"));
    }

    public static void mostraMenu() {
        System.out.println("\n\nOpcions del menu:");
        System.out.println("\n\t1. Afegir una paraula al diccionari");
        System.out.println("\t2. Esborrar una paraula");
        System.out.println("\t3. Mostrar el contingut del diccionari");
        System.out.println("\t4. Consultar el número de definicions d'una paraula");
        System.out.println("\t5. Consultar la definicio i-essima d'una paraula");
        System.out.println("\t6. Consultar totes les definicions d'una paraula");
        System.out.println("\t7. Sortir");
        System.out.print("\n\t\t\tIndica opcio:\n");
    }

    // 1. Afegir una paraula al diccionari
    public static void opcio1(Diccionari dic) {
        String nom, definicio;

        System.out.print("\n\n\tIndica paraula a afegir:\t");
        nom = teclat.nextLine();

        System.out.print("\tIndica la definició:\t");
        definicio = teclat.nextLine();

        Paraula p = new Paraula(nom, definicio);
        boolean afegit = dic.afegirParaula(p);

        if (afegit) {
            System.out.println("\tLa paraula s'ha afegit correctament.");
        } else {
            System.out.println("\tNo s'ha pogut afegir (diccionari ple o definició duplicada).");
        }
    }

    // 2. Esborrar una paraula
    public static void opcio2(Diccionari dic) {
        String paraula;

        System.out.print("\n\n\tIndica paraula a esborrar:\t");
        paraula = teclat.nextLine();

        boolean esborrat = dic.esborrarParaula(paraula);

        if (esborrat) {
            System.out.println("\tS'ha esborrat la paraula i totes les seves definicions.");
        } else {
            System.out.println("\tNo s'ha trobat la paraula al diccionari.");
        }
    }

    // 3. Mostrar el contingut del diccionari
    public static void opcio3(Diccionari dic) {
        System.out.println("\nEl contingut del diccionari és:\n" + dic);
    }

    // 4. Consultar el número de definicions d'una paraula
    public static void opcio4(Diccionari dic) {
        String paraula;

        System.out.print("\n\n\tIndica paraula:\t");
        paraula = teclat.nextLine();

        int numDefs = dic.numDefinicions(paraula);
        System.out.println("\tLa paraula '" + paraula + "' té " + numDefs + " definició/ons.");
    }

    // 5. Consultar la definicio i-essima d'una paraula
    public static void opcio5(Diccionari dic) {
        int posicio;
        String paraula;

        System.out.print("\n\n\tIndica paraula:\t");
        paraula = teclat.nextLine();

        int numDefs = dic.numDefinicions(paraula);
        System.out.println("\tAquesta paraula té actualment " + numDefs + " definició/ons.");

        if (numDefs > 0) {
            System.out.print("\tIndica número de definició a mostrar (1 a " + numDefs + "):\t");
            posicio = Integer.parseInt(teclat.nextLine());

            String def = dic.definicioIessima(paraula, posicio);

            if (def != null) {
                System.out.println("\tDefinició " + posicio + ": " + def);
            } else {
                System.out.println("\tNúmero de definició no vàlid.");
            }
        }
    }

    // 6. Consultar totes les definicions d'una paraula
    public static void opcio6(Diccionari dic) {
        String paraula;

        System.out.print("\n\n\tIndica paraula de la que vols mostrar totes les seves definicions:\t");
        paraula = teclat.nextLine();

        String resultat = dic.obtenirDefinicions(paraula);
        System.out.println("\n" + resultat);
    }
}