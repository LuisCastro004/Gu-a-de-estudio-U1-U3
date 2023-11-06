/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Ejercicio23 = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = Ejercicio23.nextInt();
        
        if (numero <0) {
            System.out.println("El numero es negativo");
        } else if (numero >0){
            System.out.println("El numero es positivo");
        }
    }
    
}
