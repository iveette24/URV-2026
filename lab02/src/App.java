public class App {

	static Data dataExamen, dataIniciCurs, dfi, d2;

	public static void main(String[] args) throws Exception {

		validacioConstructors();
		validacioGetters();
		validacionsUnaData();
		validacionsDuesDates();

	}

	private static void validacioConstructors() {
		dataExamen = new Data(27, 10, 2026);
		System.out.println(dataExamen);

		dataIniciCurs = new Data(71, 9, 2026);
		System.out.println(dataIniciCurs);

		dfi = new Data(31, 12, 2024);
		d2 = new Data(31, 12, 2024);
	}

	private static void validacioGetters() {
		System.out.println("Extraiem els camps data inici curs:" + dataIniciCurs.getDia() + ":" + dataIniciCurs.getMes()
				+ ":" + dataIniciCurs.getAny());
		System.out.println("Extraiem els camps data Examen:" + dataExamen.getDia() + ":" + dataExamen.getMes()
				+ ":" + dataExamen.getAny());

	}

	private static void validacionsUnaData() {

		System.out.println("\nValidació any de traspas");
		System.out.println("Es any de traspas la data Examen? " + dataExamen.esAnyTraspas());
		System.out.println("Es any de traspas la dfi? " + dfi.esAnyTraspas());

		System.out.println("\nValidació primera quinzena");
		System.out.println("Està a la primera quinzena la data IniciCurs? " + dataIniciCurs.esPrimeraQuinzena());
		System.out.println("Es primera quinzena la data Examen? " + dataExamen.esAnyTraspas());

		System.out.println("\nValidació dia de fi de mes:");
		System.out.println("L'inici de curs és a final de mes? " + dataIniciCurs.esUltimDiaMes());
		System.out.println("La data d2 es final de mes? " + d2.esUltimDiaMes());
	}

	private static void validacionsDuesDates() {

		System.out.println("\nValidació de la comparació de dates iguals:");
		System.out.println(dfi.esIgual(d2));
		System.out.println(dfi.esIgual(dataExamen));

		System.out.println("\nValidació data anterior a una altra:");
		System.out.println("Comparem si " + dfi + " es anterior a " + d2 + "?" + dfi.esDataAnterior(d2));
		System.out
				.println("Comparem si " + dfi + " es anterior a " + dataExamen + "?" + dfi.esDataAnterior(dataExamen));
		System.out.println("Comparem si " + dataExamen + " es anterior a " + dataExamen + "?"
				+ dataExamen.esDataAnterior(dataExamen));
		System.out.println("Comparem si " + dataExamen + " es anterior a " + dataIniciCurs + "?"
				+ dataExamen.esDataAnterior(dataIniciCurs));

	}

}
