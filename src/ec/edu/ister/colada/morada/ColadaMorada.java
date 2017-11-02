package ec.edu.ister.colada.morada;

import ec.edu.ister.ingredientes.*;
import java.util.Scanner;

public class ColadaMorada {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Colada.ingredientesColada();
        System.out.printf("\nDesea preparar guaguas de pan?\n1) Si\n2) No\n");
        int opc=input.nextInt();
        if(opc==1){
            Guaguas.ingredientesGuagua();
        }
        else{
            System.out.printf("No se prepararan guaguas de pan");
        }
        System.out.printf("\nAqui termina el programa\n");
    }
}
