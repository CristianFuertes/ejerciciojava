package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejericicio04 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO ENTERO");
        int num1 = sc.nextInt();
        System.out.println("INGRESE UN NUMERO ENTERO");
        int num2 = sc.nextInt();
        sc.close();
        if(num1>num2){
            int numeroMayor = num1;
            int numeroMenor = num2;
            System.out.println("LOS NUMEROS COMPRENDIDOS ENTRE EL NUMERO MENOR Y NUMERO MAYOR INGRESADO SON:");
            while(numeroMenor<=numeroMayor){
                System.out.print(numeroMenor+",");
                numeroMenor++;
            }
        }else{
            int numeroMayor = num2;
            int numeroMenor = num1;
            System.out.println("LOS NUMEROS COMPRENDIDOS ENTRE EL NUMERO MENOR Y NUMERO MAYOR INGRESADO SON:");
            while(numeroMenor<=numeroMayor){
                System.out.print(numeroMenor+";");
                numeroMenor++;
            }
        }
    
    
        
    }
    
}
