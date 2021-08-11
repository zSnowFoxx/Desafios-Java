package calc2num;

import java.util.Scanner;

public class Calc2num {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y, r;
        
        System.out.println("CALCULADORA DE 2 NÚMEROS");
        System.out.print("Digite um número: ");
        x = Double.valueOf(input.nextLine());
        System.out.print("Digite outro número: ");
        y = Double.valueOf(input.nextLine());
        
        System.out.println("-- Operações possíveis");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        System.out.print("Selecione uma operação: ");
        char op = input.nextLine().charAt(0);
        
        switch (op){
            case '1': r = x+y;
                System.out.println(x + " + " + y + " = " + r);
                break;
            case '2': r = x-y;
                System.out.println(x + " - " + y + " = " + r);
                break;
            case '3': r = x/y;
                System.out.println(x + " / " + y + " = " + r);
                break;
            case '4': r = x*y;
                System.out.println(x + " * " + y + " = " + r);
                break;
            default: System.out.println("Operação inválida.");
        }
    }

}
