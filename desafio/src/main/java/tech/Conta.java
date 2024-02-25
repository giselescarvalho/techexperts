package tech;

import java.util.Random;

public class Conta {


 //   private int senha;
    private double saldoconta;
    int numeroAgencia, numeroContaCorrente, numeroContaPoupanca;

    Pessoa titular = new Pessoa();


    public void setNumeroAgencia(){
        //System.out.println(Math.floor(Math.random()*1000));
        Random agencia = new Random();

        this.numeroAgencia  = agencia.nextInt(9999 + 1) ;
         System.out.println("Seu número de Agência é: " +  numeroAgencia ;
//                 +
//                    "\nSua Conta Corrente é:    " + numeroContaCorrente +
//                    "\nSua Conta Poupança é:    " + numeroContaPoupanca);

    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroContaCorrente{
        Random contacorrente = new Random();
        this.numeroContaCorrente = contacorrente.nextInt(99999 + 1);

    }

    public int getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaPoupanca() {
        Random contapoupanca = new Random();

  //      if(contacorrente != contapoupanca) {
            this.numeroContaPoupanca = contapoupanca.nextInt(999999 + 1);
  //      }
    }

    //metodos construtores
   /* public Conta(int senha){
        this.senha = senha;
    }
    */

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

//    private int getSenha(){
//        return senha;
//    }
//
//    public void setSenha(int senhacli){
//        this.senha = senha;
//    }

    public double getSaldoconta() {
        return saldoconta;
    }

    public void setSaldoconta(double saldoconta) {
        this.saldoconta = saldoconta;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }



//
//    public Pessoa getTitular() {
//        return titular;
    }
}
