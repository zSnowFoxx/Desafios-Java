package numeroprimo;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        boolean primo = true;
        
        System.out.print("Digite um número: ");
        num = Integer.valueOf(input.nextLine());
        
        for (int i=2; i<num; i++){
            if(num%i == 0){ primo = false; }
        }
        
        if (primo){ System.out.println(num + " é primo."); }
        else{ System.out.println(num + " não é primo."); }
    }

}
