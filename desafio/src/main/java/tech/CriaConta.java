package tech;

public class CriaConta {

    public static void main (String[] args){
        Pessoa pessoa1 = new Pessoa();
        Conta conta1 = new Conta(1234);

       // Pessoa pessoa1 = new Pessoa();
        pessoa1.getNome();
        pessoa1.getCpf();
        pessoa1.getEndereco();
        pessoa1.getTelefone();

      //  Conta conta1 = new Conta();
        conta1.setSenha(1234);
        conta1.setSaldoconta(0);


        conta1.criaAgCc();
        System.out.print(pessoa1.getNome() + " sua conta tem" + "\nSaldo da conta:          " + conta1.getSaldoconta());
    //    System.out.print("Saldo da conta:          " + conta1.getSenha());


    }


}
