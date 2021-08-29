// Finalidade: Programa excuta um cálculo de folha de pagamento
/*
 *
 * Autor: Elf1995
 * Começo do Desenvolvimento: 05/08/2021
 * Última Modificação: 18:04 06/08/2021
 * Questões
 *
 */

package java_maven;

import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args) {
        int c, thisIsAVariable, q76354, value;
        int x, y, z, result;
        int a, b;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira um inteiro: ");
        value = entrada.nextInt();
        System.out.println("This  is  a  Java  Program");
        System.out.printf("%s%n%s%n", "This is a java", "program");

        if (value != 7)
            System.out.println("The variable number não é igual a 7");

        c = 10;
        thisIsAVariable = 30;
        q76354 = 25;
        value = c + thisIsAVariable + q76354;
        System.out.println(value);

        System.out.print("Digite o primeiro inteiro: ");
        x = entrada.nextInt();
        System.out.print("Digite o segundo inteiro: ");
        y = entrada.nextInt();
        System.out.print("Digite o terceiro inteiro: ");
        z = entrada.nextInt();

        result = x + y + z;

        System.out.println("O resultado da soma dos três inteiros é: ");
        System.out.println("O Produto é " + result);

        System.out.print("Enter an Integer: ");
        a = 10;
        b = 20;
        c = 30;
        a = b = c;
        System.out.print(c);

        x = 7 + 3 * 6 / 2 -1;
        System.out.print("\n" + x);
        x = 2 % 2 + 2 * 2 - 2 / 2;
        System.out.println("\n" + x);
        x = (3 * 9 * (3+(9 * 3 / (3))));
        System.out.println(x);

        System.out.println("1 2 3 4");
        System.out.print("1 2 3 4");
        System.out.printf("%s", "1 2 3 4");

        System.out.print("Digite o primeiro inteiro: ");
        a = entrada.nextInt();
        System.out.print("Digite o segundo inteiro: ");
        b = entrada.nextInt();

        c = a + b;
        System.out.println("Sua soma é:" + c);
        System.out.println("Seu produto é: " + a * b);
        System.out.println("Sua divisão é: " + a / b);

        if (a > b) {
            System.out.println("A é maior que B!");
        }
        else {
            System.out.println("B é maior que A");
        }

        if (a == b) {
            System.out.println("A e B são igauis");
        }

        // 2.17
        System.out.println("A");
        a = entrada.nextInt();
        System.out.println("B");
        b = entrada.nextInt();
        System.out.println("C");
        c = entrada.nextInt();

        System.out.println("Sua soma é: " + (a + b + c));
        System.out.println("A média é: " + (a + b + c) / 3);
        System.out.println("Seu produto é: " + a * b * c);

        if (a > b)
            System.out.println("a é maior que b");
        else {
            System.out.println("b é maior que a");
        }

        if (a > c)
            System.out.println("a é maior que c");
        else {
            System.out.println("c é maior que a");
        }

        if (b > c)
            System.out.println("b é maior que c");
        else {
            System.out.println("c é maior que b");
        }

        System.out.println("**********\n*        *\n*        *\n*        *\n*        *\n*        *\n**********");
        System.out.println("   ***\n *     *\n*       *\n*       *\n*       *\n*       *\n *     *\n   ***");
        System.out.println("  *\n ***\n*****\n  *\n  *\n  *\n  *\n  *");
        System.out.println("      *\n    *   *\n  *       *\n    *   *\n      *");
    }
}
