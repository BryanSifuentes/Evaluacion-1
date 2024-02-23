/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.captura_de_datos;

import java.util.Scanner;

/**
 *
 * @author Alexs
 */
public class Captura_de_datos {

    public static void main(String[] args) {
        //TODO code aplication logic here
        //DECLARAR NUESTRAS VARIABLES 
        String nombre;
        int edad;
        System.out.println("Introduce tu Nombre:");
        //CREAR NUESTRO SCANNER
        Scanner captura = new Scanner (System.in);
        //CAPTURA
        nombre = captura.nextLine();
        System.out.println("Introduce tu edad");
        edad = captura.nextInt();
        System.out.println("Tu nombre es:");
        System.out.println(nombre);
        System.out.println("Tu edad es:");
        System.out.println(edad);
        System.out.println("Hello World!");
    }
}
