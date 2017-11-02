package ec.edu.ister.ingredientes;

import java.util.Scanner;

public class Colada {
    public static void ingredientesColada(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese 5 ingredientes de la colada morada: ");
        String a =input.nextLine();
        String b =input.nextLine();
        String c =input.nextLine();
        String d =input.nextLine();
        String e =input.nextLine();
        System.out.printf("Los ingredientes ingresados son: %s, %s, %s, %s, %s,",a,b,c,d,e);
    }
}
