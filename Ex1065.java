import java.util.Scanner; 

public class Ex1065{
    public static void main(String args[]){

    int a, c = 0;

// Entrada dos valores
    System.out.println("Escreva 5 numeros inteiros:  ");

    for (int i=0; i < 5; i++) {
    Scanner valor = new Scanner(System.in);
    a = valor.nextInt();
    if ((a % 2 == 0) && (a > 0)) {
        c++;
    }
    }

    System.out.printf("Quantidade de numeros pares: " + c);
    }
}