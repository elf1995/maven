/*
 *
 * Autor: Rafael Alves Barbosa
 * Começo do Desenvolvimento: 01/08/2021
 * Última Modificação: 20:47 01/08/2021
 * Finalidade: Comparar dois números inteiros
 *
 */

package java_maven;

import java.util.Scanner; // Programa utiliza a classe Scanner

public class Comparacao {
    // Método main inicia a execução do aplicativo Java
    public static void main (String[] args) {
       int numero1, numero2; // Declaro duas variavéis inteiras

       // Cria um Scanner para obter a entrada a partir da janela de comando
       Scanner entrada = new Scanner(System.in);

       System.out.print("Digite um número inteiro: "); // Exibe na tela o texto passado como parametro
       numero1 = entrada.nextInt(); // Lê o primeiro número

       System.out.print("Digite outro número inteiro: ");
       numero2 = entrada.nextInt(); // Lê o segundo número

       if (numero1 == numero2)
           System.out.printf("%d == %d%n", numero1, numero2);

       if (numero1 != numero2)
           System.out.printf("%d != %d%n", numero1, numero2);

       if (numero1 < numero2)
           System.out.printf("%d < %d%n", numero1, numero2);

       if (numero1 > numero2)
           System.out.printf("%d > %d%n", numero1, numero2);

       if (numero1 <= numero2)
           System.out.printf("%d <= %d%n", numero1, numero2);

       if (numero1 >= numero2)
           System.out.printf("%d >= %d%n", numero1, numero2);

       numero1 = numero1 % numero2;
    } // Fim do método main
} // Fim da classe
