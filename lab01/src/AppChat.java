public class AppChat {
    public static void main(String[] args) {

        DataChat d1 = new DataChat (31, 1, 2025);
        DataChat d2 = new DataChat(30, 4, 2025);
        DataChat d3 = new DataChat(15, 3, 2025);
        DataChat d4 = new DataChat(28, 2, 2024); // any de traspàs
        DataChat d5 = new DataChat(1, 1, 2026);

        System.out.println("---- PROVES esUltimDiaMes ----");
        System.out.println(d1 + " → " + d1.esUltimDiaMes());
        System.out.println(d2 + " → " + d2.esUltimDiaMes());
        System.out.println(d3 + " → " + d3.esUltimDiaMes());
        System.out.println(d4 + " → " + d4.esUltimDiaMes());

        System.out.println("\n---- PROVES esAnterior ----");
        System.out.println(d3 + " és anterior a " + d1 + "? " + d3.esAnterior(d1));
        System.out.println(d5 + " és anterior a " + d4 + "? " + d5.esAnterior(d4));
        System.out.println(d4 + " és anterior a " + d5 + "? " + d4.esAnterior(d5));

        System.out.println("\n---- PROVES diaSeguent ----");
        System.out.println("Dia següent de " + d1 + " → " + d1.diaSeguent());
        System.out.println("Dia següent de " + d4 + " → " + d4.diaSeguent());

        System.out.println("\n---- PROVES esAnyDeTraspas ----");
        System.out.println(d4 + " traspàs? " + d4.esAnyDeTraspas());
        System.out.println(d5 + " traspàs? " + d5.esAnyDeTraspas());
    }
}
