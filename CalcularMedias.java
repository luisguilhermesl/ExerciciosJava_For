package com.mycompany.exerciciosfor;

import java.util.Scanner;

/**
 *  Utilizando o laço "for" para calcular a média de notas de um aluno 
 *
 * @author Luis
 */

public class ExerciciosFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas notas você deseja inserir? ");
        int qtdNotas = teclado.nextInt();
        double somaNotas = 0;
        
        for(int i = 1; i <= qtdNotas; i++){
            System.out.println("Digite a nota " + i + ":");
            double nota = teclado.nextDouble();
            somaNotas += nota;
        }
        double media = somaNotas / qtdNotas;
        System.out.println("A média de notas é: " + media);
        teclado.close();
    }
}
