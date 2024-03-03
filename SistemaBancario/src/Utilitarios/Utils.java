package Utilitarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utils {

    //metodo para formatar numero
    static NumberFormat formatandoValores = new DecimalFormat("R$ #,##0.00");


    //transformando o valor tipo double em string com a formatacao
    public static String doubleToString(Double valor){
        return formatandoValores.format(valor);
    }
}
