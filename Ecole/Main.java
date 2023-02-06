package Ecole;

import Ecole.*;

// classe principale du programme
public class Main {

    // public static void main = méthode principale du programme (obligatoire en
    // Java)
    /**
     * @param args
     */
    public static void main(String args[]) {
        Etudiant john = new Etudiant("Doe", "John", 13, "Latin", false);
        Etudiant hovan = new Etudiant("Chamamyan", "Hovan", 14, "Philosophie", false);
        Etudiant tony = new Etudiant("Sicot", "Tony", 15, "Mathématiques", false);

        String[] matieres = { "Latin", "Philosophie", "Mathématiques" };
        Etudiant[] listeEtudiants = { john, hovan, tony };

        Ecole steUrsule = new Ecole("Sainte Ursule", matieres, "Luçon", listeEtudiants);

        steUrsule.showInformation();

        for(Etudiant eleve : listeEtudiants) {
            eleve.sayHello();
            eleve.setDiplomeObtenu(true);
            eleve.isGraduated();

        }

    }
}
