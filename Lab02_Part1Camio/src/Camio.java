/**
 * Pràctica 1 - Curs 2026-27: Primera part
 * Classe Camio
 */
public class Camio {
	
    // CONSTANTS
	private static final int MAX_PAQUETS = 100;

	// DADES: atributs de la classe, compartits per tots els objectes
	private static int numCamionsPlens = 0;

	// DADES: atributs
	private int kgMaxims;  // Kilograms que hi caben
	private int kgActuals;  // Kilograms que hi ha ara al camió
	private int paquetsActuals; // Nombre de paquets que hi ha al camió
	
	
	// MÈTODES
	
	/**
	 * Mètode constructor.
	 * @param capacitatCamio - kilograms que admet el camió. 
	 * Inicialment el camió està buit.
	 */
	public Camio (int capacitatCamio) {
		kgActuals = 0;
		paquetsActuals = 0;
		kgMaxims = capacitatCamio;
	}
	
	/**
	 * Mètode per inicialitzar un camió que ja porta càrrega des del començament.
	 * @param capacitatCamio - kilograms que admet el camió. 
	 * @param paquetsActuals - nombre de paquets que conté el camió inicialment
	 * @param kgActuals - kilograms que porta el camió inicialment
	 */
	public Camio (int capacitatCamio, int paquetsActuals, int kgActuals) {
		if ((kgActuals <= capacitatCamio) && (paquetsActuals < MAX_PAQUETS)) { // Comprovo que hi caben els kg actuals i els paquets
			this.kgActuals = kgActuals;
			this.paquetsActuals = paquetsActuals;
			kgMaxims = capacitatCamio;
			
            if (espaiLliure() == 0) numCamionsPlens++; // Si no queda espai lliure al camió, sumem un al nombre de camions plens
		}
		else {
			this.kgActuals = 0;
			this.paquetsActuals = 0;
			this.kgMaxims = capacitatCamio;
		}
	}
	
	// Mètode que em retorna els quilos que encara hi caben.
	private int espaiLliure() {
		return kgMaxims - kgActuals;
	}
	
	/**
	 * Getter: consulta els quilos que porta el camió.
	 * @return els quilos que porta el camió
	 */
	public int getKgActuals() {
		return kgActuals;
	}

	/**
	 * Getter: consulta els quilos màxims que pot portar el camió.
	 * @return els quilos màxims que pot portar el camió
	 */
	public int getKgMaxims() {
		return kgMaxims;
	}

	/**
	 * Getter: consulta els paquets que porta el camió.
	 * @return els paquets que porta el camió
	 */
	public int getPaquetsActuals() {
		return paquetsActuals;
	}

	/**
	 * Getter: consulta el nombre total de camions plens.
	 * @return nombre de camions que estan completament plens
	 */
	public static int getNumCamionsPlens() {
		return numCamionsPlens;
	}

	/**
	 * Setter: modifica la capacitat màxima del camió.
	 * @param nousKg - nova capacitat màxima en quilos
	 */
	public void setKgMaxims(int nousKg) {
		kgMaxims = nousKg;
	}

	/**
	 * Comprova si el camió està ple, i per tant no accepta més càrrega.
	 * @return  cert quan està ple // fals si encara hi caben kg
	 */
	public boolean estaPle() {
		return kgActuals == kgMaxims;
	}
	
	/**
	 * Retorna un text del camió.
	 *
	 * @return cadena amb tota la informació del camió
	 */
	@Override
	public String toString() {
		return "Dades Camió:\n\tCapacitat màxima: " + kgMaxims + " Kg\n" 
			+ "\tTotal paquets: " + paquetsActuals + "\n\tTotal Kg: " + kgActuals + " Kg\n";
	}

	/**
	 * Comprovar si les dades d’una instància coincideixen amb les d’una altra.
	 * 
	 * @param altreCamio - altra instància amb la que es compara l'actual
	 * @return cert si tot el contingut és el mateix
	 */   
	public boolean equals (Camio altreCamio) {
		return ((this.kgMaxims == altreCamio.kgMaxims) && (this.kgActuals == altreCamio.kgActuals));
	}

	/**
	 * Aquest mètode guarda un paquet nou al camió.
	 * @param kg - pes del paquet que es posa al camió
	 */
	public void carrega1Paquet(int kg) {
		if ((kgActuals + kg <= kgMaxims) && (paquetsActuals < MAX_PAQUETS)){
			kgActuals = kgActuals + kg;
			paquetsActuals++;
			
			if (espaiLliure() == 0) numCamionsPlens++;
		}
	}
	
	/**
	 * Aquest mètode es per quan descarreguem tot el camió.
	 */
	public void descarregarTotCamio() {
		if (espaiLliure() == 0) numCamionsPlens--;
		
		kgActuals = 0;
		paquetsActuals = 0;
	}
		
	/**
	 * Comprova si aquest camió té més espai lliure que un altre.
	 * @param altreCamio - camió a comparar
	 * @return cert si aquest camió té més espai lliure, fals en cas contrari
	 */
	public boolean teMesEspaiLliureQue(Camio altreCamio) {		
		return (espaiLliure() > altreCamio.espaiLliure());
	}
	
}
