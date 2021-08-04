import java.util.Scanner; 

public class Ex1070{
    public static void main(String args[]){

    int a, c = 0;
    int impar = 0;
// Entrada dos valores
    System.out.println("Escreva 1 numero inteiro:  ");
    Scanner valor = new Scanner(System.in);
    a = valor.nextInt();

// condições
    while (impar != 6){
    if ((a % 2 == 0) && (a > 0)) {
        a++;
    }
    else {
        System.out.printf(" " + a);
        impar++;
        a++;
    } 
    }
    }
}