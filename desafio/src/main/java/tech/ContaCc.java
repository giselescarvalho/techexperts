package tech;

import java.util.Random;

public class ContaCc extends Conta{

    int numeroContaCorrente;



    public int setNumeroContaCorrente {
        Random contacorrente = new Random();
        this.numeroContaCorrente = contacorrente.nextInt(99999 + 1);

    }

    public int getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

}
