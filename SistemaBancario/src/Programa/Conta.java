package Programa;

import java.util.Random;

public class Conta {

    private Pessoa titular;  // Agora, titular é um objeto da classe Pessoa
    private String agencia;
    private String numeroConta;
    private String senha;
    private double saldo;

    //Construtor da classe Conta
    public Conta(Pessoa titular, String senha, double saldo) {
        this.titular = titular;
        this.senha = senha;
        this.saldo = saldo;
        gerarNumerosConta();
    }

        // Método para gerar números de agência e conta
        private void gerarNumerosConta () {
            Random random = new Random();
            this.agencia = String.format("%04d", random.nextInt(10000));
            this.numeroConta = String.format("%05d", random.nextInt(100000));
        }


    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    //Metodos de deposito, saque
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor + ".");
        }
    }

    public void exibirInformacoes() {
        //System.out.println("Titular: " + titular.getNome());
        //System.out.println("CPF: " + titular.getCpf());
        //System.out.println("Endereço: " + titular.getEndereco());
        //System.out.println("Telefone: " + titular.getTelefone());
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numeroConta);
        //System.out.println("Saldo: R$" + saldo);
    }

}




