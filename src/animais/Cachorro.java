package animais;

public class Cachorro {
    public String nome;
    public  String cor;
    public double altura;

    public double peso;
    public String estadoDeEspirito;

    public void comer(){

    }

    public void latir() {
        System.out.println("AU AU");
    }


    public  String pegar(){
        return "Bolinha";
    }
    public String interagir(String acao){
//
        switch (acao){
            case "carinho": this.estadoDeEspirito = "Feliz";
            break;
            case "Vai dormir": this.estadoDeEspirito = "Bravo";
            break;
            case "Pisar na patinha": this.estadoDeEspirito = "Triste";
            break;
            default: this.estadoDeEspirito = "Neutro";

        }

        return acao;
    }
//
//        if(acao.equals("carinho")){
//            this.estadoDeEspirito = "Feliz";
//
//     } else if (acao.equals("Vai dormir")){
//            this.estadoDeEspirito = "bravo";
//
//        } else {
//            this.estadoDeEspirito = "Neutro";
//        }
//            return estadoDeEspirito;
//    }

}

