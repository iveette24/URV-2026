import java.util.Scanner;

public class ParentesiEquilibrat {

	public static void main(String[] args) {
		Scanner teclat=new Scanner(System.in);

		// TODO: Completa el codi aquí

		teclat.close();
	}

	public static boolean esParentesiObrir(char c) {
		return ((c=='(')||(c=='{')||(c=='['));
	}
	
	public static boolean esParentesiTancar(char c) {
		return ((c==')')||(c=='}')||(c==']'));
	}
	
	public static boolean sonParella(char obrir, char tancar) {
		return ((obrir=='(')&&(tancar==')') || 
				((obrir=='{')&&(tancar=='}')) || 
				((obrir=='[')&&(tancar==']')));
	}
}
