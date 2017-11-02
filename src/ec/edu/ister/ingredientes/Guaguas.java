package ec.edu.ister.ingredientes;

import java.util.Scanner;

public class Guaguas {
    public static void ingredientesGuagua(){
        Scanner input = new Scanner(System.in);
        
            System.out.printf("Ingrese 5 ingredientes para las guaguas de pan:\n");
            String ing1=input.nextLine();
            String ing2=input.nextLine();
            String ing3=input.nextLine();
            String ing4=input.nextLine();
            String ing5=input.nextLine();
            System.out.printf("Los ingredientes ingresados son: %s, %s, %s, %s, %s",ing1,ing2,ing3,ing4,ing5);
    }
}
