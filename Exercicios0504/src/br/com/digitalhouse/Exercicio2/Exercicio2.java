package br.com.digitalhouse.Exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {


        JogadorDeFutebol jogador1 = new JogadorDeFutebol();
        JogadorDeFutebol jogador2 = new JogadorDeFutebol();
        SessaoDeTreinamento treino = new SessaoDeTreinamento();

        jogador1.setNome("Casagrande");
        jogador1.setExperiencia(80);
        jogador1.setAlegria(90);
        jogador1.setEnergia(70);

        jogador2.setNome(("Zico"));
        jogador2.setExperiencia(95);
        jogador2.setAlegria(80);
        jogador2.setEnergia(50);


        treino.treinarA(jogador2);

    }


}
