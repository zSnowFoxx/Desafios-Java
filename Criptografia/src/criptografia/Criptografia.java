package criptografia;

import java.util.Scanner;

public class Criptografia {

    public static void main(String[] args) {
        System.out.println("-- Criptografar ou descriptografar");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = input.nextLine();
        System.out.print("Digite 1 (Criptografar) ou 2 (Descriptografar): ");
        char op = input.nextLine().charAt(0);
        
        switch (op){
            case '1': String cript = new StringBuffer(texto).reverse().toString();
                System.out.println("Texto criptografado: " + cript);
                break;
            case '2': String decript = new StringBuffer(texto).reverse().toString();
                System.out.println("Texto descriptografado: " + decript);
                break;
            default: System.out.println("Opção inválida.");
        }
    }
}
