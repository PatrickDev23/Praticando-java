package animais;

public class Cachorro {

    //Atributos
    private String nome;
    private  String cor;
    private double altura;

    private double peso;
    private String estadoDeEspirito;

    private String comida;


    // Construtores
    public Cachorro(){}
   public Cachorro(String nome, String cor, double altura, double peso, String estadoDeEspirito, String comida){
        this.nome = nome;
        this.cor = cor;
        this. altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
        this.comida = comida;
    }

    //Métodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public String getComida(){
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public void latir() {
        System.out.println("AU AU");
    }


    public String comer(String racao){
        if (racao.equals("ração de carne"))
         this.setComida("sastifeito");

        else if (racao.equals("ração de frango")){
            this.setComida("Bravo");
        }

        return comida;
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

