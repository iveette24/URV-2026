public class App {
	public static void main(String[] args) throws Exception {

		System.out.println("\nValidació dels constructors");
		Data dataExamen, dataIniciCurs, dfi, d2;

		dataExamen = new Data(27, 10, 2026);
		System.out.println(dataExamen);

		dataIniciCurs = new Data(7, 9, 2026);
		System.out.println(dataIniciCurs);

		dfi = new Data(31, 12, 2024);
		d2 = new Data(31, 12, 2024);

		System.out.println("\nValidació dels getters:");
		System.out.println("Extraiem els camps data inici curs:" + dataIniciCurs.getDia() + ":" + dataIniciCurs.getMes()
				+ ":" + dataIniciCurs.getAny());

		System.out.println("\nValidació any de traspas");
		System.out.println("Es any de traspas la data Examen? " + dataExamen.esAnyTraspas());
		System.out.println("Es any de traspas la de fi? " + dfi.esAnyTraspas());

		System.out.println("\nValidació primera quinzena");
		System.out.println("Està a la primera quinzena la data IniciCurs? " + dataIniciCurs.esPrimeraQuinzena());
		System.out.println("Es primera quinzena la data Examen? " + dataExamen.esAnyTraspas());

		System.out.println("\nValidació de la comparació de dates iguals:");
		System.out.println("La data dfi és igual a la data d2? " + dfi.esIgual(d2));
		System.out.println("La data dfi és igual a la data Examen? " + dfi.esIgual(dataExamen));

		System.out.println("\nValidació dia de fi de mes:");
		System.out.println("L'inici de curs és a final de mes? " + dataIniciCurs.esUltimDiaMes());
		System.out.println("La data d2 es final de mes? " + d2.esUltimDiaMes());

		System.out.println("\nValidació data anterior a una altra:");
		System.out.println("Comparem si "+dfi+" es anterior a "+d2 + "?" + dfi.esDataAnterior(d2));
		System.out.println("Comparem si "+dfi+" es anterior a "+dataExamen + "?" + dfi.esDataAnterior(dataExamen));
		System.out.println("Comparem si "+dataExamen+" es anterior a "+dataExamen + "?" + dataExamen.esDataAnterior(dataExamen));
		System.out.println("Comparem si "+dataExamen+" es anterior a "+dataIniciCurs + "?" + dataExamen.esDataAnterior(dataIniciCurs));

	}

}
