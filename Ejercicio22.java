/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2! -> 2x1=
        Scanner Ejercicio22 = new Scanner(System.in);
        System.out.println("Dame un numero entero");
        
        int numero = Ejercicio22.nextInt();
        Ejercicio22.close();
        
        long factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial *=i;
            
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
    
}
