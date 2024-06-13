import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Rex", "Marrom", 6);
        Gato gato1 = new Gato("Felix", "Preto", 4.5 );
        Passaro passaro1 = new Passaro("Frajola", "Azul" , 8.5);
        Animal gato2 = new Gato("Felix", "Preto", 4.5 );
        Animal passaro4 = new Passaro("Felix", "Preto", 4.5 );
// Todo gato é um animal mas nem todo animal é um gato

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();


        //       Começo da aula de polimorfismo:
//        Cachorro cachorro1 = new Cachorro("Rex", "Marrom", 6);
//         Gato gato1 = new Gato("Felix", "Preto", 4.5 );
//       Passaro passaro1 = new Passaro("Frajola", "Azul" , 8.5);
//        Petshop petshop = new Petshop();

 //       petshop.darBanho(cachorro1);
//        System.out.println(cachorro1.getEstadoEspirito());

//        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoEspirito());

 //       petshop.tosar(cachorro1);
 //       System.out.println(cachorro1.getEstadoEspirito());
    }


}