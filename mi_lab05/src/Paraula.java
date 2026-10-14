/** 
 * Laboratori 5. Classe Paraula
 * 
 * @author Professores programació
 * @version 1.0
 * 
 */
public class Paraula {
	private String nom;
	private String definicio;
	
	 /** Constructor que rep les dades d'una paraula
	  * 
	  * @param n conté el nom de la paraula
	  * @param def conté la definició de la paraula
	  */
	public Paraula(String n, String def) {
		nom = n;
		definicio = def;
	}
	
	 /** getter
	  * 
	  * @return el nom de la paraula
	  */
	public String getNom() {
		return(nom);
	}
	
	 /** getter
	  * 
	  * @return la definició de la paraula
	  */
	public String getDefinicio() {
		return(definicio);
	}
	
	 /** setter
	  * 
	  * @param n conté el mot pel que es vol substituir a l'actual
	  */
	public void setNom(String n){
		nom = n;
	}
	
	 /** setter
	  * 
	  * @param def conté la nova definició que substituiré a l'actual
	  */
	public void setDefinicio(String def){
		definicio=def;
	}
	
	/** Mètode que comprova si la instància actual té com a nom el valor que es rep per paràmetre
	 * 
	 * @param n conté el mot que es vol comprovar
	 * @return cert si la paraula actual té com a nom el mot rebut per paràmetre, fals en cas contrari
	 */
	public boolean esAquestaParaula(String n){
		return(nom.equalsIgnoreCase(n));
	}
	
	/** Mètode que comprova si la instància actual té com a definició el valor que es rep per paràmetre
	 * 
	 * @param def conté la definició que es vol comprovar
	 * @return cert si la paraula actual té com a definició el mot rebut per paràmetre, fals en cas contrari
	 */
	public boolean teAquestaDefinicio(String def){
		return(definicio.equalsIgnoreCase(def));
	}
	
	/** mètode que crea una copia de l'objecte actual
	 * 
	 * @return una nova instància de la classe Paraula amb el mateix contingut que l'objecte actual
	 */
	public Paraula copia() {
		Paraula nova=new Paraula(nom, definicio);
		return(nova);
	}

	  /** mètode toString
	   * 
	   * @return el contingut de l'objecte com una cadena
	   */
	public String toString() {
		return("PARAULA => Nom:\t"+nom+"\tDefinicio:\t"+definicio);
	}
}
