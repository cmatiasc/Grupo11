
package grupo11;

import java.util.Scanner;


public class Maximiliano {

    public static void salarios()
    {Scanner leer = new Scanner(System.in);
    
        System.out.println("¿Cuantos trabajadores hay en su empresa?");
        int trab = leer.nextInt();
        
        System.out.println("El salario minimo en argentina es de 112.500$");
        System.out.println("Usted debe pagar de sueldo mensual: "+trab*112.500+" pesos argentinos");
        
    }
    
    
    
}
