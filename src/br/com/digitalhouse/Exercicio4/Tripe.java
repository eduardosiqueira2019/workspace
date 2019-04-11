package br.com.digitalhouse.Exercicio4;

public class Tripe {

    private Boolean dobrado;
    private int alturaMinima;
    private int alturaMaxima;
    private int alturaAtual;


    public void definirAltura(Integer novaAltura){
        alturaAtual = novaAltura;
    }

    public void dobrar(){
        dobrado = true;
    }

    public void desdobrar(){
        dobrado = false;
    }

    public void guardar(){
        dobrado = true ;
        alturaAtual = alturaMinima;
    }

    public void usar(){
        dobrado=false;
        alturaAtual = (alturaMaxima/2);
    }

    public Boolean prontoParaUsar(){
        return !dobrado && (alturaAtual >= (alturaMaxima/2)) ;
    }

    public Boolean prontoParaGuardar(){
        return dobrado && (alturaAtual < alturaMinima);
    }

    public Boolean getDobrado(){
        return dobrado;
    }
    public void setDobrado(Boolean estaDobrado){
        dobrado = estaDobrado;
    }

    public int getAlturaMinima(){
        return alturaMinima;
    }
    public void setAlturaMinima(int minimaNova){
        alturaMinima = minimaNova;
    }

    public int getAlturaMaxima(){
        return alturaMaxima;
    }
    public void  setAlturaMaxima(int maximaNova){
        alturaMaxima = maximaNova;
    }

    public int getAlturaAtual(){
        return alturaAtual;
    }
    public void setAlturaAtual(int atualNova){
        alturaAtual = atualNova;
    }


}
