package Loops;

public class OrdemInversa {
    public static void main(String[] args) {
        int vetor [] = {0, 1, 2, 3, 4, 5};

        int count = 0;
        System.out.println("Vetor: ");
        while (count<(vetor.length)){
            System.out.print(vetor[count] +" ");
            count++;

        }
        System.out.println("\nVetor: ");
       for(int i = (vetor.length - 1); i >= 0; i--){
          System.out.print(vetor[i] + " ");
        }
        //retorna o tamanho do vetor
        //System.out.println(vetor.length);

    }
}
