package com.trybe.java.regraprogressao;

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
    int activityQuantity = Integer.parseInt(scanner.nextLine());

    int gradesSum = 0;

    int weightSum = 0;

    for (int i = 0; i < activityQuantity; i++) {
      System.out.printf("Digite o nome da atividade %d:%n", i + 1);
      String activityName = scanner.nextLine();

      System.out.printf("Digite o peso da atividade %d:%n", i + 1);
      int activityWeight = Integer.parseInt(scanner.nextLine());
      weightSum += activityWeight;

      System.out.println("Digite a nota obtida para " + activityName + ":");
      int grade = Integer.parseInt(scanner.nextLine());
      gradesSum += activityWeight * grade;
    }

    float finalGradeResult = (float) gradesSum / weightSum;


    if (finalGradeResult >= 85) {
      System.out.println(
          "Parabéns! Você alcançou " + finalGradeResult
              + "%! E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, "
              + finalGradeResult
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }

    scanner.close();
  }
}