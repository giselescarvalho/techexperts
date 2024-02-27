package exceptions;

public class OpcaoInvalidaException extends Exception {

    public String getMessage(){
        return "------- Digite uma opção válida ------ \n";
    }

}
