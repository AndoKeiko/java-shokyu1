package org.example;

import java.util.Scanner;

public class Main {

 public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
  Calculator calculator = new Calculator();
  printer printer = new printer();

  while (true) {
   try {
    System.out.print("1番目の数字を入力してください:　");
    int num1 = scanner.nextInt();

    System.out.print("演算子を入力してください (+, -, *, /):　");
    char operator = scanner.next().charAt(0);

    System.out.print("2番目の数字を入力してください:　");
    int num2 = scanner.nextInt();

    int result = calculator.calulate(num1, String.valueOf(operator), num2);

    if (result == Integer.MIN_VALUE) {
     System.out.println("無効な演算子が入力されました。再度入力してください。");
    } else {
     printer.printCalculator(result);
    }
     System.out.println();
   } catch (Exception e) {
    System.out.println("エラーが発生しました。入力を再確認してください。");
    System.out.println();
    scanner.nextLine();
   }
  }
 }
}