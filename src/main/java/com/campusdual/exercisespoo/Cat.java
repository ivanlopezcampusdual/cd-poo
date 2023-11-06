package com.campusdual.exercisespoo;

public class Cat {
//    Crea una clase llamada Cat
//    La clase debe tener las siguientes propiedades sin inicializar:
//    - nombre (name)
//    - raza (breed)
//    - sexo (sex)
//    - edad en meses (age)
//    - tamaño del pelo (hair)
//    - color del pelo (colour)
//    - un booleano que indique si está castrado/a o no (castrated)I

    public String name;
    public String breed;
    public String sex;
    public static int age;
    public String hair;
    public static String colour;
    public boolean castrated;

    //    La clase debe tener las siguientes propiedades con los valores inicializados
//    - el color de los ojos (eyeColour): "green"
    private String eyeColour = "green";

    public Cat(String name, String breed, String sex, int age, String hair, String colour, boolean castrated) {
        this.name = name;
        this.breed = breed;
        Cat.age = age;
        this.sex = sex;
        this.hair = hair;
        Cat.colour = colour;
        this.castrated = castrated;
    }

    // Crea metodo estatico que cambie el color del pelo
    public static void changeColour(String newColour) {

        Cat.colour = newColour;
    }

    // Metodo no estatico que cambie el color de los ojos
    public void changeEyeColour(String newEyeColour) {

        this.eyeColour = newEyeColour;
    }

    // Crea un metodo estatico que cambie la edad del gato y otro no estatico
    // que permita recuperar ese valor cuando se invoque
    public static void changeAge(int newAge) {

        Cat.age = newAge;
    }

    public int getAge() {

        return age;
    }
    // Crea un método no estático que castre a los gatos y
    // otro no estático, llamado isCastrated, que devuelva su estado

    public void changeCastrated() {
        this.castrated = true;
    }

    public boolean isCastrated() {
        return this.castrated;
    }


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

    // Crea un main
    //Crea un gato de la raza siamesa, otro de raza persa y otro de raza esfinge
    public static void main(String[] args) {
        Cat gatoFelix = new Cat("Felix","Siamesa","Macho",2,"Corto", "Negro",false);
        Cat gatoJuan = new Cat("Juan","Persa","Macho",4,"Largo", "Blanco",false);
        Cat gatoPaca= new Cat("Paca","Esfinge","Hembra",5,"Corto", "Marron",false);


    // Castra a los dos primeros gatos cambiando su booelano a true.
    // Deja el otro sin castrar (false)
        gatoJuan.changeCastrated();
        gatoFelix.changeCastrated();

        //Cambiale el color de pelo a los dos primeros gatos
        Cat.changeColour("Azul");

        //Cambiale el color de los ojos al ultimo gato
        gatoPaca.changeEyeColour("Gris");

        // Cambia la edad del ultimo gato. intenta ponerle un valor
        //negativo (su setter debe hacer la comprobacion)
        Cat.changeAge(-4);

        //Muestra los detalles de cada gatos
        gatoFelix.catDetails();
        gatoJuan.catDetails();
        gatoPaca.catDetails();
    }

    }
