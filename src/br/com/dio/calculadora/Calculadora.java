package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor:");
        b = scan.nextInt();

        int soma = somar(a,b);
        int sub = subtrair(a,b);
        int mult = multiplicar(a,b);
        double div = dividir(a,b);
        System.out.println("soma: "+soma);
        System.out.println("sub: "+sub);
        System.out.println("mult: "+mult);
        System.out.println("div: "+div);
    }
    public static int somar(int a, int b){
        return a+b;
    }
    public static int subtrair(int a, int b){
        return a-b;
    }
    public static int multiplicar(int a, int b){
        return a*b;
    }
    public static double dividir(int a, int b){
        return (double) a/b;
    }
}
