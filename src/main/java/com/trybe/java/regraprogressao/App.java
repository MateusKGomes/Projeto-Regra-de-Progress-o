package com.trybe.java.regraprogressao;

import java.util.Arrays;
import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int qntAtividade = Integer.parseInt((scanner.nextLine()));
    int[] pesos = new int[qntAtividade];
    String[] atividades = new String[qntAtividade];
    int[] notas = new int[qntAtividade];
    for (int i = 1; i <= qntAtividade; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      atividades[i - 1] = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + i + ":");
      pesos[i - 1] = Integer.parseInt(scanner.nextLine());
      System.out.println("Digite a nota obtida para " + atividades[i - 1] + ":");
      notas[i - 1] = Integer.parseInt(scanner.nextLine());
    }
    scanner.close();
  }

  public static int calculaNota(int[] notas, int[] pesos) {
    int notaFinal;
    int nota = 0;
    int peso = 0;
    for (int i = 0; i < notas.length; i++) {
      nota += notas[i] * pesos[i];
      peso += pesos[i];
    }
    notaFinal = nota / peso;
    return notaFinal;
  }

  public static String resutlado(int notaFinal) {
    if (notaFinal < 85) {
      return " Lamentamos informar que, com base na sua pontuação alcançada"
          + "neste período, " + notaFinal + "%, você não atingiu a"
          + "pontuação mínima necessária para sua aprovação.";
    } else {
      return "Parabéns! Você alcançou " + notaFinal +
          "%! E temos o prazer de informar que você obteve aprovação! ";
    }
  }

}