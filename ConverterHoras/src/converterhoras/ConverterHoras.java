package converterhoras;

import java.util.Scanner;

public class ConverterHoras {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite os segundos ");
        int segundos = in.nextInt();
        System.out.println(converterHoras(segundos)); 
    }

    public static String converterHoras(int elapsed) {

        int segundos = elapsed % 60;
        elapsed /= 60;

        int min = elapsed % 60;
        elapsed /= 60;

        int hrs = elapsed % 24;

        return strzero(hrs) + ":" + strzero(min) + ":" + strzero(segundos);
    }

    private static String strzero(int n) {
        if( n < 10) 
         return "0" + String.valueOf(n);
        return String.valueOf(n);
       
    }

}
