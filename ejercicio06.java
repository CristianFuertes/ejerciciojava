package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejercicio06 {
    //Programa que lea una variable entera mes y compruebe si el
    //valor corresponde a un mes de 30 días, de 31 o de 28.
    //Supondremos que febrero tiene 28 días. Se mostrará además el
    //nombre   del mes. Se debe comprobar que el valor introducido esté
    //comprendido entre 1 y 12.

    public static int mes (){
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO DEL MES A BUSCAR");
        int mes = sc.nextInt();
        sc.close();
        return mes;
       

    }
    public static void main(String[] args) {
        int numMes = mes();
        System.out.println("SU MES BUSCADO ES:");
        switch(numMes){
            case 1:
            System.out.println("ENERO");
            System.out.println("ESTE MES CONTIENE 31 DIAS");
            break;
            case 2:
            System.out.println("FEBRERO");
            System.out.println("ESTE MES CONTIENE 28 DIAS");
            break;
            case 3:
            System.out.println("MARZO");
            System.out.println("ESTE MES CONTIENE 31 DIAS");
            break;
            case 4:
            System.out.println("ABRIL");
            System.out.println("ESTE MES CONTIENE 30 DIAS");
            break;
            case 5:
            System.out.println("MAYO");
            System.out.println("ESTE MES CONTIENE 31 DIAS");
            break;
            case 6:
            System.out.println("JUNIO");
            System.out.println("ESTE MES CONTIENE 30 DIAS");
            break;
            case 7:
            System.out.println("JULIO");
            System.out.println("ESTE MES CONTIENE 31 DIAS");
            break;
            case 8:
            System.out.println("AGOSTO");
            System.out.println("ESTE MES CONTIENE 31 DIAS");
            break;
            case 9:
            System.out.println("SEPTIEMBRE");
            System.out.println("ESTE MES CONTIENE 30 DIAS");
            break;
            case 10:
            System.out.println("OCTUBRE");
            System.out.println("ESTE MES CONTIENE 31 DIAS");
            break;
            case 11:
            System.out.println("NOVIEMBRE");
            System.out.println("ESTE MES CONTIENE 31 DIAS");
            break;
            case 12:
            System.out.println("DICIEMBRE");
            System.out.println("ESTE MES CONTIENE 31 DIAS");
            break;
            default:
            System.out.println("EL NUMERO INGRESADO NO CORRESPONDE NINGUN MES");
            


        }
        
    }
    
}
