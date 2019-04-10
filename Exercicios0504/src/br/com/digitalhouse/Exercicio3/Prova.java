package br.com.digitalhouse.Exercicio3;

public class Prova {

    private int dificuldade;
    private Integer energiaNecessaria;



    public boolean podeRealizar(Atleta atleta){
        return (atleta.getNivel() >= getDificuldade()) &&
               (atleta.getEnergia()>= getEnergiaNecessaria());
    }


    public int getDificuldade(){
        return dificuldade;
    }
    public void setDificuldade(int dificuldadeNova){
        dificuldade = dificuldadeNova;
    }

    public Integer getEnergiaNecessaria(){
        return energiaNecessaria;
    }
    public void setEnergiaNecessaria(Integer energiaNova){
        energiaNecessaria = energiaNova;
    }

}
