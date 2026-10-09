import java.util.Scanner;

public class UsaDiccionari {

	static Scanner teclat = new Scanner(System.in);

	public static void main(String[] args) {
		int opcio;
		Diccionari diccio = new Diccionari(30); // definim un diccionari per a 30 paraules

		// Per a facilitar el joc de proves hem afegit unes paraules de forma manual
		// podeu adaptar les crides si modifiqueu algun metode dels que aquí s'utilitzen

		afegirParaulesInicials(diccio);

		// la primera opcio que podeu provar del menu es la de mostrar el contingut del
		// diccionari
		// fixar-se com escrivim la informacio de la paraula per pantalla
		// te alguna cosa a veure amb el toString?

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

		// anem a provar que si afegim una paraula amb la seva definicio repetida, aquesta realment
		// no s'afegeix
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

	public static void opcio1(Diccionari dic) {
		// 1. Afegir una paraula al diccionari

	}

	public static void opcio2(Diccionari dic) {
		// 2. Esborrar una paraula
		String paraula;
		System.out.print("\n\n\tIndica paraula:\t");
		paraula = teclat.nextLine();

		// .....
	}

	public static void opcio3(Diccionari dic) {
		// 3. Mostrar el contingut del diccionari

		// versió 1. força bruta
		int i;
		Paraula p;
		System.out.println("Mostrem el diccionari mètode no òptim ");
		for (i = 0; i < dic.numParaules(); i++) {
			p = dic.paraulaIessima(i);
			System.out.println(p);
		}

		// versió 2. La correcte
		System.out.println("El contingut del diccionari és:\n"+dic);
	}

	public static void opcio4(Diccionari dic) {
		// 4. Consultar el número de definicions d'una paraula
		String paraula;
		System.out.print("\n\n\tIndica paraula:\t");
		paraula = teclat.nextLine();

		// .....
	}

	public static void opcio5(Diccionari dic) {
		// 5. Consultar la definicio i-essima d'una paraula
		int posicio;
		String paraula;
		System.out.print("\n\n\tIndica paraula:\t");
		paraula = teclat.nextLine();
		// ara pots mostrar a l'usuari quantes definicions tens de la paraula per a que
		// estigui
		// mes guiat

		System.out.print("\n\n\tIndica numero de definicio a mostrar:\t");
		posicio = Integer.parseInt(teclat.nextLine());

		// ....
	}

	public static void opcio6(Diccionari dic) {
		// 6. Consultar totes les definicions d'una paraula
		String paraula;
		System.out.print("\n\n\tIndica paraula de la que vols mostrar totes les seves definicions:\t");
		paraula = teclat.nextLine();

		// .....
	}

}
