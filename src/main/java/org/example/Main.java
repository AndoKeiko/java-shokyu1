package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);
   Calculator calculator = new Calculator();
   printer printer = new printer();

   System.out.print("1番目の数字を入力してください:　");
   int num1 = scanner.nextInt();

   System.out.print("演算子を入力してください (+, -, *, /):　");
   char operator = scanner.next().charAt(0);

   System.out.print("2番目の数字を入力してください:　");
   int num2 = scanner.nextInt();

   int result = calculator.calulate(num1, String.valueOf(operator), num2);

   printer.printCalculator(result);
  }
}