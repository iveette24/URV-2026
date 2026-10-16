import java.util.Scanner;

public class ParentesiEquilibrat {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		System.out.println ("Introdueix la frase a comprovar: ");
		String frase = teclat.nextLine(); //Aquí es llegeix la frase a comprovar

		PilaCaracters pila = new PilaCaracters(frase.length()); //No entiendo esto 
		boolean equilibrat = true; //NO entiendo que significa esta variable 
		int i = 0;

		while (i < frase.length() && equilibrat) {
			char c = frase.charAt(i); //obtenemos el caracter situado en la posición i de la frase

			if (esParentesiObrir(c)) {
				pila.apilar(c);
			} else if (esParentesiTancar(c)) {
				if (pila.pilaBuida()) {
					equilibrat = false; //per a que volem la variable si fem un print ?
					System.out.println("Error a la posició " + i + ": es tanca '" + c + "' sense haver-ne obert cap.");
				} else {
					char ultimObrir = pila.desapilar();
					if (!sonParella(ultimObrir, c)) {
						equilibrat = false;
						System.out.println("Error a la posició " + i + ": no coincideixen '" + ultimObrir + "' i '" + c + "'.");

					}
				}
			}
			i++;
		}
		
		//Creo que equilibrat se ponia para verificar, despues de todo el while como sale la variable 
        if (equilibrat) {
            if (pila.pilaBuida()) {
                System.out.println("La frase està correctament equilibrada.");
            } else {
                System.out.println("Error: falten parèntesis de tancar al final.");
            }
        }

        teclat.close();
    }

    // Métodos auxiliares de verificacion de los caracteres 
    public static boolean esParentesiObrir(char c) {
        return ((c == '(') || (c == '{') || (c == '['));
    }

    public static boolean esParentesiTancar(char c) {
        return ((c == ')') || (c == '}') || (c == ']'));
    }

    public static boolean sonParella(char obrir, char tancar) {
        return ((obrir == '(') && (tancar == ')')) ||
               ((obrir == '{') && (tancar == '}')) ||
               ((obrir == '[') && (tancar == ']'));
    }
}