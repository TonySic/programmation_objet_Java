package Ecole;

public class Etudiant {
    String nom;
    String prenom;
    int age;
    String matiereEtudiee;
    boolean diplomeObtenu;

    public Etudiant(String nomEtudiant, String prenomEtudiant, int ageEtudiant, String matiereEtudieeEtudiant,
            boolean diplomeObtenuEtudiant) {
        nom = nomEtudiant;
        prenom = prenomEtudiant;
        age = ageEtudiant;
        matiereEtudiee = matiereEtudieeEtudiant;
        diplomeObtenu = diplomeObtenuEtudiant;
    }

    public void sayHello() {
        System.out.println("Bonjour, je m'appelle " + prenom + " " + nom + ", j'ai " + age + " ans et j'étudie "
                + matiereEtudiee + ".");
    }

    public void isGraduated() {
        if (diplomeObtenu == true) {
            System.out.println("J'ai obtenu mon diplôme.");
        } else {
            System.out.println("Je ne suis pas encore diplômé(e)");
        }
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMatiereEtudiee() {
        return this.matiereEtudiee;
    }

    public void setMatiereEtudiee(String matiereEtudiee) {
        this.matiereEtudiee = matiereEtudiee;
    }

    public boolean isDiplomeObtenu() {
        return this.diplomeObtenu;
    }

    public boolean getDiplomeObtenu() {
        return this.diplomeObtenu;
    }

    public void setDiplomeObtenu(boolean diplomeObtenu) {
        this.diplomeObtenu = diplomeObtenu;
    }
}
