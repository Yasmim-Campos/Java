package Aula02;

public class Caneta {
    String modelo;
    String cor;
    Float ponta;
    int carga;
    boolean tampada;


    void status(){
        System.out.println("Uma caneta" + this.cor);
        System.out.println("esta tampada" + this.tampada );
        System.out.println("Carga" + this.carga);
        System.out.println("Ponta"+ this.ponta);
        System.out.println("Modelo" + this.modelo);

    }

    void rabiscar(){
        if(this.tampada==true){
            System.out.println(" ERRO nao pode rabiscar");
        } else {
            System.out.println("Rabiscando");
        }

    }

    void tampar(){
        this.tampada=true;
    }
    void destampar(){
        this.tampada = false ;

    }

}
