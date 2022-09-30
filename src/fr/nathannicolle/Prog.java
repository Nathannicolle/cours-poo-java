package fr.nathannicolle;

public class Prog {
	public static void main(String[] args) {
		Voiture v1 = new Voiture();
		System.out.println("Capacité par défaut : " + v1.getCapaciteR());
		v1.setCapaciteR(100);
		System.out.println("Capacité après le setCapacité : " + v1.getCapaciteR());
		System.out.println("Vitesse de départ : " + v1.getVitesse() + " km/h");
		v1.accelerer();
		v1.accelerer();
		System.out.println("Vitesse 1 : " + v1.getVitesse() + " km/h");
		v1.accelerer(180);
		System.out.println("Vitesse 2 : " + v1.getVitesse() + " km/h");
		v1.accelerer(13, 195);
		System.out.println(v1 + " roule à : " + v1.getVitesse() + " km/h");
		v1.freiner();
		System.out.println("Ralentissement 1 : " + v1.getVitesse());
		v1.freiner(100);
		System.out.println("Ralentissement 2 : " + v1.getVitesse());
		v1.freiner(30, 64);
		System.out.println("Ralentissement 3 : " + v1.getVitesse());
		// Accès aux données dans le cadre d'une portée package
		/*v1.vitesse = 20;
		System.out.println(v1 + " roule à " + v1.vitesse + " km/h");*/
	}
}