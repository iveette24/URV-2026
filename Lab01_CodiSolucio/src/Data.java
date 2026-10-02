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
	 * No valida que la data sigui correcta.
	 * 
	 * @param dia
	 * @param mes
	 * @param any
	 */
	public Data(int dia, int mes, int any) {
		this.dia = dia;
		this.mes = mes;
		this.any = any;
	}

	// METODES QUE HAN DE FER ELS ALUMNES AL LAB DE FORMA GUIADA

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

	// METODES QUE HAN DE FER ELS ALUMNES A CASA PER LLIURAR AL TALLER

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

}
