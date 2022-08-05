package Loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        System.out.println(" Fatorial de :");

        int numero = scann.nextInt();

        int fatorial = 1;

        for (int i = numero; i >= 1 ; i--){
            fatorial = fatorial * i;
        }

        System.out.println("Fatorial de "+ numero + " igual a " + fatorial);

    }
}
