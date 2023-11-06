package com.campusdual.exercisespoo.ejercicioAnimal;
    public class Pez extends Animal{
        protected String habitat;
        protected String color;
        protected String pies;

        public String getHabitat() {
            return habitat;
        }

        public void setHabitat(String habitat) {
            this.habitat = habitat;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getPies() {
            return pies;
        }

        public void setPies(String pies) {
            this.pies = pies;
        }

        public Pez (int altura, int peso, int edad, String habitat, String color, String pies) {
            super(altura, peso, edad);
            this.habitat = habitat;
            this.color = color;
            this.pies = pies;
        }
}
