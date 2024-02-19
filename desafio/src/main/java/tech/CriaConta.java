package tech;

public class CriaConta {

    public static void main (String[] args){
        new Conta();

        Conta pessoa1 = new Conta();
        pessoa1.nome = "Joao";
        pessoa1.cpf = 8144;
        pessoa1.endereco = "Rua dos Rubis";
        pessoa1.telefone = "1140048922";
        pessoa1.senha = 1234;
        pessoa1.saldoconta = 0;


        pessoa1.criaAgCc();
        System.out.print("saldo da conta: " + pessoa1.saldoconta);

    }


}
