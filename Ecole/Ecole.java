package Ecole;

public class Ecole {
    String nom;
    String[] matieresEnseignees;
    String ville;
    Etudiant[] etudiants;

    public Ecole(String nomEcole, String[] matieresEnseigneesEcole, String villeEcole, Etudiant[] etudiantsEcole) {
        nom = nomEcole;
        matieresEnseignees = matieresEnseigneesEcole;
        ville = villeEcole;
        etudiants = etudiantsEcole;
    }

    public void showInformation() {
        System.out.println("Bienvenue à l’école " + nom + " située à " + ville + " et proposant");
        for (String matiere : matieresEnseignees){
            System.out.println(matiere);
        }
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String[] getMatieresEnseignees() {
        return this.matieresEnseignees;
    }

    public void setMatieresEnseignees(String[] matieresEnseignees) {
        this.matieresEnseignees = matieresEnseignees;
    }

    public String getVille() {
        return this.ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Etudiant[] getEtudiants() {
        return this.etudiants;
    }

    public void setEtudiants(Etudiant[] etudiants) {
        this.etudiants = etudiants;
    }
}
    