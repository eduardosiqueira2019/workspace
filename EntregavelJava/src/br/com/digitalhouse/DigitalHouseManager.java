package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaDeAlunos = new ArrayList<>(); private Aluno alunodh = new Aluno();
    private List<Professor> professoresDH = new ArrayList<>();private Professor professordhT = new ProfessorTitular("");private Professor professordhA = new ProfessorAdjunto(0);
    private List<Matricula> listaDematriculas = new ArrayList<>();
    private List<Curso> listaDeCursos = new ArrayList<>();


    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos){
        Curso cursodh = new Curso(nome,codigoCurso,quantidadeMaximaDeAlunos);
        listaDeCursos.add(cursodh);
    }

/*
    public void excluirCurso(Integer codigoCurso){
        for (Integer i = 0; i < this.cursodh.RetornarListaCurso().size(); i++) {
            if(cursodh.RetornarListaCurso().get(i).getCodigoCurso().equals(codigoCurso) ){
                cursodh.RetornarListaCurso().remove(i);
            }
        }
    }
*/

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){
        professordhA.setNome(nome);
        professordhA.setSobreNome(sobrenome);
        professordhA.setCodigoProfessor(codigoProfessor);
        professordhA.setTempoDeCasa(0);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){
        professordhT.setNome(nome);
        professordhT.setSobreNome(sobrenome);
        professordhT.setCodigoProfessor(codigoProfessor);
        professordhT.setTempoDeCasa(0);
    }

    public void excluirProfessor(Integer codigoProfessor){
        for (Integer i = 0; i < professoresDH.size(); i++) {
            if(professoresDH.get(i).getCodigoProfessor().equals(codigoProfessor) ){
                professoresDH.remove(i);
            }
        }
    }


    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
        for (Integer i = 0; i <= listaDeCursos.size();i++) {
            //if(listaDeCursos.get(i).getCodigoCurso().equals(codigoCurso)){
            //System.out.println(listaDeCursos.get(i).getCodigoCurso().toString().equals(codigoCurso.toString()));

            if(listaDeCursos.get(i).getCodigoCurso().toString().equals(codigoCurso.toString())){
                for(Integer j = 0; j <= listaDeAlunos.size();j++){
                    //if(listaDeAlunos.get(j).getCodigoAluno().equals(codigoAluno)){
                    if(listaDeAlunos.get(j).getCodigoAluno() == codigoAluno){
                        Aluno oAluno = new Aluno(listaDeAlunos.get(j).getNome(),listaDeAlunos.get(j).getSobreNome(),listaDeAlunos.get(j).getCodigoAluno());
                        Curso oCurso = new Curso(listaDeCursos.get(i).getNome(),listaDeCursos.get(i).getCodigoCurso(),listaDeCursos.get(i).getQtdeMaxAlunos());
                        if(oCurso.adicionarUmAluno(oAluno)){
                            Matricula matricula = new Matricula(oAluno,oCurso);
                            listaDematriculas.add(matricula);
                            System.out.println("Matrícula realizada com sucesso.");
                            return;
                        } else {
                            System.out.println("Não há vagas diponíveis.");
                            return;
                        }
                    } else {
                        //System.out.println("Aluno não encontrado.");
                        //return;

                    }

                }
            } else {
                //System.out.println("Curso não encontrado.");
                //return;
            }

        }

    }


    public void consultarMatricula(Integer codigoAluno){
        System.out.println(listaDeAlunos.size());
            if(listaDeAlunos.contains(codigoAluno)){
                for (Aluno aluno: listaDeAlunos) {
                    if(aluno.getCodigoAluno().equals(codigoAluno)) {
                        for (Matricula matricula: listaDematriculas) {
                            if (matricula.getAlunoMatriculado().equals(aluno)){
                                System.out.println("Você está matriculado no curso:" + matricula.getCursoMatriculado());
                            }
                        }
                    }
                }
            } else {
                System.out.println("Aluno não encontrado.");
            }
    }


    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){
        if(professoresDH.contains(codigoProfessorTitular)){
            professordhT.setCodigoCurso(codigoCurso);
            professordhT.setCodigoProfessor(codigoProfessorTitular);
        }
        if(professoresDH.contains(codigoProfessorAdjunto)){
            professordhA.setCodigoCurso(codigoCurso);
            professordhA.setCodigoProfessor(codigoProfessorAdjunto);
        }


    }




    public DigitalHouseManager() {
    }

    public List<Aluno> getAlunosDH() {
        return listaDeAlunos;
    }

    public void setAlunosDH(List<Aluno> alunosDH) {
        this.listaDeAlunos = alunosDH;
    }

    public List<Professor> getProfessoresDH() {
        return professoresDH;
    }

    public void setProfessoresDH(List<Professor> professoresDH) {
        this.professoresDH = professoresDH;
    }

  /*  public List<Curso> getCursosDH() {
        return cursodh.RetornarListaCurso();
    }
*/
//    public void setCursosDH(List<Curso> cursosDH) {
 //       this.listaCursosDH = cursosDH;
  //  }

    public List<Matricula> getMatriculasDH() {
        return listaDematriculas;
    }

    public void setMatriculasDH(List<Matricula> matriculasDH) {
        this.listaDematriculas = matriculasDH;
    }

}
