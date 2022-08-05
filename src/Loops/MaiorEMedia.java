package Loops;
/*Programa le 5 numeros. Informa o maior e a média*/

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        int numero;
        int count =0;
        int soma = 0;
        int maior = 0;
        float media;


        do {
            System.out.println("Informe um número");
            numero = scann.nextInt();

            soma = soma + numero;
            count = count +1;

            if(numero > maior){
                maior = numero;
            }
        }while (count < 5);

        media = soma / 5;
        System.out.println("Média " + media);

        System.out.println("Maior número " + maior);


    }

}
