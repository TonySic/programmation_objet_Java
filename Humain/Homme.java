package Humain;

public class Homme extends Humain {
    String equipePreferee = "Aucune";

    public Homme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public Homme(String nom, String prenom, int age, double taille, int poids, int anneeNaissance, String pays,
            String equipePreferee) {
        super(nom, prenom, age, taille, poids, anneeNaissance, pays);
        this.equipePreferee = equipePreferee;
    }

    public void sayHello() {
        System.out.println("Bonjour, je m'appelle " + prenom + " " + nom + ". Je suis un homme et j'ai " + age + " ans.");
    }

    public String getEquipePreferee() {
        return equipePreferee;
    }

    public void sayEverything() {
        super.sayEverything();
        System.out.println("Mon équipe préférée est " + equipePreferee + ".");
    }
}