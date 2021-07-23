package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;



public class ejercicio07 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos numeros desea ingresar");
        int cant = sc.nextInt();
        int [] numeros = new int[cant];
        
        for(int i=0;i<cant;i++){
            System.out.println("ingrese un numero entero");
        
            numeros[i]=sc.nextInt();
            
        }
        sc.close();
        for(int i=0;i<cant;i++){
        System.out.print(numeros[i]+",");
        }
        
        
    }
}
    

