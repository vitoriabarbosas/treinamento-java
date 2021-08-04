import java.util.Scanner; 

public class Exercicio2a{
    public static void main(String args[]){
    double lado;
    double area;

    System.out.printf("Escreva um valor de lado para o quadrado: ");
    Scanner valor = new Scanner(System.in);
    lado = valor.nextDouble();
    area = lado*lado;

    System.out.println("Calculo area:" + area);

    }
}