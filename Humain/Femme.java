package Humain;

public class Femme extends Humain {
    String magazinePrefere = "aucun";

    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public Femme(String nom, String prenom, int age, double taille, int poids, int anneeNaissance, String pays,
            String magazinePrefere) {
        super(nom, prenom, age, taille, poids, anneeNaissance, pays);
        this.magazinePrefere = magazinePrefere;
    }

    public void sayHello() {
        System.out.println(
                "Bonjour, je m'appelle " + prenom + " " + nom + ". Je suis une femme et j'ai " + age + " ans.");
    }

    public String getMagazinePrefere() {
        return magazinePrefere;
    }

    public void setMagazinePrefere(String magazinePrefere) {
        this.magazinePrefere = magazinePrefere;
    }

    public void sayEverything() {
        super.sayEverything();
        System.out.println("Mon magazine préféré est " + magazinePrefere + ".");
    }
}