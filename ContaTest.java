/* Autor: Elf1995
   Data & hora da última modificação: 25/08/2021 - 03:21
   Objetivo: Capturar e exibir o nome da conta do usuário
*/

package java_maven;

import java.util.Scanner;

public class ContaTest {
    public static void main(String[] args) {
        // java.util.Scanner entrada = new java.util.Scanner(System.in);
         // Cria o objeto Scanner para obter entrada do usuário
         Scanner entrada = new Scanner(System.in);

         // Cria um objeto "conta" e atribui a "minhaConta"
         Conta minhaConta = new Conta("Greenwood");
         Conta minhaConta2 = new Conta("Jane Green");

         // Exibe o valor inicial do nome (null)
         System.out.printf("O nome inicial é: %s%n%n", minhaConta.getNome());

         // Solicita e lê o nome
         System.out.println("Digite seu nome: ");
         String seuNome = entrada.nextLine();
         System.out.println(); // Gera a saída de uma linha em branco

         // Exibe o nome armazenado no objeto minhaConta
         System.out.printf("O nome do objeto é: %n%s%n", seuNome);

         System.out.println(minhaConta.getNome());
         System.out.println(minhaConta2.getNome());

    }
} // Fim da Classe ContaTest
