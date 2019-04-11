package br.com.digitalhouse.Exercicio5;

public class Exercicio5 {

    public static void main(String[] args) {

        Carro carro = new Carro();
        Cliente cliente = new Cliente();
        Concessionaria unidas = new Concessionaria();
        Vendas vendido = new Vendas();

        carro.setAnoFabricacao("01/01/2012");
        carro.setCor("PRETO");
        carro.setKilometragem(60000);
        carro.setMarca("Nissan");
        carro.setModelo("March");

        cliente.setContato("(011) 95565-9087");
        cliente.setNome("James");
        cliente.setSobrenome("West");

        unidas.registrarVenda(carro,cliente,15000.50d);




    }
}
