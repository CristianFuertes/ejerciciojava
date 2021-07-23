package  co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

class ejercicio01 {
    /*Programa que lea dos números por teclado y muestre el
    resultado de la división del primer número por el segundo. Se
    debe comprobar que el divisor no puede ser cero.*/

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dividendo ");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el divisor");
        int numero2 = sc.nextInt();
        sc.close();
        try{
        double resultado = numero1 / numero2;
        System.out.println("El resultado de la division es de "+resultado);
        }
        catch(Exception e){
            System.out.println("no e sposible division por cero");
        }

        
    }
    
}
