package tech;

public class CriaConta {

    public static void main (String[] args){
        Pessoa titular = new Pessoa();
        Conta conta1 = new Conta(1234);

       // Pessoa pessoa1 = new Pessoa();
        titular.getNome();
        titular.getCpf();
        titular.getEndereco();
        titular.getTelefone();

//      //  Conta conta1 = new Conta();
//        conta1.setSenha(1234);
//        conta1.setSaldoconta(0);


        conta1.criaAgCc();
        System.out.print(titular.getNome() + ", sua conta tem" + "\nSaldo da conta:          " + conta1.getSaldoconta());
    //    System.out.print("Saldo da conta:          " + conta1.getSenha());


    }


}
