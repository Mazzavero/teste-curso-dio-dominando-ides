package Loops;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int n;
        int numero;
        int npar = 0;
        int nimpar = 0;
        int count = 0;

        System.out.println("Quantos números serão avaliados");
        n = scann.nextInt();

        do{
            System.out.println("Digite um número");
            numero = scann.nextInt();
            count++;
            if((numero % 2) == 0){
                npar++;
            }else{
                nimpar++ ;
            }


        }while(count < n);

        System.out.println("Qtidade de pares " + npar);

        System.out.println("Qtidade de impares " + nimpar);


    }
}
