package tech;

import java.util.Random;

public class ContaPoup extends Conta{

    int numeroContaPoupanca;

    public void setNumeroContaPoupanca() {
        Random contapoupanca = new Random();

        //      if(contacorrente != contapoupanca) {
        this.numeroContaPoupanca = contapoupanca.nextInt(999999 + 1);
        //      }
    }


}
