/*
*
* Autor: Elf1995
* Começo do Desenvolvimento: 30/07/2021
* Última Modificação: 21:58 01/08/2021
* Finalidade: Programa de adição que calcula a soma de dois números e exibe na tela
*
*/

package java_maven;

import java.util.Scanner; // Programa utiliza a classe Scanner

public class Adicao {
    // Método main inicia a execução do aplicativo Java
    public static void main(String[] args) {
        // Cria um Scanner para obter a entrada a partir da janela de comando
        Scanner entrada = new Scanner(System.in);

        int numero1, // Primeiro número a somar
            numero2, // Segundo número a somar
            soma; // A soma dos dois números

        System.out.print("Digite o primeiro número: "); // Exibe na tela o texto passado como parametro
        numero1 = entrada.nextInt(); // Lê o primeiro número

        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextInt(); // Lê o segundo número

        soma = numero1 + numero2; // Soma os dois números

        System.out.printf("A Soma é %d%n", soma); // Exibe a soma
        System.out.printf("A soma é %d", (numero1 + numero2));
    } // Fim do método main
} // Fim da classe
