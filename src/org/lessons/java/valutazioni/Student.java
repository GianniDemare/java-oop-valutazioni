package org.lessons.java.valutazioni;

import java.math.BigDecimal;

public class Student{
    // ATTRIBUTI
    private int id;
    private int percentageOfAbsences;
    private BigDecimal averageGradePoints;

    // COSTRUTTORI
    public Student(){

    }

    public Student(int id, int percentageOfAbsences, BigDecimal averageGradePoints) {
        this.id = id;
        this.percentageOfAbsences = percentageOfAbsences;
        this.averageGradePoints = averageGradePoints;
    }

    // GETTER E SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPercentageOfAbsences() {
        return percentageOfAbsences;
    }

    public void setPercentageOfAbsences(int percentageOfAbsences) {
        this.percentageOfAbsences = percentageOfAbsences;
    }

    public BigDecimal getAverageGradePoints() {
        return averageGradePoints;
    }

    public void setAverageGradePoints(BigDecimal averageGradePoints) {
        this.averageGradePoints = averageGradePoints;
    }


    // METODI

    // METODO PER CALCOLARE L'ESITO DELLO STUDENTE
    public void calculateOutcome() {
        BigDecimal mediumThresholdPromotion = new BigDecimal("2.0");
        if (percentageOfAbsences > 50) {
            System.out.println("Studente " + getId() + ": Bocciato (troppe assenze)");
        } else if (percentageOfAbsences >= 25 && percentageOfAbsences <= 50 && averageGradePoints.compareTo(mediumThresholdPromotion) > 0) {
            System.out.println("Studente " + getId() + ": Promosso");
        } else if (percentageOfAbsences < 25 && averageGradePoints.compareTo(mediumThresholdPromotion) >= 0) {
            System.out.println("Studente " + getId() + ": Promosso");
        } else {
            System.out.println("Studente " + getId() + ": Bocciato");
        }
    }
}



