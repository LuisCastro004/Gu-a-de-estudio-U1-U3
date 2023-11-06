/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Ejercicio25 = new Scanner(System.in);

        System.out.print("Ingresa un numero del 1 al 7: ");
        int numero = Ejercicio25.nextInt(); 

        String dSemana;

        switch (numero) {
            case 1:
                dSemana = "Lunes";
                break;
            case 2:
                dSemana = "Martes";
                break;
            case 3:
                dSemana = "Miercoles";
                break;
            case 4:
                dSemana = "Jueves";
                break;
            case 5:
                dSemana = "Viernes";
                break;
            case 6:
                dSemana = "Sabado";
                break;
            case 7:
                dSemana = "Domingo";
                break;
            default:
                dSemana = "Numero no valido";
        }

        System.out.println("Hola, soy el dia " + dSemana);

        Ejercicio25.close();
    }
}
    
    

