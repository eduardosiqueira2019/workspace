package br.com.digitalhouse;

import java.util.List;

public abstract class Professor extends Curso{
    private String nome;
    private String sobrenome;
    private Integer tempoDeCasa;
    private Integer codigoProfessor;


    public String getNome() {
        return nome;
    }

    public Professor(String nome, Integer codigoCurso, Integer qtdeMaxAlunos, List<Aluno> alunosMatriculados, String nome1, String sobrenome, Integer tempoDeCasa,
                     Integer codigoProfessor) {
        super();
        this.nome = nome1;
        this.sobrenome = sobrenome;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoProfessor = codigoProfessor;
    }

    public Professor() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobrenome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobrenome = sobreNome;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    @Override
    public boolean equals(Object objNovoProfessor) {

        Professor novoProfessor = (Professor) objNovoProfessor;
        if (codigoProfessor == novoProfessor.getCodigoProfessor()){
            return true;
        } else {
            return false;
        }
    }
}
