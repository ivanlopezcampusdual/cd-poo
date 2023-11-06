package com.campusdual.exercisespoo;

import java.sql.SQLOutput;

public class CatEncapsulated {
    private String name;
    private String breed;
    private String sex;
    private int age;
    private String hair;
    private String colour;
    private boolean castrated;
    private String eyeColour = "Green";

    public CatEncapsulated(String name, String breed, String sex, int age, String hair, String colour, boolean castrated, String eyeColour) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.hair = hair;
        this.colour = colour;
        this.castrated = castrated;
        this.eyeColour = eyeColour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isCastrated() {
        return castrated;
    }

    public void setCastrated(boolean castrated) {
        this.castrated = castrated;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    // Crea un metodo estatico que cammbie el color del pelo
    public void setChangeColour(String colour) {
        this.colour = colour;
    }

    //Crea otro no estatico que cambie el color de los ojos
    public void setChangeEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }
    // Crea un metodo estatico que cambie la edad del gato

    //Crea otro no estatico que permita recuperar ese valor cuando se invoque

    //Crea un metodo no estatico que castre a los gatos
    public void setCastrated() {
        this.castrated = true;
    }
    //Crea otro no estatico llamado isCastrated, que devuelva estado

    //Crea un método no estático llamado catDetails() que muestre todas las características de un gato
    // (sé original en la presentación de los datos, dale un poco de arte)
    public void catDetails() {
        System.out.println("Este gato se llama  " + this.name);
        System.out.println("Su raza es " + this.breed);
        System.out.println("Tiene " + Cat.age + " años ");
        System.out.println("Su sexo es " + this.sex);
        System.out.println("Su pelo es " + this.hair + " y es de color " + Cat.colour);
        isCastrated();
        System.out.println("Tiene los ojos de color " + this.eyeColour);
        System.out.println(" ");
    }

    //Crea un main
    //Crea un gato de la raza siamesa, otro de la raza persa y otro esfinge
    public static void main(String[] args) {
        CatEncapsulated gatoFelix = new CatEncapsulated("Felix", "Siamesa", "Macho", 2, "Corto", "Negro", false, "Gris");
        CatEncapsulated gatoJuan = new CatEncapsulated("Juan", "Persa", "Macho", 4, "Largo", "Blanco", false, "Azul");
        CatEncapsulated gatoPaca = new CatEncapsulated("Paca", "Esfinge", "Hembra", 5, "Corto", "Marron", false, "Verde");

        //Cambiale el color de pelo a los dos primeros gatos
        gatoFelix.setChangeColour("Beige");
        gatoJuan.setChangeColour("Cian");

        //Cambiale el color de los ojos al ultimo gato
        gatoPaca.setChangeColour("Morado");

        //Cambia la edad del ultimo gato con valor negativo
        gatoPaca.setAge(-5);

        //Muestra los detalles de cada gatos
        gatoFelix.catDetails();
        gatoJuan.catDetails();
        gatoPaca.catDetails();

    }


}