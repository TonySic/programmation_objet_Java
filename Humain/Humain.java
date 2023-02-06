package Humain;

public abstract class Humain {
    String nom;
    String prenom;
    int age;
    double taille;
    int poids;
    int anneeNaissance;
    String pays;

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public Humain(String nom, String prenom, int age, double taille, int poids, int anneeNaissance, String pays) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.taille = taille;
        this.poids = poids;
        this.anneeNaissance = anneeNaissance;
        this.pays = pays;
    }

    public void sayHello() {
        System.out.println("Bonjour, je m'appelle" + prenom + " " + nom + ".");
    }

    public String getPays() {
        return pays;
    }
    
    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getPoids() {
        return this.poids;
    }

    public void sayEverything() {
        System.out.println("Bonjour, je m'appelle " + prenom + " " + nom + ", j'ai " + age + " ans, je pèse " + poids + " kg, je mesure " + taille + " cm, je suis né en " + anneeNaissance + " et je viens de " + pays + ".");
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

}