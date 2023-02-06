package Humain;
import Humain.*;

// classe principale du programme
public class Main {

    // public static void main = méthode principale du programme (obligatoire en
    // Java)
    /**
     * @param args
     */
    public static void main(String args[]) {
        Homme hovan = new Homme("Chamamyan", "Hovan", 25);
        Homme tony = new Homme("Sicot", "Tony", 36, 1.75, 60, 1986, "France", "Nantes");
        Femme manue = new Femme("Danic", "Emmanuelle", 41, 1.65, 55, 1981, "France", "Closer");

        hovan.sayHello();
        tony.sayHello();

        System.out.println(hovan.getEquipePreferee());
        System.out.println(tony.getEquipePreferee());

        hovan.setPoids(65);
        tony.setPoids(tony.getPoids() + 5);

        System.out.println(tony.getPoids());
        System.out.println(hovan.getPoids());

        manue.sayHello();

        System.out.println(manue.getMagazinePrefere());

        manue.setMagazinePrefere("Fluide Glacial");

        System.out.println(manue.getMagazinePrefere());

        Humain[] tabHumains = {hovan, tony, manue};

        hovan.setTaille(1.92);
        hovan.setAnneeNaissance(1980);
        hovan.setPays("Arménie");

        for(Humain humain : tabHumains) {
        humain.sayHello();
        humain.sayEverything();
        }
         
    }
}
