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
	
	/**
	 * Accélère par pas de value jusqu'à max
	 * @param value de pas d'accélération
	 * @param vmax
	 */
	// Fonction créée au tableau :-D ;-D
	public void accelerer(int value, int vmax) {
		while (this.vitesse+value <= vmax) {
			accelerer(value);
		}
	}
	
	/**
	 * Décélère de 1 km/h
	 */
	// Fonction pour freiner
	public void freiner() {
		if(this.vitesse >= 0) {
			this.vitesse--;
		}
	}
	
	/**
	 * Décélère de la vitesse indiquée
	 * @param vitesseRalentie
	 */
	public void freiner(int vitesseRalentie) {
		if(this.vitesse >= vitesseRalentie) {
			this.vitesse += - vitesseRalentie;	
		}
	}
	
	
	/**
	 * Décélère de la vitesse indiquée et ce jusqu'à la vitesse minimale
	 * @param vitesseRalentie
	 * @param vmin
	 */
	public void freiner(int vitesseRalentie, int vmin) {
		while(this.vitesse-vitesseRalentie >= vmin) {
			this.vitesse += - vitesseRalentie;	
		}
	}
}
