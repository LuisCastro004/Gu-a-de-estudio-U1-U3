/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablasdemultiplicar;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class TablasDeMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner TablasDeMultiplicar = new Scanner(System.in);

        System.out.print("Ingrese el numero de la tabla de multiplicar que desea ver: ");
        int numeroTabla = TablasDeMultiplicar.nextInt();

        System.out.println("Tabla de multiplicar del " + numeroTabla + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numeroTabla * i;
            System.out.println(numeroTabla + " x " + i + " = " + resultado);
        }

        TablasDeMultiplicar.close();
    }
}
    
    

