package mesesdoano;

import java.util.Random;

public class MesesDoAno {

    static int x;
    static Random mesesRandom = new Random();

    public static void main(String[] args) {

        String[] meses = new String[12];

        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                    meses[i] = "janeiro";
                    break;
                case 1:
                    meses[i] = "fevereiro";
                    break;
                case 2:
                    meses[i] = "março";
                    break;
                case 3:
                    meses[i] = "abril";
                    break;
                case 4:
                    meses[i] = "maio";
                    break;
                case 5:
                    meses[i] = "junho";
                    break;
                case 6:
                    meses[i] = "julho";
                    break;
                case 7:
                    meses[i] = "agosto";
                    break;
                case 8:
                    meses[i] = "setembro";
                    break;
                case 9:
                    meses[i] = "outubro";
                    break;
                case 10:
                    meses[i] = "novembro";
                    break;
                case 11:
                    meses[i] = "dezembro";
                    break;

            }

        }

        x = mesesRandom.nextInt(12);
        for (int i = 0; i < 12; i++) {
            if (i == x) {
                System.out.println("Mês escolhido é: " + meses[i]);
            }
        }

    }

}
