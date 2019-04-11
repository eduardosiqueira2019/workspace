package br.com.digitalhouse.Exercicio4;

public class Exercicio4 {

    public static void main(String[] args) {

        Tripe tripe = new Tripe();

        tripe.setAlturaAtual(50);
        tripe.setAlturaMaxima(100);
        tripe.setAlturaMinima(1);
        tripe.setDobrado(true);

        System.out.println(tripe.getAlturaAtual());
        System.out.println(tripe.getDobrado());
        //tripe.desdobrar();
        System.out.println(tripe.getDobrado());
        System.out.println(tripe.prontoParaUsar());
        tripe.usar();
        System.out.println("------------------------");
        System.out.println(tripe.prontoParaUsar());


    }
}
