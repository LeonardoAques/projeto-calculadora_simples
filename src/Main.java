// Calculadora simples - prática

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        double num1 = sc.nextDouble();
        //O charAt(0) vai pegar o próximo caracter na equação. Lembrando que o num1 e num2 são doubles, então o próximo caracter é o primeiro.
        System.out.print("Insira o operador: ");
        char op = sc.next().charAt(0);
        System.out.print("Insira o segundo número: ");
        double num2 = sc.nextDouble();


        if (op == '+')
            System.out.println(num1 + num2);
        else if (op == '-')
            System.out.println(num1 - num2);
        else if (op == '*')
            System.out.println(num1 * num2);
        else if (op == '/')
            System.out.println(num1 / num2);
        else
            System.out.println("Inválido");


    }
}

