package co.edu.utp.misiontic2022.c2;
//import javax.swing.JOptionPane;

import java.util.Scanner;

public class ejercicio02 {


    public static int suma(int numero1,int numero2){
        int operacion = numero1 + numero2;
        return operacion;
    }
    public static int resta(int numero1,int numero2){
        int operacion = numero1 - numero2;
        return operacion;

    }
    public static double division(double numero1, double numero2){
        double operacion = numero1 / numero2;
        return operacion;
    }
    public static int multiplicar (int numero1,int numero2){
        int operacion = numero1 * numero2;
        return operacion;
    }
    public static double potencia(int numero1,int numero2){
        double operacion = Math.pow(numero1, numero2);
        return operacion;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO ENTERO");
        int numero1 = sc.nextInt();
        System.out.println("INGRESE OTRO NUMERO ENTERO");
        int numero2 = sc.nextInt();
        
        System.out.println("------------------MENU------------------");
        System.out.println("ESCOGA UNA ACCION A REALIZAR");
        System.out.println("1.SUMAR LOS DOS NUMEROS");
        System.out.println("2.RESTAR LOS DOS NUMEROS");
        System.out.println("3.MULTIPLICAR LOS DOS NUMEROS ");
        System.out.println("4.DIVIDIR LOS DOS NUMEROS");
        System.out.println("5.ELEVAR EL PRIMER NUMERO A LA POTENCIA DEL SEGUNDO NUMERO");
        System.out.println("--------------------------------------------");
        System.out.println("sus valores ingreasados son: numero1= "+numero1+" numero2= "+numero2);
        System.out.println("INGRESE UNA OPCION");
        
        int opcion = sc.nextInt();
        sc.close();



        switch(opcion){
            case 1:
            System.out.println("la suma de los valores es igual a: "+ suma(numero1, numero2));
            break;
            case 2:
            System.out.println("la resta de los valores es igual a: "+ resta(numero1, numero2));
            break;
            case 3:
            System.out.println("la multiplicacion de los valores es igual a: "+ multiplicar(numero1, numero2));
            break;
            case 4:
            System.out.println("la division de los valores es igual a: "+ division(numero1, numero2));
            break;
            case 5:
            System.out.println("la potencia del numero1 elevado al numero2 es igual a "+ potencia(numero1, numero2));
            break;
            default:
            System.out.println("INGRESE OTRA OPCION ESA NO SE ENCUENTRA DISPONIBLE");
        }
        
        
       
    }
    
}
