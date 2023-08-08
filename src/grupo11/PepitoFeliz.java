/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo11;

import java.util.Scanner;

/**
 *
 * @author Agust
 */
public class PepitoFeliz {
static Scanner nuevo= new Scanner (System.in);


public static void Leer(){
    
    
    System.out.println("Estas leyeno esto?");
    String confirmacion = nuevo.nextLine();
    
    
    if (confirmacion.equalsIgnoreCase("si")) {
        
        System.out.println("Bien hecho.. aplausos");
 
    }else{
        System.out.println("Mal hecho..");
    }
}
}
