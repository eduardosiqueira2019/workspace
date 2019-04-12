package br.com.digitalhouse.Exercicio1;

import java.util.Date;

public abstract class Pessoa {

    private String nome;
    private Date nascimento = new Date();

    public String getNome(){
        return nome;
    }
    public void setNome(String novoNome){
        nome = novoNome;
    }

    public abstract void imprimeDados();


}
