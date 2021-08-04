import java.util.Scanner; 

public class Ex1047{
    public static void main(String args[]){
    int hi, hf, mi, mf;
    double soma_inicial, soma_final, total;

    System.out.printf("Escreva a hora inicial:  ");
    Scanner valor1 = new Scanner(System.in);
    hi = valor1.nextInt();
    System.out.printf("Escreva o minuto inicial:  ");
    Scanner valor2 = new Scanner(System.in);
    mi = valor2.nextInt();

    System.out.printf("Escreva a hora final:  ");
    Scanner valor3 = new Scanner(System.in);
    hf = valor3.nextInt();
    System.out.printf("Escreva o minuto final:  ");
    Scanner valor4 = new Scanner(System.in);
    mf = valor4.nextInt();

    soma_inicial = (hi *60) + mi;
    System.out.println(soma_inicial);
    soma_final = (hf * 60) + mf;
    System.out.println(soma_final);
    total = soma_final - soma_inicial;

    if (total > 0){
    double t; 
    t = total/1440;
    System.out.printf("A duracao foi de: " + t);
    }

    else if(total == 0){
    System.out.printf("A duracao foi de 24 horas");
    }

    else{ 
        System.out.printf("fora da duracao permitida!");
    }
}
}