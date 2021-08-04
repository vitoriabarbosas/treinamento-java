import java.util.Scanner; 

public class Ex1114{
    public static void main(String args[]){
    int senha;

// Entrada dos valores
    System.out.println("Escreva a senha:  ");

// condições
    do{
    Scanner valor = new Scanner(System.in);
    senha = valor.nextInt();
    if(senha!=2002)
    System.out.println("Senha Invalida, digite novamente: ");
    }while (senha != 2002);

    System.out.println("Senha Correta!!! :) ");
    } 
    }
