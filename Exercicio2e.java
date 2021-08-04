import java.util.Scanner; 

public class Exercicio2e{
    public static void main(String args[]){
    double basemaior;
    double basemenor;
    double altura;
    double area;

    System.out.printf("Escreva um valor de base maior para o trapezio: ");
    Scanner valor1 = new Scanner(System.in);
    basemaior = valor1.nextDouble();
    System.out.printf("Escreva um valor de base menor para o trapezio: ");
    Scanner valor2 = new Scanner(System.in);
    basemenor = valor2.nextDouble();
    System.out.printf("Escreva um valor de altura para o trapezio: ");
    Scanner valor3 = new Scanner(System.in);
    altura = valor3.nextDouble();
    area = (basemaior+basemenor)*altura/2;

    System.out.println("Calculo area:" + area);

    }
}