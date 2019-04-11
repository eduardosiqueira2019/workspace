package br.com.digitalhouse.Exercicio5;

public class Vendas {

    private Double valorDaVenda;
    private Carro veiculoVendido;
    private Cliente cliente;


    public Double getValorDaVenda(){
        return valorDaVenda;
    }
    public void setValorDaVenda(Double valorVendaNovo){
        valorDaVenda = valorVendaNovo;
    }

    public Carro getVeiculoVendido(){
        return veiculoVendido;
    }
    public void setVeiculoVendido(Carro veiculoVendidoNovo){
        veiculoVendido = veiculoVendidoNovo;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente clienteNovo) {
        cliente = clienteNovo;
    }
}
