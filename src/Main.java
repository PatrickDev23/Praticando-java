import animais.Cachorro;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro1;
        cachorro1 = new Cachorro();

        cachorro1.nome = "Thor";
        cachorro1.cor = "Branco e Preto";
        cachorro1.altura = 1.25;
        cachorro1.peso =  40.5;

        cachorro1.latir();

        System.out.println( "O cachorro pegou a " + cachorro1.pegar());

        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro " + cachorro1.interagir("Vai dormir"));
        System.out.println("O cachorro está " + cachorro1.interagir("Triste"));
    }

}
