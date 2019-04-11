package br.com.digitalhouse.Exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {

        Atleta atleta1 = new Atleta();
        Atleta atleta2 = new Atleta();
        Prova prova1 = new Prova();
        Prova prova2 = new Prova();
        Prova prova3 = new Prova();

        atleta1.setEnergia(100);
        atleta1.setNivel(10);
        atleta1.setNome("Cyborg");

        atleta2.setEnergia(10);
        atleta2.setNivel(3);
        atleta2.setNome("Chinfrim");

        prova1.setDificuldade(1);
        prova1.setEnergiaNecessaria(3);
        prova2.setDificuldade((5));
        prova2.setEnergiaNecessaria(7);
        prova3.setDificuldade(10);
        prova3.setEnergiaNecessaria(9);

        System.out.println(prova1.podeRealizar(atleta1));
        System.out.println(prova2.podeRealizar(atleta1));
        System.out.println(prova3.podeRealizar(atleta1));

        System.out.println(prova1.podeRealizar(atleta2));
        System.out.println(prova2.podeRealizar(atleta2));
        System.out.println(prova3.podeRealizar(atleta2));

    }
}
