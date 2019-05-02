package br.com.digitalhouse;

public class ProfessorTitular extends Professor{
    private String especialidade;

    public ProfessorTitular(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor, String especialidade) {
        super();
        this.especialidade = especialidade;
    }



    public ProfessorTitular(String especialidade) {
        this.especialidade = especialidade;
    }

    public ProfessorTitular(){

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
