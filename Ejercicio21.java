/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Ejercicio21 = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Bienvenido a la Taqueria PPS");
            System.out.println("Nuestro menu es el siguiente, escoge una opcion");
            System.out.println("1. Tacos de pastor");
            System.out.println("2. Tacos de bistec");
            System.out.println("3. Tacos campechanos");
            System.out.println("4. Tacos de suadero");
            System.out.println("5. Tacos de tripa");
            System.out.println("6. Salir");
            
            
            opcion = Ejercicio21.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Tu orden es tacos de pastor. Provecho!");
                    break;
                case 2:
                    System.out.println("Tu orden es tacos de bistec. Provecho!");
                    break;
                case 3:
                    System.out.println("Tu orden es tacos campechanos. Provecho!");
                    break;
                case 4:
                    System.out.println("Tu orden es tacos de suadero. Provecho!");
                    break;
                case 5:
                    System.out.println("Tu orden es tacos de tripa. Provecho!");
                    break;
                case 6:
                    System.out.println("Gracias por visitar a los PPS, Vuelve pronto!");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, elige una opcion valida.");
                    break;
            }
        } while (opcion != 6);

        Ejercicio21.close();
    }
}
    
    

