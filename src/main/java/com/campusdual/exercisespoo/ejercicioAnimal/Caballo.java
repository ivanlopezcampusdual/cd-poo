package com.campusdual.exercisespoo.ejercicioAnimal;

public class Caballo extends Mamifero{
    protected String nombreCientifico;
    protected String nombreAnimal;
    protected String territorio;
    protected String sonido;

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getTerritorio() {
        return territorio;
    }

    public void setTerritorio(String territorio) {
        this.territorio = territorio;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public Caballo(int altura, int peso, int edad, String habitat, String color, String pies, String nombreCientifico, String nombreAnimal, String territorio, String sonido) {
        super(altura, peso, edad, habitat, color, pies);
        this.nombreCientifico = nombreCientifico;
        this.nombreAnimal = nombreAnimal;
        this.territorio = territorio;
        this.sonido = sonido;
    }
    public void presentarse(){
        System.out.println(getSonido() + " Hola, soy " + getNombreAnimal());
    }
}