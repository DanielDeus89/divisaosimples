/*
* Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo.
* Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNumber = scanner.nextInt();

        try {
            int total = firstNumber / secondNumber;

            System.out.println("Total is " + total);
        }catch (ArithmeticException e){
            System.out.println("Impossivel dividir por Zero " + e.getMessage());
        }
    }
}