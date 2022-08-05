package Loops;

/*Programa pede nota entre zero e 10.
 Se valor inválido informe que é inválido e continue pdindo até vaor válido ser inserido */

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int nota;

            System.out.println("Informe nota");
            nota = scann.nextInt();

        while(nota < 0 | nota > 10) {
            System.out.println("Informe nota válida. Digite novamente");
            nota = scann.nextInt();
        }
    }
}
