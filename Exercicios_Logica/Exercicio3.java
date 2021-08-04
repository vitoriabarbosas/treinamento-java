import java.util.Scanner; 

public class Exercicio3{
    public static void main(String args[]){
    double salario;
    double kw;
    double kwreal;
    double kwq;
    double area;
    double desconto;

    System.out.printf("Digite o valor de seu salario: ");
    Scanner valor1 = new Scanner(System.in);
    salario = valor1.nextDouble();
    System.out.printf("Digite a quantidade kW gasta pela sua residencia: ");
    Scanner valor2 = new Scanner(System.in);
    kw = valor2.nextDouble();

    kwq = salario/700;
    System.out.println("1 kW equivale a: " + kwq);
    
    kwreal = (kw*kwq);
    System.out.println("Calculo kW em R$:" + kwreal);

    desconto = kwreal - (10*kwreal/100);
    System.out.println("Valor a ser pago com desconto de 10%: " + desconto);

    }
}