import java.util.Scanner; 

public class Exercicio5{
    public static void main(String args[]){
    double tempo;
    double velocidade;
    double km;
    double kml;

    System.out.printf("Escreva o tempo gasto na viagem: ");
    Scanner valor1 = new Scanner(System.in);
    tempo = valor1.nextDouble();
    System.out.printf("Escreva o valor da velocidade media percorrida: ");
    Scanner valor2 = new Scanner(System.in);
    velocidade = valor2.nextDouble();

    km = tempo*velocidade;
    kml = km/12;

    System.out.println("A quantidade de litros de combustivel gasto na viagem foi: " + kml);

    }
}