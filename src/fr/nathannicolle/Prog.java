package fr.nathannicolle;

public class Prog {
	public static void main(String[] args) {
		Voiture v1 = new Voiture();
		System.out.println("Capacit� par d�faut : " + v1.getCapaciteR());
		v1.setCapaciteR(100);
		System.out.println("Capacit� apr�s le setCapacit� : " + v1.getCapaciteR());
		System.out.println("Vitesse de d�part : " + v1.getVitesse() + " km/h");
		v1.accelerer();
		v1.accelerer();
		System.out.println("Vitesse 1 : " + v1.getVitesse() + " km/h");
		v1.accelerer(180);
		System.out.println("Vitesse 2 : " + v1.getVitesse() + " km/h");
		v1.accelerer(13, 195);
		System.out.println(v1 + " roule � : " + v1.getVitesse() + " km/h");
		v1.freiner();
		System.out.println("Ralentissement 1 : " + v1.getVitesse());
		v1.freiner(100);
		System.out.println("Ralentissement 2 : " + v1.getVitesse());
		v1.freiner(30, 64);
		System.out.println("Ralentissement 3 : " + v1.getVitesse());
		// Acc�s aux donn�es dans le cadre d'une port�e package
		/*v1.vitesse = 20;
		System.out.println(v1 + " roule � " + v1.vitesse + " km/h");*/
	}
}