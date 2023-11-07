/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author Usuario
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Los numeros primos que hay entre 2 y 500 son: ");
        for (int i = 2; i <= 500; i++) {
            int Num = 1;
            int Cont = 0;
            while (Num <= i){
                if (i % Num == 0){
                    Cont = Cont + 1;
                }
                Num = Num + 1;
            }
            if (Cont == 2){
                System.out.println(i);
            }
                }
            
        }
    }
    
    
    

