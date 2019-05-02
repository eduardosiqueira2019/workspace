package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Aluno> listaA = new ArrayList<>();

        DigitalHouseManager digital = new DigitalHouseManager();

        Aluno eduardo = new Aluno("Eduardo","Siqueira",11);
        Aluno paulo = new Aluno("Paulo","Silva",22);
        Aluno pedro = new Aluno("Pedro","Kassio",33);
        Aluno samanta = new Aluno("Samanta","Ferreira",44);
        Aluno joao = new Aluno("João","West",55);
        Aluno maria = new Aluno("Maria","Mococa",66);
        listaA.add(eduardo);
        listaA.add(paulo);
        listaA.add(pedro);
        listaA.add(samanta);
        listaA.add(joao);
        listaA.add(maria);

        digital.setListaDeAlunos(listaA);


        //registrar 2 professores de cada tipo
        digital.registrarProfessorTitular("Tairo","Roberto",1,"Java");
        digital.registrarProfessorTitular("TairoVisk","RobertoVisk",2,"HTML");
        digital.registrarProfessorAdjunto("Jéssica","Jones",3,0);
        digital.registrarProfessorAdjunto("Jénika","Clones",4,0);

        //registrar 2 cursos
        digital.registrarCurso("Full Stack",20001,3);
        digital.registrarCurso("Android",20002,2);

        //alocar um professor titular e um adjunto para cada curso
        digital.alocarProfessores(20001,1,3);
        digital.alocarProfessores(20002,2,4);

        //matricular 2 alunos no curso Full Stack
        digital.matricularAluno(11,20001);
        digital.matricularAluno(22,20001);
        //matricular 3 alunos no curso Android;
        digital.matricularAluno(44,20002);
        digital.matricularAluno(55,20002);
        digital.matricularAluno(33,20002);

        digital.consultarMatricula(11);

    }


}
