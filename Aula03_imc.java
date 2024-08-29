package com.classeapp.aula03_imc;
import java.util.Scanner;

public class Aula03_imc {

    public static void main(String[] args) {
        System.out.println("Olá! Digite seu nome: ");
        Scanner leitura = new Scanner(System.in);
        String nome = leitura.nextLine();
        
        System.out.println(nome+", informe seu peso (kg): ");
        int massa = leitura.nextInt();
        
        System.out.println(nome+", informe sua altura (m): ");
        int altura = leitura.nextInt();
        
        float a = altura * altura;
        float imc = massa / a;
        System.out.println("Seu imc é igual a "+imc+".");
    }
}
