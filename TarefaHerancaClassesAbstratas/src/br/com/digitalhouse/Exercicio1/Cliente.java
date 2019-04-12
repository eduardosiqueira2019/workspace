package br.com.digitalhouse.Exercicio1;

public class Cliente extends Pessoa {

    private int codigo;

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo (int novoCodigo){
        codigo = novoCodigo;
    }

    @Override
    public void imprimeDados() {

    }
}
