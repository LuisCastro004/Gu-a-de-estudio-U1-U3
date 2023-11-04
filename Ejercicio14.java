/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
      Scanner Ejercicio14 = new Scanner(System.in);

        System.out.print("Por favor, ingrese su nombre completo: ");
        String nombreCompleto = Ejercicio14.nextLine();

        System.out.print("Por favor, ingrese su edad: ");
        int edad = Ejercicio14.nextInt();
        Ejercicio14.nextLine(); 

        System.out.print("Por favor, ingrese su correo electronico: ");
        String correoElectronico = Ejercicio14.nextLine();

        
        System.out.print("Por favor, ingrese su numero de telefono: ");
        String telefono = Ejercicio14.nextLine();

        
        Ejercicio14.close();

        
        System.out.println("Ficha de Contacto:");
        System.out.println("Nombre Completo: " + nombreCompleto);
        System.out.println("Edad: " + edad);
        System.out.println("Correo Electronico: " + correoElectronico);
        System.out.println("Telefono: " + telefono);
    }
}  
    
    

