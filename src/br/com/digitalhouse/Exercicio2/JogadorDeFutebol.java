package br.com.digitalhouse.Exercicio2;

public class JogadorDeFutebol {

    private String nome;
    private Integer energia;
    private Integer alegria;
    private Integer gols;
    private Integer experiencia;


    public void fazerGol(){
        getEnergia();
        setEnergia(5);
        getAlegria();
        setAlegria(10);
        setGols(1);
        System.out.println("GOOOOL!");
    }

    public void correr(){
        energia=energia -10;
        System.out.println("Cansei;");
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nomeNovo){
        nome = nomeNovo;
    }

    public Integer getEnergia(){
        return energia;
    }
    public void setEnergia (Integer energiaNova) {
        energia = energiaNova;
    }

    public Integer getAlegria(){
        return alegria;
    }
    public void setAlegria(Integer alegriaNova){
        alegria = alegriaNova;
    }

    public Integer getGols(){
        return gols;
    }
    public void setGols(Integer golsNovos) {
        gols = golsNovos;
    }

    public Integer getExperiencia(){
        return experiencia;
    }
    public void setExperiencia(Integer experienciaNova){
        experiencia = experienciaNova;
    }


}
