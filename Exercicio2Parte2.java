/*
 *
 * Autor: Rafael Alves Barbosa
 * Começo do Desenvolvimento: 06/08/2021
 * Última Modificação: 18:04 06/08/2021
 * Questões
 *
 */

package java_maven;

import java.util.Scanner;

public class Exercicio2Parte2 {
    public static void main (String[] args) {
        System.out.printf("*%n**%n***%n****%n*****%n");
        System.out.println("*");
        System.out.println("***");
        System.out.println("*****");
        System.out.println("****");
        System.out.println("**");

        System.out.print("*");
        System.out.print("***");
        System.out.print("*****");
        System.out.print("****");
        System.out.println("**");

        System.out.print("*");
        System.out.println("***");
        System.out.println("*****");
        System.out.print("****");
        System.out.println("**");

        System.out.printf("%s%n%s%n%s%n", "*", "***", "*****");

        int a, b, c, d, e;
        float raio, circunferencia;

        Scanner entrada = new Scanner(System.in);

        // O maior Número do grupo
        System.out.println("Digite cinco números inteiros: ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        d = entrada.nextInt();
        e = entrada.nextInt();

        if (a > b)
            if (a > c)
                if (a > d)
                    if (a > e)
                        System.out.println(a + " A é o maior número");
        if (b > a)
            if (b > c)
                if (b > d)
                    if (b > e)
                        System.out.println(b + " B é o maior número");
        if (c > a)
            if (c > b)
                if (c > d)
                    if (c > e)
                        System.out.println(c + " C é o maior número");
        if (d > a)
            if (d > b)
                if (d > c)
                    if (d > e)
                        System.out.println(d + " D é o maior número");
        if (e > a)
            if (e > b)
                if (e > c)
                    if (e > d)
                        System.out.println(e + " E é o maior número");

        // Impar ou Par
        System.out.print("Digite um número inteiro: ");
        a = entrada.nextInt();

        if (a % 2 == 0)
            System.out.println("O número é par");
        else {
            System.out.println("O número é impar");
        }

        // Múltiplo
        System.out.print("Digite dois números inteiros: ");
        a = entrada.nextInt();
        b = entrada.nextInt();

        if (a % b == 0)
            System.out.println("A é múltiplo de B");
        else
            System.out.println("A não é multiplo de B");

        // Jogo de Damas
        System.out.println("*   *   *   *   *   *");
        System.out.println(" *   *   *   *   *   *");
        System.out.println("*   *   *   *   *   *");
        System.out.println(" *   *   *   *   *   *");
        System.out.println("*   *   *   *   *   *");
        System.out.println(" *   *   *   *   *   *");

        // Diâmetro, Circunferência e área de um círculo
        circunferencia = 2;
        System.out.println("Digite o raio do círculo: ");
        raio = entrada.nextInt();
        System.out.printf("O diâmetro é: %f", raio * 2);
        System.out.printf("A circunferência é: %f", circunferencia / 3.14);
        System.out.printf("A área é: %f", raio * 3.14);

        System.out.print("Digite um inteiro de 5 digitos: ");
    }
}
