package tech;

public class CriaConta {

    public static void main (String[] args){
        new Pessoa();
        new Conta();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Joao";
        pessoa1.cpf = 8144;
        pessoa1.endereco = "Rua dos Rubis";
        pessoa1.telefone = "1140048922";

        Conta conta1 = new Conta();
        conta1.senha = 1234;
        conta1.saldoconta = 0;


        conta1.criaAgCc();
        System.out.print("Saldo da conta:          " + conta1.saldoconta);



    }


}
