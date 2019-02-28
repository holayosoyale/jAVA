/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        System.out.println("Curso Java");// sout+tabuladorcopialinea de impres
        /*
        Comentarios
        con multiples lineas
        */
        // Variables= es un espaci de memoria en donde se guarda algun valor
        byte entero;
        entero = 12;
        byte enter=14;
        System.out.println("Numero entero: "+entero);
        //entero
        int num=12343;
        System.out.println("Numero int: "+num);
        //float
        float decimal=3.1416f;
        System.out.println("Numero decimal "+decimal);
        //chart
        char caracter='a';
        System.out.println("Caracter: "+caracter);
        char caracter1='2';
        System.out.println("Caracter: "+caracter1);
        //boolean
        boolean desicion =true;
        System.out.println("Desicion es "+desicion);
        //double
        double doble= 1.234;
        System.out.println("Double es :"+doble);
        //datos no primitivos
        Integer Numero=null;
        System.out.println("El numero es:"+Numero);
        
        String palabras = "Hola que tal?";
        System.out.println(palabras);
        //Constante
        final int number= 19;
        System.out.println(number);
        // Guardar datos
        Scanner entrada = new Scanner(System.in);
        //enteros
        int numero;
        System.out.print("Dijite un numero: ");
        numero= entrada.nextInt();
        System.out.println("El numero es: "+numero);
        //float
        float flotante;
        System.out.println("Dijite un numero: ");
        flotante= entrada.nextFloat();
        System.out.println("El numero es: "+flotante);
        //double
        double dobl;
        System.out.println("Dijite un numero: ");
        dobl= entrada.nextDouble();
        System.out.println("El numero es: "+dobl);
        //Cadena
        String Caden;
        System.out.println("Dijite una cadena: ");
        Caden=entrada.next();
        System.out.println("La cadena es: "+Caden);
        //char
        char Cade;
        System.out.println("Dijite una letra: ");
        Cade=entrada.nextLine().charAt(0);
                //CharArt te lee el primer caracter
        System.out.println("La letra es: "+Cade);
        
        
        
        
        
             
    }
    
}
