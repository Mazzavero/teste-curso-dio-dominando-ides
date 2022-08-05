package Loops;

/*Programa que lê o conjunto de dois dados. Nome e Idade.
* E pare de ler ao digitar 0*/
import java.util.Scanner;

public class nomeEidade {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Digite o nome");
            nome = scann.next();
            if(nome.equals("0")) break;

            System.out.println("Digite a idade");
            idade = scann.nextInt();
        }

    }
}
