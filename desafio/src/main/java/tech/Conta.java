package tech;

import java.util.Random;

public class Conta {


    private int senha;
    private double saldoconta;


    public void criaAgCc(){
        //System.out.println(Math.floor(Math.random()*1000));
        Random agencia = new Random();
        Random contacorrente = new Random();
        Random contapoupanca = new Random();

        if(contacorrente != contapoupanca) {
            System.out.println("Seu número de Agência é: " + agencia.nextInt(9999 + 1) +
                    "\nSua Conta Corrente é:    " + contacorrente.nextInt(99999 + 1) +
                    "\nSua Conta Poupança é:    " + contapoupanca.nextInt(999999 + 1));
        }
    }
//metodos construtores
    public Conta(int senha){
        this.senha = senha;
    }

//comportamentos

    public void deposita(double valor){
        this.saldoconta = this.saldoconta + valor;
    }

    public boolean saca(double valor){
        if (this.saldoconta >= valor){
            this.saldoconta = this.saldoconta - valor;
            return true;
        } else {
            return false;
        }
    }

    /**/
    /**/
    /**/
    /**/

    private int getSenha(){
        return senha;
    }

    public void setSenha(int senhacli){
        this.senha = senha;
    }

    public double getSaldoconta() {
        return saldoconta;
    }

    public void setSaldoconta(double saldoconta) {
        this.saldoconta = saldoconta;
    }

}
