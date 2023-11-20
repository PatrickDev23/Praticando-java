import animais.Cachorro;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Coringa","verde",50,80,"Normal","Com Fome");
        Cachorro cachorro2 = new Cachorro("Bobb","Branco",1.8,80,"Feliz","Sastifeito");

        System.out.println(cachorro2.toString());
        System.out.println(cachorro1.toString());

    }

}
