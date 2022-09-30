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
	 * Affiche la capacit� du r�servoir du V�hicule
	 */
	public int getCapaciteR() {
		return this.capaciteR; 
	}
	
	/**
	 * Modifie la capacit� du r�servoir du V�hicule
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

	// Fonction acc�l�rer (modificateur de vitesse)
	public void  accelerer() {
		vitesse++;
	}
	
	public void accelerer(int value) {
		vitesse += value;
	}
}
