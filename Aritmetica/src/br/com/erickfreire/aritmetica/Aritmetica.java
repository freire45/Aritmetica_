package br.com.erickfreire.aritmetica;

import java.util.Scanner;

public class Aritmetica {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Programa que calcula as quatro operações básicas: ");
		System.out.print("Digite o primeiro valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		numero2 = entrada.nextInt();
		
		System.out.printf("Soma entre %d + %d é igual: %d %n", numero1, numero2, numero1 + numero2);
		System.out.printf("Subtração entre %d - %d é igual: %d %n", numero1, numero2, numero1 - numero2);
		System.out.printf("Divisão entre %d / %d é igual: %d %n", numero1, numero2, numero1 / numero2);
		System.out.printf("Multiplicação entre %d * %d é igual: %d %n", numero1, numero2, numero1 * numero2);

	}

}
