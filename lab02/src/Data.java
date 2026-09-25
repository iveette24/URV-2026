/**
 * Classe per guardar dates.
 * 
 * @author Professorat de programació.
 *
 */


public class Data {
	private int dia;
	private int mes;
	private int any;

   /**
	 * Constructor que rep la data per paràmetre
	 * Ha de validar que la data és correcta. Si rep una data incorrecta inicialitza la instància
	 * amb la data de referència.
	 * @param dia
	 * @param mes
	 * @param any
	 */
    public Data(int dia, int mes, int any) {
        if (esDataCorrecta(dia, mes, any)) { // ens asegurem que és una data valida
			this.dia = dia;
			this.mes = mes;
			this.any = any;
		} else { // posem la data de referència com a senyal d'error
			this.dia = 1;
			this.mes = 1;
			this.any = 2000;
		}
    }


	// METODES

	/**
	 * Getter
	 * 
	 * @return dia de la data
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Getter
	 * 
	 * @return mes de la data
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Getter
	 * 
	 * @return any de la data
	 */
	public int getAny() {
		return any;
	}

	/**
	 * Mètode que transforma el contingut d'un objecte en una cadena de caracters
	 * per ser
	 * mostrat per pantalla
	 */
	public String toString() {
		return ("\t DATA => dia " + dia + " mes " + mes + " any " + any);
	}

	/**
	 * Mètode que comprova si la data actual correspon a un any de traspas
	 * 
	 * @return si és any de traspas
	 */
	public boolean esAnyTraspas() {
		if ((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0))) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Mètode que comprova si la data actual és la mateixa a la que es rep per
	 * paràmetre
	 * 
	 * @param data - valor de data a comparar amb l'actual
	 * @return si són iguals
	 */
	public boolean esIgual(Data data) {
		if (this.dia == data.getDia() && this.mes == data.getMes() && this.any == data.getAny()) {
			return true;
		}
		return false;
	}

	/**
	 * Mètode que comprova si la data actual és la mateixa a la que es rep per
	 * paràmetre
	 * 
	 * @param data - valor de data a comparar amb l'actual
	 * @return si són iguals
	 */

	public boolean esPrimeraQuinzena() {
		if (dia <= 15)
			return true;
		else
			return false;
	}


	/**
	 * Mètode per comprova si la data actual és anterior a la passada per paràmetre
	 * 
	 * @param nova - valor de data a comparar amb l'actual
	 * @return si la data de la instància actual és anterior a la rebuda
	 */

	public boolean esDataAnterior(Data nova) {
		boolean esAnterior;
		if (any < nova.any)
			esAnterior = true;
		else if (any > nova.any)
			esAnterior = false;
		else {
			// cas anys iguals
			if (mes < nova.mes)
				esAnterior = true;
			else if (mes > nova.mes)
				esAnterior = false;
			else {
				// anys i mes iguals
				if (dia < nova.dia)
					esAnterior = true;
				else
					esAnterior = false;
			}
		}
		return esAnterior;

	}

	/**
	 * Mètode que comprova si la data correspon al darrer dia del mes
	 * * @return cert o fals
	 */
	public boolean esUltimDiaMes() {
		boolean ultim;

		if (mes == 2) {
			if (this.esAnyTraspas()) {
				ultim = (dia == 29);
			} else {
				ultim = (dia == 28);
			}
		} else {
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				ultim = (dia == 30);
			} else {
				ultim = (dia == 31);
			}
		}
		return ultim;
	}



// Mètodes STATIC addicionals ********************************************************************************
	/// 
    // Mètodes de classe, no d'objecte
	// no s'apliquen sobre el contingut d'una instància de data sinó sobre valors que es reben per paràmetre.
	// són mètodes auxiliars i per això estan definits com a private dins la classe
	// no són accessibles des de la classe Aplicacio (App.java)

	private static boolean esDataCorrecta(int dia, int mes, int any) {
		boolean hoEs=true;
		if (dia < 1 || dia > 31) { // dia incorrecte
			hoEs= false;
		}
		else if (mes < 1 || mes > 12) { // mes incorrecte
			hoEs= false;
		}
		else if (dia > diesMes(mes, any)) { // dia del mes incorrecte
			hoEs= false;
		}
		return hoEs;
	}
	private static int diesMes(int mes, int any) { // per saber quants dies te un mes d'un any
		int diesMes;
		if (mes == 2) {
			if ((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0))) {
				diesMes = 29;
			} else {
				diesMes = 28;
			}
		} else {
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				diesMes = 30;
			} else {
				diesMes = 31;
			}
		}
		return diesMes;
	}

}