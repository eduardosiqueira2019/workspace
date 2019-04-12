package br.com.digitalhouse.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {

    private int qtdAtual;
    private List<Pessoa> ListaDePessoas ;



    public List<Pessoa> getPessoas(){
        return ListaDePessoas;
    }

    public int getQtdAtual (){
        return qtdAtual;
    }
    public void setQtdAtual(int novaQt){
        qtdAtual = novaQt;
    }


    public void cadastraPessoa(Pessoa pess){
        ListaDePessoas.add(pess);
    }

    public void imprimeCadastro(){
        int i = 0;
        for (Pessoa pessoa : ListaDePessoas) {
            System.out.println(ListaDePessoas.get(i));
            i++;
        }
    }
}
