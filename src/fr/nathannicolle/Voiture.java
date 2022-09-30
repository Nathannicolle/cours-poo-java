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
	
	/**
	 * Acc�l�re par pas de value jusqu'� max
	 * @param value de pas d'acc�l�ration
	 * @param vmax
	 */
	// Fonction cr��e au tableau :-D ;-D
	public void accelerer(int value, int vmax) {
		while (this.vitesse+value <= vmax) {
			accelerer(value);
		}
	}
	
	/**
	 * D�c�l�re de 1 km/h
	 */
	// Fonction pour freiner
	public void freiner() {
		if(this.vitesse >= 0) {
			this.vitesse--;
		}
	}
	
	/**
	 * D�c�l�re de la vitesse indiqu�e
	 * @param vitesseRalentie
	 */
	public void freiner(int vitesseRalentie) {
		if(this.vitesse >= vitesseRalentie) {
			this.vitesse += - vitesseRalentie;	
		}
	}
	
	
	/**
	 * D�c�l�re de la vitesse indiqu�e et ce jusqu'� la vitesse minimale
	 * @param vitesseRalentie
	 * @param vmin
	 */
	public void freiner(int vitesseRalentie, int vmin) {
		while(this.vitesse-vitesseRalentie >= vmin) {
			this.vitesse += - vitesseRalentie;	
		}
	}
}
