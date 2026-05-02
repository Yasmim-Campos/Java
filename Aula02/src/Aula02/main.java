package Aula02;

public class main {
    public static void main(String[]args){
        Caneta c1 = new Caneta();
        c1.cor = " AZUL";
        c1.modelo = " big";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.tampar();
        c1.rabiscar();
        c1.status();


    }

}
