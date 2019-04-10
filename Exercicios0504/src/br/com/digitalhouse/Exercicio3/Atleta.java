package br.com.digitalhouse.Exercicio3;

public class Atleta {

    private String nome;
    private int nivel;
    private Integer energia;

    public String getNome(){
        return nome;
    }
    public void setNome(String nomeNovo){
        nome = nomeNovo;
    }

    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivelNovo){
        nivel = nivelNovo;
    }

    public Integer getEnergia(){
        return energia;
    }
    public void setEnergia(Integer energiaNova){
        energia = energiaNova;
    }

}
