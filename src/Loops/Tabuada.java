package Loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        System.out.println("Tabuada de :");
        int numero = scann.nextInt();

        System.out.println(" Tabuada de "+ numero);

        for(int i = 1; i< 11; i++){
            System.out.println(numero + "*" + i + "=" + numero*i );
        }




    }
}
