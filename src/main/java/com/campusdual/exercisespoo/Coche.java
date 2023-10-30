package com.campusdual.exercisespoo;

public class Coche {
    public String marca;
    public String modelo;
    public int velocidadMax;
    public String combustible;
    public int velocidad = 0;
    public int revoluciones = 0;

    public Coche(String marca, String modelo, int velocidadMax, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMax = velocidadMax;
        this.combustible = combustible;
    }

    public void arrancar() {
        this.revoluciones = 1000;
    }

    public void apagar() {
        this.revoluciones = 0;
    }

    public int acelerar() {
        this.velocidad = this.velocidad + 10;
        return this.velocidad;
    }

    public int frenar() {
        this.velocidad = this.velocidad - 10;
        return this.velocidad;
    }

    public void girarVolante(int gradosDeGiro) {

        System.out.println();
        if (gradosDeGiro < 0) {
            System.out.println("Giro a la izquierda ");
        } else {
            System.out.println("Giro a la derecha");
        }
    }
}//clase
