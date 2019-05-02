package br.com.digitalhouse;

import java.sql.CallableStatement;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private Integer codigoCurso;
    private Integer qtdeMaxAlunos;
    private List<Aluno> alunosMatriculados = new ArrayList<>();


    public Curso(String nome, Integer codigoCurso, Integer qtdeMaxAlunos) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.qtdeMaxAlunos = qtdeMaxAlunos;
    }


    public Boolean adicionarUmAluno(Aluno umAluno){
        if (alunosMatriculados.size() <  this.getQtdeMaxAlunos()){
            alunosMatriculados.add(umAluno);
            return true;
        } else {
            return false;
        }


    }

    public void excluirAluno(Aluno umAluno){
        for (Aluno aluno:alunosMatriculados  ) {
            if(aluno.getCodigoAluno() == umAluno.getCodigoAluno()){
                alunosMatriculados.remove(alunosMatriculados.indexOf(aluno));
            }
        }
    }

    public Curso() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }


    public Integer getQtdeMaxAlunos() {
        return qtdeMaxAlunos;
    }

    public void setQtdeMaxAlunos(Integer qtdeMaxAlunos) {
        this.qtdeMaxAlunos = qtdeMaxAlunos;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    @Override
    public boolean equals(Object objNovoCurso) {

        Curso novoCurso = (Curso) objNovoCurso;
        if(codigoCurso == novoCurso.getCodigoCurso()){
            return true;
        }else {
            return false;
        }
    }
}
