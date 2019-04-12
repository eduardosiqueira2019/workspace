package br.com.digitalhouse.Exercicio1;

public class Funcionario extends Pessoa {

    private float salario = 0;

    public float calculaImposto(){
        return (salario * 3)/100;
    }

    public float getSalario(){
        return salario;
    }


    public void setSalario (float novoSalario){
        salario = novoSalario;
    }

    @Override
    public void imprimeDados() {

    }
}
