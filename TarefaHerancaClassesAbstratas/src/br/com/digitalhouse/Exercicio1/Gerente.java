package br.com.digitalhouse.Exercicio1;

public class Gerente extends Funcionario {


    private String area="";

    public String getArea(){
        return area;
    }
    public void setArea(String novaArea){
        area = novaArea;
    }

    public float calculaImposto(){
        return (getSalario() * 5)/100;
    }

    @Override
    public void imprimeDados() {

    }
}
