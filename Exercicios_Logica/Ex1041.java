import java.util.Scanner; 

public class Ex1041{
    public static void main(String args[]){
    double x, y;

    System.out.printf("Escreva o valor de x:  ");
    Scanner valor1 = new Scanner(System.in);
    x = valor1.nextDouble();
    System.out.printf("Escreva o valor de y:  ");
    Scanner valor2 = new Scanner(System.in);
    y = valor2.nextDouble();

    if (x > 0){
        if (y>0) {
        System.out.printf("Q1"); } 
        else if (y<0){
        System.out.printf("Q4"); }
        else{
        System.out.printf("Erro de Leitura");
        }
    }
    else if (x<0){
        if (y>0) {
        System.out.printf("Q2"); } 
        else if (y<0){
        System.out.printf("Q3"); }
        else{
        System.out.printf("Erro de Leitura");   }
    }
    else {
        System.out.println("Seu ponto está na origem ");}
    }  
}