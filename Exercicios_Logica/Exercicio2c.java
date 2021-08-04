import java.util.Scanner; 

public class Exercicio2c{
    public static void main(String args[]){
    double base;
    double altura;
    double area;

    System.out.printf("Escreva um valor de base para o triangulo: ");
    Scanner valor1 = new Scanner(System.in);
    base = valor1.nextDouble();
    System.out.printf("Escreva um valor de altura para o triangulo: ");
    Scanner valor2 = new Scanner(System.in);
    altura = valor2.nextDouble();
    area = (altura*base)/2;

    System.out.println("Calculo area:" + area);

    }
}