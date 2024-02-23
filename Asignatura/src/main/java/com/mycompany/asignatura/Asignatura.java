/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.asignatura;

import java.util.Scanner;

/**
 *
 * @author Alexs
 */
public class Asignatura {

    public static void main(String[] args) {
        //TODO  code aplication logic hare
        //CLAVE, NOMBRE, CREDITOS, Hr TEORICAS, Hr PRACTICAS, CARRERA,TipoMATERIA
        String clave, nombre, carrera;
        int creditos, Horas_de_teoria, Horas_de_practicas;
        boolean Tipo_de_materia;
        //Captura 
        Scanner captura = new Scanner(System.in);
        
        System.out.println("¿Cual es la clave de tu materia?");
        clave = captura.nextLine();
        System.out.println("¿Como se llama tu materia?");
        nombre = captura.nextLine();
        System.out.println("¿cual es tu carera?");
        carrera = captura.nextLine();
        System.out.println("¿cuantos creditos tienes?");
        creditos =captura.nextInt();
        System.out.println("¿cuantas horas teoricas son de la asignatura?");
        Horas_de_teoria = captura.nextInt();
        System.out.println("¿cuantas horas practicas?");
        Horas_de_practicas = captura.nextInt();
        System.out.println("introduce que tipo de asignatura es [TRUE_--> Generica --> FALSE_ESPECIALIDAD]");
        Tipo_de_materia = captura.nextBoolean();
        
       System.out.println("datos de la asignatura");
       System.out.println(clave);
       System.out.println(nombre);
       System.out.println(carrera);
       System.out.println(creditos);
       System.out.println(Horas_de_teoria);
       System.out.println(Horas_de_practicas);
       System.out.println(Tipo_de_materia);
    }
}
