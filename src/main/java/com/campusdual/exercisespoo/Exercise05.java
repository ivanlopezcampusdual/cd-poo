package com.campusdual.exercisespoo;

public class Exercise05 {
    // Comprobar si un numero es positivo o negativo
    // Comprobar si un numero es multiplo de otro
    // Comprobar si un numero es menor a otro

    public static void main(String[] args) {
        System.out.print("Comprobar si el numero es positivo o negativo: ");
        esPositivo(0);
        System.out.print("Comprobar si el numero es multiplo o no es multiplo: ");
        esMultiplo(5, 2);
        System.out.print("Comprobar si el numero es menor: ");
        esMenor(3,5);
    }
    public static void esPositivo (int numero){
        if (numero>=0) {
            System.out.println("Es un numero positivo");
        }else {
            System.out.println("Es un numero negativo");
        }
    }
    public static void esMultiplo (int n, int m){
        if (n % m ==0){
            System.out.println("El numero " + n + " es multiplo de " + m);
        }else {
            System.out.println("El numero " + n + " no es multiplo de " + m);
        }
    }
    public static void esMenor (int n, int m){
        if (n<m){
            System.out.println("El numero " + n + " es menor que " + m);
        }else {
            System.out.println( "El numero "+ n + " no es menor que "+ m);
        }
    }
}



