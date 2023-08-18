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
    for (int i = 1; i <= qntAtividade; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      atividades[i - 1] = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + i + ":");
      pesos[i - 1] = Integer.parseInt(scanner.nextLine());
    }
    System.out.println(
        "pesos:" + Arrays.toString(pesos) + "atividades:" + Arrays.toString(atividades));
    scanner.close();
  }
}