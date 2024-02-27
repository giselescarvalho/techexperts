package tech;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Conta {

    //Menu Indique o que gostaria de fazer
     public static void main (String args[]) {

         Scanner scan = new Scanner(System.in);
         int menu1 = 0, menu2 = 0;

         try {
             System.out.println("------- MENU ------ \nIndique a opção desejada: " +
                     "\n1 - Criar Conta Corrente" +
                     "\n2 - Criar Conta Poupança" +
                     "\n3 - Acessar Conta" +
                     "\n4 - Sair");
             menu1 = scan.nextInt();

//         } catch (InputMismatchException excep){
//             System.out.println(excep.getMessage());
//         }
//
//
//
//  /*       if (menu1 == 3){
//             System.out.println("------- Acessar Conta ------ \nDigite: " +
//                     "\n1 - Depositar" +
//                     "\n2 - Sacar" +
//                     "\n3 - Consultar Saldo" +
//                     "\n4 - Encerrar Conta" );
//             menu2 = scan.nextInt();
//         } else if( menu1 != 1 || menu1 != 2 || menu1!= 4) {
//             System.out.println("------- Digite uma opção válida ------ \n");
//         }
//*/
         }
         if (menu1 == 1){
             boolean criaCc = true;
         } else if(menu1 == 2 ){
             boolean criaCc = false;
         }
         return criaCc;
     }


 //   private int senha;
    protected double saldoconta;
    int numeroAgencia, numeroContaCorrente, numeroContaPoupanca;

    Pessoa titular = new Pessoa();


    public void setNumeroAgencia(){
        //System.out.println(Math.floor(Math.random()*1000));
        Random agencia = new Random();

        this.numeroAgencia  = agencia.nextInt(9999 + 1) ;
         System.out.println("Seu número de Agência é: " +  numeroAgencia);

         if ( criaCc == true ){
             Random contacorrente = new Random();
             this.numeroContaCorrente = contacorrente.nextInt(99999 + 1);
             System.out.println("\nSua Conta Corrente é:    " + numeroContaCorrente );
         } else {
             System.out.println("\nSua Conta Poupança é:    " + numeroContaPoupanca);
         }

    }
    public int getNumeroAgencia() {
        return numeroAgencia;
    }


//
//    //metodos construtores
//   /* public Conta(int senha){
//        this.senha = senha;
//    }
//    */
//
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
//
//    /**/
//    /**/
//    /**/
//    /**/
//
////    private int getSenha(){
////        return senha;
////    }
////
////    public void setSenha(int senhacli){
////        this.senha = senha;
////    }
//
    public double getSaldoconta() {
        return saldoconta;
    }

    public void setSaldoconta(double saldoconta) {
        this.saldoconta = saldoconta;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }


    public Pessoa getTitular() {
        return titular;
    }
}

