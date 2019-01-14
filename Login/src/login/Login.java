package login;

import java.util.Scanner;


public class Login {

    static String login;
    static String senha;

    public static void main(String[] args) {

        Login();

        if (login.equals("java8") && senha.equals("java8")) {
            System.out.printf("Login e senha aceitos!", login);
        } else {

            int contador = 2;
            while (contador != 0) {
                System.out.println("Você tem mais " + contador + " tentativas(s)");
                Login();
                if (login.equals("java8") && senha.equals("java8")) {
                    System.out.printf("Login e senha aceitos!", login);
                    contador = 0;
                } else {
                    contador = contador - 1;

                }

            }
        }
    }

    public static void Login() {
      Scanner in = new Scanner(System.in);

        System.out.println("login ");
        login = in.nextLine();
        System.out.println("senha ");
        senha = in.nextLine();

    }

}
