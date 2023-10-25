package com.campusdual.exercisespoo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Repaso {

    public static void main(String[] args) {
//        mostrar30NumerosPares();
//        sumNumbers(100);
//        calcularCuadrados();
//        contarLetras('V');
//          mostrarSaludo();
        pedirNumero();
//
//    /*Sintaxis de for
//     * El bucle for consta de 3 partes:
//     * Una expresión de inicialización (se ejecuta al principio, asignando a la variable de control un valor inicial)
//     * Una expresión de condición que hará que el bucle se mantenga mientras que se cumpla
//     * Una expresión de incremento/decremento sobre la variable de control para conseguir la finalización del bucle
//     * El código que se repetirá en cada iteración será el que vaya entre llaves*/
//
//    // Mostrar los 30 primeros numero pares
//    public static void mostrar30NumerosPares() {
//        for (int i = 2; i <= 60; i += 2) {
//            System.out.print(i + " ");
//        }
//    }
//
//    // Sumar los 100 primeros numeros naturales
//    public static void sumNumbers(int num) {
//        int sumaTotal = 0;
//        for (int i = 1; i <= num; i++) {
//            sumaTotal = sumaTotal + i;
//        }
//        System.out.println();
//        System.out.println("La suma de los 100 primeros es: " + sumaTotal);
//    }
//
//    // Calcular el cuadrado de los 20 primeros numeros naturales
//    public static void calcularCuadrados() {
//        for (int i = 1; i <= 20; i++) {
//            System.out.print(i * i + " ");
//        }
//    }
//
//    // construye un metodo que, recibiendo por parameotro una letra del abecedario muestre
//    // por pantalla cuantas letras le faltan hasta llegar a la Z (sin contar la Ñ)
//    public static void contarLetras(char letra) {
//        int contador = 0;
//        for (char i = letra; i <= 'Z'; i++) {
//            if (letra != 'Z') {
//                contador++;
//            }
//        }
//        System.out.println(" ");
//        System.out.println(contador);
//    }

        // Bucle while
//        int variableAEvaluar = 1;
//        while (variableAEvaluar <5) {
//            System.out.println("La variable a evaluar todavia es menor que 5, porque vale " + variableAEvaluar);
//            variableAEvaluar++;
//        }
        //Bucle do-while
//        int variableAEvaluar = 1;
//        do {
//            System.out.println("La variable a evaluar vale " + variableAEvaluar);
//            variableAEvaluar++;
//        } while (variableAEvaluar < 5);


    }

    // Pedir al usuario su nombre y mostrar por pantalla un mensaje de bienvenida con el
    public static void mostrarSaludo() {
        Scanner scan = new Scanner(System.in);
        String nombreUsuario;

        System.out.println("Introduce tu nombre: ");
        nombreUsuario = scan.next();

        System.out.println("Hola " + nombreUsuario + "!  ¿Como estas?");
    }

    /*Pedir al usuario un numero mayor que 5 y mostrarlo por pantalla*/
    public static void pedirNumero() {
        Scanner scan = new Scanner(System.in);
        int numeroParaMostrar;
        do {
            System.out.println("Introduce un numero mayor que 5");
            numeroParaMostrar = scan.nextInt();
        } while (numeroParaMostrar < 5);
        System.out.println("El numero que has escrito es: " + numeroParaMostrar);
    }
}