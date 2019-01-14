package metodos;

import java.util.Scanner;

public class Metodos {

    static int idioma;
    static int mes;

    public static void main(String[] args) {
        MesPorExtenso();
    }

    private static void MesPorExtenso() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o número correspondente ao mês?");
        mes = entrada.nextInt();
        System.out.println("Qual o número do idioma sugerido?");
        idioma = entrada.nextInt();
        if (idioma == 1) {
            switch (mes) {
                case 1:
                    System.out.println("Janeiro");
                    break;
                case 2:
                    System.out.println("Fevereiro");
                    break;
                case 3:
                    System.out.println("Março");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Maio");
                    break;
                case 6:
                    System.out.println("Junho");
                    break;
                case 7:
                    System.out.println("Julho");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Setembro");
                    break;
                case 10:
                    System.out.println("Outubro");
                    break;
                case 11:
                    System.out.println("Novembro");
                    break;
                case 12:
                    System.out.println("Dezembro");
                    break;

            } 
        }else if(idioma == 2){
                   switch (mes){
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("Febrary");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
            } 
        }

        }
    }


