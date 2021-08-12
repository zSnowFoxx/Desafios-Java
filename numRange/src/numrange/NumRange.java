package numrange;

import java.util.Scanner;

public class NumRange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numi, numf, tipo, qtd = 0;
        boolean primo;
        
        System.out.println("-- Quantidade de números por tipo em um range");
        System.out.print("Informe um número inicial: ");
        numi = Integer.valueOf(input.nextLine());
        System.out.print("Informe um número final: ");
        numf = Integer.valueOf(input.nextLine());
        System.out.println("-- Tipos");
        System.out.println("1 - Números primos");
        System.out.println("2 - Números pares");
        System.out.println("3 - Números ímpares");
        System.out.print("Escolha um tipo: ");
        tipo = Integer.valueOf(input.nextLine());
        
        System.out.println("Calculando...");
        switch(tipo){
            case 1: for (int i=numi; i<=numf; i++){
                if (i>1){ primo = true;
                    for (int j=2; j<i; j++){
                        if(i%j == 0) {primo = false;} 
                    }
                    if (primo) {qtd++;}
                    }
                }
                System.out.println("Existem" + qtd + " números primos entre " + numi + " e " + numf + ".");
                break;
            case 2: for (int i=numi; i<=numf; i++){
                    if(i%2 == 0) {qtd++;}
                }
                System.out.println("Existem " + qtd + " números pares entre " + numi + " e " + numf + ".");
                break;
            case 3: for (int i=numi; i<=numf; i++){
                    if(i%2 != 0) {qtd++;}
                }
                System.out.println("Existem " + qtd + " números ímpares entre " + numi + " e " + numf + ".");
                break;
            default: System.out.println("Tipo não reconhecido.");
        }
    }

}
