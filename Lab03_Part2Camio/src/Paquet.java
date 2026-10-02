/**
 * Curs 2026-27: Segona part
 * Classe Paquet
 * Representa cada paquet individual
 */
public class Paquet {

	private String nom;
	private int kg;

	public Paquet(String nom, int kg) {
		this.nom = nom;
		this.kg = kg;
	}

	public String getNom() {
		return nom;
	}

	public int getKg() {
		return kg;
	}

	public Paquet copia() {
		return new Paquet(nom, kg);
	}

	@Override
	public String toString() {
		return "Paquet: " + nom + ", pes: " + kg + " kg"; 
	}
}