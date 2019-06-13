public class Studentpackage exercises.school;

import java.util.HashMap;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;


    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    //public Student(String name, int studentId) {this(name, studentId, 0, 0)}

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    private void setName(String name) {
        this.name = name;  // 'name' in this.name refers to the field
        // doug took off the aName convention because he used a shortcut we will see later
    }

    public String getName() {

        return this.name;  // 'name' in this.name refers to parameter
    }


//    public int getStudentId() {return studentId;}

    public void addGrade (int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
    }

//    public int getNumberOfCredits() {return numberOfCredits; }


    public static double getTotalQualityScore (){
        // Double totalQualityScore = sum(
        // loop through array list of the quality score for each course?
        // for each course in array list add quality score
        // do i need to set upa method to calculate the quality score for each class or does it go inside this method?
        // i feel like i missed a few steps somewhere in all of this...
        // quality score for a class is found by multiplying the point score (0.0-4.0) by the number of credits
        return totalQualitySore;
    }

    private static double getGpa() {
        gpa = totalQualityScore / numberOfCredits
        return  gpa;
    }


    public static String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits

        // pull number of credits
        // if numberOfCredits < 30 return freshman
        // if numberOfCredits > 29 and < 60 return sophomore
        // if numberOfCredits > 59 and < 90 return junior
        // if numberOfCredits > 91 return senior
    }

}



//prep work for class 3.6 #2 Add custom equals() and toString() methods to the Student class.

// note:
// public String toString() {return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";}
// results in this: John (Credits: 0, GPA: 0.0)

