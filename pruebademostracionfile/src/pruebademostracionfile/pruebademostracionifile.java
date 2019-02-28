/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebademostracionfile;
import java.util.Scanner;

public class pruebademostracionifile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in);
        DemostracionFile1 aplicacion = new DemostracionFile1();
        System.out.print( "Escriba aqui el nombre del archivo o directorio: " );
        aplicacion.analizarRuta( entrada.nextLine() );
    }//fin del main
}//fin de la clase PruebaDemostracionFile