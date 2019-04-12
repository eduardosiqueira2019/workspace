package br.com.digitalhouse.Exercicio1;

public class TestaCadastro extends Pessoa {

    public static void main(String[] args) {

        //Cadastra um objeto de cada subclasse de Pessoa e depois imprime todo o cadastro

        CadastroPessoas cadastroPessoa = new CadastroPessoas();
        Cliente nomeCliente = new Cliente();
        Funcionario nomeFuncionario = new Funcionario();
        Gerente nomeGerente = new Gerente();

        nomeCliente.setNome(nomeCliente.getNome());
        nomeFuncionario.setNome(nomeFuncionario.getNome());
        nomeGerente.setNome(nomeGerente.getNome());

        System.out.println(nomeCliente.getNome());
        //cadastroPessoa.cadastraPessoa();

    }

    @Override
    public void imprimeDados() {

    }
}
