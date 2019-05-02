package br.com.digitalhouse;

public class Aluno {
    private String nome;
    private String sobrenome;
    private Integer codigoAluno;

    public Aluno(String nome, String sobreNome, Integer codigoAluno) {
        this.nome = nome;
        this.sobrenome = sobreNome;
        this.codigoAluno = codigoAluno;
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
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

    public Integer getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(Integer codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    @Override
    public boolean equals(Object objOutroAluno) {

        Aluno outroAluno = (Aluno) objOutroAluno;
        if(codigoAluno == outroAluno.getCodigoAluno()){
            return true;
        } else {
            return false;
        }


    }
}
