package calcularidade;

import java.util.Scanner;

public class CalcularIdade {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite sua data de nascimento (dd-mm-aaaa): ");
        String data = input.nextLine();
        
        System.out.println("-- Olá " + nome + ", você tem " + Idade.idadeCalc(data, "dd-MM-yyyy") + " anos.");
    }
}
