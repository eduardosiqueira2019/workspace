package br.com.digitalhouse;

import java.util.Date;

public class Matricula {
    private Date dataMatricula;
    private Aluno alunoMatriculado = new Aluno();
    private Curso cursoMatriculado = new Curso();

    public Matricula(Aluno alunoMatriculado, Curso cursoMatriculado) {
        this.alunoMatriculado = alunoMatriculado;
        this.cursoMatriculado = cursoMatriculado;
        dataMatricula = new Date();
    }

    public Matricula() {
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Aluno getAlunoMatriculado() {
        return alunoMatriculado;
    }

    public void setAlunoMatriculado(Aluno alunoMatriculado) {
        this.alunoMatriculado = alunoMatriculado;
    }

    public Curso getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(Curso cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
