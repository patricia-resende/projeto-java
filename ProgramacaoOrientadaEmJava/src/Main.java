import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Rex", "Branco", 15, 1.44, 3, "vai dormir");

        System.out.println(cachorro1.getNumeroDeCachorros());

        Cachorro cachorro2 = new Cachorro("Puppy", "Marrom", 25, 5.5, 5, "nada");

        System.out.println(cachorro2.getNumeroDeCachorros());
        System.out.println(cachorro1.getNumeroDeCachorros());





    }


}