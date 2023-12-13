package org.lessons.java.valutazioni;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Course extends Student{
    // ATTRIBUTI
    private ArrayList<Student> listOfStudents;

    // COSTRUTTORI
    public Course(){

    }

    public Course(int id, int percentageOfAbsences, BigDecimal averageGradePoints, ArrayList<Student> listOfStudents) {
        super(id, percentageOfAbsences, averageGradePoints);
        this.listOfStudents = listOfStudents;
    }

    // GETTER E SETTER

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }


    // METODI

    // METODO PER MOSTRARE A VIDEO L'ELENCO DI TUTTI GLI STUDENTE CON I RELATIVI DATI
    public void showStudentList(){
        System.out.println("List of students in the course: ");
        for (Student student : listOfStudents) {
            System.out.println(" Id: " + student.getId() + " Absences: " + student.getPercentageOfAbsences() + " Average Grade Points: " + student.getAverageGradePoints());
        }
    }

    // METODO PER AGGIUNGERE UNO STUDENTE ALLA LISTA
    public void addStudent(Student studente) {
        listOfStudents.add(studente);
        System.out.println("Student added to the course!");
    }

    // METODO PER RIMUOVERE UNO STUDENTE DALLA LISTA
    public void removeStudent(){

    }

}
