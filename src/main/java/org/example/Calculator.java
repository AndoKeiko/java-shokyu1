package org.example;

public class Calculator {
  public int calulate(int num1, String operator, int num2) {
    int result = 0;
    switch (operator) {
      case "+":
        result = num1 + num2;
        break;
      case "-":
        result = num1 - num2;
        break;
      case "*":
        result =  num1 * num2;
        break;
      case "/":
        result =  num1 / num2;
        break;
      default:
        System.out.println("+, -, *, /　のいずれかを選択してください");
        return Integer.MIN_VALUE;
    }
    return result;
  }
}

