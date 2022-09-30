package fr.nathannicolle;

public class Voiture {
	private int vitesse;
	private int nbPlaces;
	private int capaciteR;
	private int niveauR;
	
	@Override
	public String toString() {
		return "Voiture :-D";
	}
	
	// Getters & Setters
	/**
	 * Affiche la capacité du réservoir du Véhicule
	 */
	public int getCapaciteR() {
		return this.capaciteR; 
	}
	
	/**
	 * Modifie la capacité du réservoir du Véhicule
	 * @param capacite
	 */
	public void setCapaciteR(int capacite) {
		if(capacite >= 0 && capacite <= 100) {
			this.capaciteR = capacite;	
		}
	}
	
	/**
	 * Retourne la vitesse
	 * @return vitesse
	 */
	public int getVitesse() {
		return vitesse;
	}

	// Fonction accélérer (modificateur de vitesse)
	public void  accelerer() {
		vitesse++;
	}
	
	public void accelerer(int value) {
		vitesse += value;
	}
}
