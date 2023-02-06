package Cars;

import Cars.*;

public class Main {
    public static void main(String[] args){


        Cars[] monGarage = {
            new Cars("Ford"), new Cars("Renault"), new Cars("Peugeot")
        };

        for (Cars voiture : monGarage){
            System.out.println(voiture.getNom());
        }; 
    }
}
