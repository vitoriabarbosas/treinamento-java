import java.util.Scanner; 

public class Cedulas{
    public static void main(String args[]){
    int total, hora, min, seg;

    System.out.printf("Escreva a quantidade dos segundos: ");
    Scanner valor1 = new Scanner(System.in);
    total = valor1.nextDouble();

    hora = total/3600;
    min = (total - (hora * 3600)) / 60;
    seg = total % 60;
    System.out.println("Equivalente a %d : %d : %d " + kml);

    }
}