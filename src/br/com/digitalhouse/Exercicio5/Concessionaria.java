package br.com.digitalhouse.Exercicio5;

public class Concessionaria {

    private Vendas vendas = new Vendas();

    public void registrarVenda(Carro veiculo, Cliente cliente, Double valor){

        vendas.setCliente(cliente);
        vendas.setVeiculoVendido(veiculo);
        vendas.setValorDaVenda(valor);

        System.out.println(valor);
    }


    public Vendas getVendas(){
        return vendas;
    }

    public void setVendas (Vendas vendaNova){
        vendas = vendaNova;
    }
}
