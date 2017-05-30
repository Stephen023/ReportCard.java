package com.example.android.reportcard;

/**
 * Created by IstvanLovas on 2017. 05. 29.
 * ReportCard java
 * The grades going between Fail (1)- Excellent (5)
 */

public class ReportCard {

    static final private String SCHOOL_NAME = "BGM Education";
    static final private int MaxPoints = 100;
    static final private int PASSPoints = 55;
    static final private String EXCELLENT = "Excellent (5)";
    static final private String GOOD = "Good(4)";
    static final private String AVERAGE = "Average(3)";
    static final private String PASS = "Pass (2)";
    static final private String FAIL = "Fail (1)";
    private String rating;
    private double averageGrade;
    private String StudentName;
    private double spanishGrades;
    private double englishGrades;
    private double physicsGrades;
    private double mathGrades;
    private double historyGrades;

    /**
     * Constructor ReportCard
     */
    public ReportCard(String studentName, int spanishGrades, int englishGrades, int physicsGrades,
                      int mathGrades, int historyGrades) {
        this.StudentName = studentName;
        this.spanishGrades = spanishGrades;
        this.englishGrades = englishGrades;
        this.physicsGrades = physicsGrades;
        this.mathGrades = mathGrades;
        this.historyGrades = historyGrades;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {

        this.StudentName = studentName;
    }

    public double getSpanishMarks() {

        return spanishGrades;
    }

    public void setSpanishMarks(double spanishGrades) {
        this.spanishGrades = spanishGrades;
    }

    public double getEnglishGrades() {

        return englishGrades;
    }

    public void setEnglishGrades(double englishGrades) {
        this.englishGrades = englishGrades;
    }

    public double getHistoryGrades() {

        return historyGrades;
    }

    public void setHistoryGrades(double historyGrades) {
        this.historyGrades = historyGrades;
    }

    public double getPhysicsGrades() {

        return physicsGrades;
    }

    public void setPhysicsGrades(double physicsGrades) {
        this.physicsGrades = physicsGrades;
    }


    public double getMathGrades() {
        return mathGrades;
    }

    public void setMathGrades(double mathGrades) {
        this.mathGrades = mathGrades;
    }

    public double getAverageGrade() {

        averageGrade = (spanishGrades + englishGrades + historyGrades + physicsGrades + mathGrades) / 5;
        return averageGrade;

    }

    /**
     * Ratings of the subject
     */
    public int getMax_Points() {
        return MaxPoints;
    }

    public int getPASS_Points() {
        return PASSPoints;
    }

    /**
     * Showing the ReportCard
     */
    @Override
    public String toString() {
        return "Student's Name: " + StudentName + "\n" +
                "Spanish: " + spanishGrades + "\n" +
                "English: " + englishGrades + "\n" +
                "Physics: " + physicsGrades + "\n" +
                "History: " + historyGrades + "\n" +
                "Math: " + mathGrades;

    }

    public String getRating() {

        if (averageGrade <= 55) {
            rating = FAIL;

        } else if (averageGrade <= 65) {
            rating = PASS;

        } else if (averageGrade <= 75) {
            rating = AVERAGE;

        } else if (averageGrade <= 85) {
            rating = GOOD;

        } else if (averageGrade <= 95) {
            rating = EXCELLENT;

        }
        return rating;
    }

}