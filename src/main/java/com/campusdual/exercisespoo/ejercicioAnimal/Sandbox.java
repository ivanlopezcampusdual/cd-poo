package com.campusdual.exercisespoo.ejercicioAnimal;

public class Sandbox {
    public static void main(String[] args) {
        Perro perro1 = new Perro(60,12,6,"Jardin","Marron", "4 patas","Canis lupus","Balto", "Lugo","Guau guau");
        Caballo caballo1 = new Caballo(200, 100, 12,"Salvaje","Negro", "4 patas", "Equus caballo", "Spirit", "A Coruña","hihihih");
        Halcon halcon1 = new Halcon(25,10,3,"Desierto","Negro","2 patas", "falco", "Milenario","España", "gri gri");
        Pollo pollo1 = new Pollo(18, 5,1,"Granja","Amarilla","2 patas", "Gallus gallus","Calimero","Murcia","pio pio");
        Delfin delfin1 = new Delfin(180,60,8,"Agua","Gris","Aletas","Delphinidae","Flipper","Valencia","iiiii iiii");
        Orca orca1 = new Orca(180,80,11,"Agua","Negro","Aletas", "Orcinus orca", "Willy", "Grecia", "uhh uhhhh");

        perro1.presentarse();
        caballo1.presentarse();
        halcon1.presentarse();
        pollo1.presentarse();
        delfin1.presentarse();
        orca1.presentarse();

    }
}
