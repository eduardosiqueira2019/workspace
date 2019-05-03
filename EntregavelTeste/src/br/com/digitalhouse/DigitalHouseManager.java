package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaDeAlunos = new ArrayList<>();
    private Aluno alunodh = new Aluno();
    private List<Professor> professoresDH = new ArrayList<>();
    private Professor professordhT = new ProfessorTitular("");
    private Professor professordhA = new ProfessorAdjunto(0);
    private List<Matricula> listaDematriculas = new ArrayList<>();
    private List<Curso> listaDeCursos = new ArrayList<>();


    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
        Curso cursodh = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        listaDeCursos.add(cursodh);
    }


    public void excluirCurso(Integer codigoCurso){
        for (int i = 0; i <= listaDeCursos.size()-1; i++) {

            if (listaDeCursos.get(i).getCodigoCurso().toString().equals(codigoCurso.toString())) {
                listaDeCursos.remove(i);
                System.out.println("Curso excluido com sucesso.");
                return;
            }
        }

    }


    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {
        Professor professordhA = new ProfessorAdjunto(0);
        professordhA.setNome(nome);
        professordhA.setSobreNome(sobrenome);
        professordhA.setCodigoProfessor(codigoProfessor);
        professordhA.setTempoDeCasa(0);
        professordhA.setCursoLecionado(0);
        professoresDH.add(professordhA);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        Professor professordhT = new ProfessorTitular("");
        professordhT.setNome(nome);
        professordhT.setSobreNome(sobrenome);
        professordhT.setCodigoProfessor(codigoProfessor);
        professordhT.setTempoDeCasa(0);
        professordhT.setCursoLecionado(0);
        professoresDH.add(professordhT);
    }

    public void excluirProfessor(Integer codigoProfessor) {
        for (Integer i = 0; i < professoresDH.size()-1; i++) {
            if (professoresDH.get(i).getCodigoProfessor().equals(codigoProfessor)) {
                professoresDH.remove(i);
            }
        }
    }


    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {
        int achouCurso = 0;
        for (int i = 0; i <= listaDeCursos.size()-1; i++) {

            if (listaDeCursos.get(i).getCodigoCurso().toString().equals(codigoCurso.toString())) {
                achouCurso = 1;
                for (int j = 0; j <= listaDeAlunos.size()-1; j++) {
                    if (listaDeAlunos.get(j).getCodigoAluno() == codigoAluno) {
                        Aluno oAluno = new Aluno(listaDeAlunos.get(j).getNome(), listaDeAlunos.get(j).getSobreNome(), listaDeAlunos.get(j).getCodigoAluno());
                        Curso oCurso = new Curso(listaDeCursos.get(i).getNome(), listaDeCursos.get(i).getCodigoCurso(), listaDeCursos.get(i).getQtdeMaxAlunos());
                        if (oCurso.adicionarUmAluno(oAluno)) {
                            Matricula matricula = new Matricula(oAluno, oCurso);
                            listaDematriculas.add(matricula);
                            System.out.println("Matrícula realizada com sucesso no curso " + codigoCurso + " para " + oAluno.getNome());
                            return;
                        } else {
                            System.out.println("Não há vagas diponíveis para o curso " + codigoCurso);
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
        if(achouCurso == 0) {
            System.out.println("Curso " + codigoCurso + " não encontrado.");
            return;
        }
    }


    public void consultarMatricula(Integer codigoAluno) {
        int achouAluno = 0;
        for (Aluno aluno : listaDeAlunos) {
            if (aluno.getCodigoAluno().equals(codigoAluno)) {
                achouAluno = 1;
                for (Matricula matricula : listaDematriculas) {
                    if (matricula.getAlunoMatriculado().equals(aluno)) {
                        System.out.println(aluno.getNome() + " está matriculado no curso:" + matricula.getCursoMatriculado().toString());
                        return;
                    }
                }
            }
        }
        if (achouAluno == 0) {
            System.out.println("Aluno não encontrado.");
            return;
        }
    }




    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {

        for (int i = 0; i < professoresDH.size()-1; i++) {
            if (professoresDH.get(i).getCodigoProfessor().equals(codigoProfessorTitular)) {
                professordhT.setCodigoProfessor(codigoProfessorTitular);
                professordhT.setCursoLecionado(codigoCurso);
            }
        }
        for (int i = 0; i < professoresDH.size()-1; i++) {
            if (professoresDH.get(i).getCodigoProfessor().equals(codigoProfessorTitular)) {
                professordhA.setCodigoProfessor(codigoProfessorAdjunto);
                professordhA.setCodigoProfessor(codigoCurso);
            }
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
