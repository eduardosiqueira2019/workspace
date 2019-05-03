package br.com.digitalhouse;

import java.util.List;

public abstract class Professor {
    private String nome;
    private String sobrenome;
    private Integer tempoDeCasa;
    private Integer codigoProfessor;
    private Integer cursoLecionado;


    public String getNome() {
        return nome;
    }

    public Professor(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor, Integer cursoLecionado) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoProfessor = codigoProfessor;
        this.cursoLecionado = cursoLecionado;
    }

    public Professor() {
    }

    public Integer getCursoLecionado() {
        return cursoLecionado;
    }

    public void setCursoLecionado(Integer cursoLecionado) {
        this.cursoLecionado = cursoLecionado;
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
