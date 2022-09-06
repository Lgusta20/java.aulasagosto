package application;

import java.util.Scanner;

public class Program {

    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);

        System.out.println("login>");
        String login= in.nextLine();

        System.out.println("senha>");
        String senha = in.nextLine();

        if (login.equals("gusta") && senha.equals("1951")){
            System.out.println("Usuario %s logado com sucesso."+login);
        }
        else{
            System.out.println("Login e senha invalidos!");
        }
    }
}
