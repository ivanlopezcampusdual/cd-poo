package com.campusdual.exercisespoo;

import com.campusdual.exercisespoo.exercise14.Person;
import com.campusdual.exercisespoo.exercise14.PoliceOfficer;
import com.campusdual.exercisespoo.exercise14.Teacher;

public class Sandbox {

    public static void main(String[] args) {
        Person p = new Person("John", "Doe");
        Teacher t = new Teacher("María", "Lopez","Educacion");
        PoliceOfficer po = new PoliceOfficer("Juan", "Gonzalez", "B-2");
        p.getDetails();
        t.getDetails();
        po.getDetails();

    }
}