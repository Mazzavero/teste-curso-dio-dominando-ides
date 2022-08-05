package Loops;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorio = new int[20];

        for(int i = 0; i < numerosAleatorio.length; i++){
            int num = random.nextInt(100);
            numerosAleatorio[i] = num;
        }
        System.out.println("Números aleatorios");
        for ( int numero: numerosAleatorio) {
            System.out.print(numero + " ");
        }

        System.out.println("\nNúmeros aleatorios sucessores");
        for ( int numero: numerosAleatorio) {
            System.out.print((numero +1) + " ");
        }
    }
    
}
