package com.local;

import java.util.Scanner;

public class entradaDeDados {

    public static void main(String[] args) {
	// write your code here
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome:");
        String nome = entrada.nextLine();

        System.out.print("Peso: ");
        int peso = entrada.nextInt();

        System.out.println("Altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC de " + nome + ": " + imc);



    }
}
