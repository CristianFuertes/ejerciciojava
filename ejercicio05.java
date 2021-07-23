package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejercicio05 {
    //0. Programa que lea por teclado tres números enteros H, M, S
    //correspondientes a hora, minutos y segundos respectivamente, y
    //comprueba si la hora que indican es una hora válida
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE UNA HORA");
        int hora = sc.nextInt();
        System.out.println("INGRESE LOS MINUTOS");
        int min= sc.nextInt();
        System.out.println("INGRESE LOS SEGUNDOS");
        int seg = sc.nextInt();
        sc.close();
        if ((hora<=24)&&(min<60)&&(seg<60)){
            System.out.println("SU HORA INGRESADA ES CORRECTA ");
            System.out.println(hora+":"+min+":"+seg);
        }else{
            System.out.println("LA HORA INGRESADA NO ES CORRECTA");
        }
       
    }
    
}
