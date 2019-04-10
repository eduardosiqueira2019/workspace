package br.com.digitalhouse.Exercicio2;

public class SessaoDeTreinamento {

    private Integer experiencia;

    public Integer getExperiencia(){
        return experiencia;
    }

    public void setExperiencia(){
        experiencia+=1;
    }

    public void treinarA(JogadorDeFutebol jogador){
        System.out.println("Experiencia inicial: "+ jogador.getExperiencia());
        jogador.correr();
        jogador.fazerGol();
        jogador.correr();
        jogador.setExperiencia( jogador.getExperiencia() + 1);
        System.out.println("Experiência final: " + jogador.getExperiencia());
    }

}
