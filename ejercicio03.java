package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejercicio03 {

    public static int longitud(String palabra){
        int longi = palabra.length();
        return longi;
    }
    public static String dos(String palabra){
        String dosp = palabra.substring(0, 2);
        return dosp;
    }
    public static String tres(String palabra){
        String tresp = palabra.substring(0, 3);
        return tresp;
    }
    public static String cuatro(String palabra){
        String cuatrop = palabra.substring(0, 4);
        return cuatrop;
    }
    public static String cuatrof(String palabra){
        int res = longitud(palabra)-4;
        String cuatrou = palabra.substring(res, longitud(palabra));
        return cuatrou;
    }
    public static String tresf(String palabra){
        int res = longitud(palabra)-3;
        String tresu = palabra.substring(res, longitud(palabra));
        return tresu;
    }
    public static String dosf(String palabra){
        int res = longitud(palabra)-2;
        String dosu = palabra.substring(res, longitud(palabra));
        return dosu;
    }
    public static String ultima(String palabra){
        int res = longitud(palabra)-1;
        String cuatrou = palabra.substring(res, longitud(palabra));
        return cuatrou;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE UNA CADENA DE CARACTERES");
        String palabra = sc.nextLine();
     
        System.out.println("------------------MENU------------------");
        System.out.println("ESCOGA UNA ACCION A REALIZAR");
        System.out.println("    1.MOSTRAR SUS DOS PRIMERAS LETRAS");
        System.out.println("    2.MOSTRAR SUS TRES PRIMERAS LETRAS");
        System.out.println("    3.MOSTRAR SUS CUATRO PRIMERAS LETRAS ");
        System.out.println("    4.MOSTRAR SUS CUATRO ULTIMAS LETRAS");
        System.out.println("    5.MOSTRAR SUS TRES ULTIMAS LETRAS");
        System.out.println("    6.MOSTRAR SUS DOS ULTIMAS LETRAS");
        System.out.println("    7.MOSTRAR SU ULTIMA LETRA");
        System.out.println("--------------------------------------------");
        System.out.println("SU CADENA DE PALABRA INGRESADA ES: "+palabra);
        System.out.println("INGRESE UNA OPCION");
        int opcion = sc.nextInt();
        sc.close();

        switch(opcion){
            case 1:
            System.out.println("LAS DOS PRIMERAS LETRAS SON: "+dos(palabra));
            break;
            case 2:
            System.out.println("LAS tres PRIMERAS LETRAS SON: "+tres(palabra));
            break;
            case 3:
            System.out.println("LAS CUATRO PRIMERAS LETRAS SON: "+cuatro(palabra));
            break;
            case 4:
            System.out.println("LAS CUATRO ULTIMAS LETRAS SON: "+cuatrof(palabra));
            break;
            case 5:
            System.out.println("LAS TRES ULTIMAS LETRAS SON: "+tresf(palabra));
            break;
            case 6:
            System.out.println("LAS DOS ULTIMAS LETRAS SON: "+dosf(palabra));
            break;
            case 7:
            System.out.println("LAS ULTIMA LETRA ES : "+ultima(palabra));
            break;
            default:
            System.out.println("ESTA OPCION NO ESTA DISPONIBLE ");
        }




    }
    
}
