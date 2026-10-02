/**
 * Pràctica 1 - Curs 2026-27: Primera part
 * Classe UsaCamioAmpliat
 */

public class UsaCamioAmpliat {
	
	public static void main(String[] args) {
		System.out.println("Aplicació per validar la classe Camió\n");

		validarConstructors();
		validarCarregaPaquets();
		validarDescarregaCompleta();
		validarEspaiDisponible();
		validarComparacions();
	}

	private static void validarConstructors() {
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.println("\n\nValidar constructors\n");

		CamioAmpliat fruita = new CamioAmpliat(4000);
		System.out.println("Constructor capacitat - Camió fruita:\n" + fruita);

		CamioAmpliat verdura = new CamioAmpliat(3000, 50, 2000);
		System.out.println("Constructor amb totes les dades - Camió verdura:\n" + verdura);

		CamioAmpliat incorrecte = new CamioAmpliat(2000, 10, 3000);
		System.out.println("Constructor amb dades incorrectes - Camió incorrecte:\n" + incorrecte);
	}

	private static void validarCarregaPaquets() {
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.println("\n\nValidar càrrega de paquets\n");

		CamioAmpliat fruita = new CamioAmpliat(4000);
		CamioAmpliat lactics = new CamioAmpliat(2000);

		System.out.println("Camió fruita inicial:\n" + fruita);

		fruita.carrega1Paquet(4000);
		System.out.println("Després de carregar 4000 kg:\n" + fruita + " (estaPle: " + fruita.estaPle() + ")");
		System.out.println("Camions plens totals: " + CamioAmpliat.getNumCamionsPlens());

		fruita.carrega1Paquet(300);
		System.out.println("Intent carregar 300 kg més (no hi ha espai):\n" + fruita);

		lactics.carrega1Paquet(100);
		System.out.println("Camió làctics després de carregar 100 kg:\n" + lactics);
		System.out.println("Camions plens totals: " + CamioAmpliat.getNumCamionsPlens());
	}

	private static void validarDescarregaCompleta() {
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.println("\n\nValidar descàrrega completa\n");

		CamioAmpliat lactics = new CamioAmpliat(2000);
		lactics.carrega1Paquet(2000);
		System.out.println("Camió làctics abans de descarregar:\n" + lactics);
		System.out.println("Camions plens totals: " + CamioAmpliat.getNumCamionsPlens());

		lactics.descarregarTotCamio();
		System.out.println("Camió làctics després de descarregar:\n" + lactics);
		System.out.println("Camions plens totals: " + CamioAmpliat.getNumCamionsPlens());
	}

	private static void validarEspaiDisponible() {
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.println("\n\nValidar espai disponible\n");

		CamioAmpliat fruita = new CamioAmpliat(4000, 50, 2200);
		CamioAmpliat verdura = new CamioAmpliat(4000, 50, 2000);

		System.out.println("Camió fruita:\n" + fruita + "\nCamió verdura:\n" + verdura);

		if (fruita.teMesEspaiLliureQue(verdura)) {
			System.out.println("Fruita té més espai lliure. Carreguem 400 kg a fruita.");
			fruita.carrega1Paquet(400);
		} else {
			System.out.println("Verdura té més espai lliure. Carreguem 400 kg a verdura.");
			verdura.carrega1Paquet(400);
		}

		if (fruita.teMesEspaiLliureQue(verdura)) {
			System.out.println("Fruita té més espai lliure.");
		} else {
			System.out.println("Verdura té més espai lliure.");
		}

		System.out.println("Camió fruita:\n" + fruita + "\nCamió verdura:\n" + verdura);
	}

	private static void validarComparacions() {
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.println("\n\nValidar comparacions entre camions\n");

		CamioAmpliat verdura = new CamioAmpliat(3000, 50, 2000);
		CamioAmpliat lactics = new CamioAmpliat(3000, 50, 2000);

		System.out.println("Camió verdura:\n" + verdura);
		System.out.println("Camió lactics:\n" + lactics);

		if (verdura.equals(lactics)) {
			System.out.println("Camions iguals: mateixa capacitat i càrrega en kg.\n");
		} else {
			System.out.println("Camions diferents en capacitat o càrrega en kg.\n");
		}

		CamioAmpliat altre = new CamioAmpliat(3000, 50, 1500);
		System.out.println("Camió altre:\n" + altre);
		if (!verdura.equals(altre)) {
			System.out.println("Aquest camió és diferent perquè té un pes actual diferent.");
		}
	}
}
