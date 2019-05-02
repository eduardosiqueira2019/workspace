package br.com.digitalhouse;

public class ProfessorAdjunto extends Professor{
    private Integer qtdeHorasMonitoria;

    public ProfessorAdjunto(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor, Integer qtdeHorasMonitoria) {
        super();
        this.qtdeHorasMonitoria = qtdeHorasMonitoria;
    }

    public ProfessorAdjunto(Integer qtdeHorasMonitoria) {
        this.qtdeHorasMonitoria = qtdeHorasMonitoria;
    }

    public ProfessorAdjunto (){

    }

    public Integer getQtdeHorasMonitoria() {
        return qtdeHorasMonitoria;
    }

    public void setQtdeHorasMonitoria(Integer qtdeHorasMonitoria) {
        this.qtdeHorasMonitoria = qtdeHorasMonitoria;
    }

}
