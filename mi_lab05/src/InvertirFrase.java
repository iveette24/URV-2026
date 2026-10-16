import java.util.Scanner;

public class InvertirFrase {

    // Método que realiza la lógica y DEVUELVE el String resultado
    public static String invertirFrase(String frase) {
        String[] paraules = frase.split(" "); // Separa por espacios
        PilaString pila = new PilaString(paraules.length);

        // Apilamos las palabras
        for (int i = 0; i < paraules.length; i++) {
            pila.apilar(paraules[i]);
        }

        // Desapilamos para invertir el orden
        String resultat = "";
        while (!pila.pilaBuida()) {
            resultat += pila.desapilar();
            if (!pila.pilaBuida()) {
                resultat += " "; // Añade espacio entre palabras
            }
        }

        return resultat; // Retorna el String resultante
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix una frase a invertir:");
        String frase = teclat.nextLine();

        // Llamamos al método y guardamos lo que nos devuelve
        String fraseInvertida = invertirFrase(frase);

        // Imprimimos el resultado únicamente en el main
        System.out.println("Frase invertida:");
        System.out.println(fraseInvertida);

        teclat.close();
    }
}