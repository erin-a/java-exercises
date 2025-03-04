public class Studentpackage exercises.school;

import java.util.HashMap;

public class Student {

    // java style (keep important stuff at the top, repitive things at the bottom) -
    // fields first/at the top, then constructors, then other methods, then standard methods,
    // then getters/setters/toString/equals/hashcode
    // so the order train of thought is what are the fields, how do i create this thing,
    // what are the methods that i can use on this object, then the standard/repetitive stuff at the end

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

    public Student(String name, int studentId) {this(name, studentId, 0, 0)}

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String toString() { // all toString methods are going to look like this - no parameters
        // the return is determined by the developer what this output should/will be, they will also usally follow an alternating label/vaue format like this:
        return "Name: " + this.name + " ID: " + this.studentId + " Credits: " + this.numberOfCredits + " GPA: " + this.gpa;
    }

    // this is the equals() method auto generated by intelliJ - right click on the object, select generate, then select the relevant fields, and let it do it's thing
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return fals e;
        Student student = (Student) object;
        return studentId == student.studentId;
    }

    // this is the haschode method auto generated by intelliJ when we did the equals() method also
    // hashcode goes hand in hand with equals() method  --- often times you'll see the equals() method call the hash as part of it's functionality, which is what is happenin here
    // hashing is used for efficiency
    // allows you to take an object and turn it into a number and then you can compare those two numbers to decide if they are equal
    // in other words it's using a hash function to help it decide if two items are the same
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), studentId);
    }




    public String getName() {
        return this.name;  // 'name' in this.name refers to parameter
    }

    private void setName(String name) {
        this.name = name;  // 'name' in this.name refers to the field
        // doug took off the aName convention because he used a shortcut we will see later
    }

   public int getStudentId() {
        return studentId;
    }

   public int getNumberOfCredits() {return numberOfCredits; }


   //public void addGrade (int courseCredits, double grade) {
   // Update the appropriate fields: numberOfCredits, gpa }

    // public static double getTotalQualityScore (){
    // Double totalQualityScore = sum(
    // loop through array list of the quality score for each course?
    // for each course in array list add quality score
    // do i need to set upa method to calculate the quality score for each class or does it go inside this method?
    // i feel like i missed a few steps somewhere in all of this...
    // quality score for a class is found by multiplying the point score (0.0-4.0) by the number of credits
    //return totalQualitySore;}

    //private static double getGpa() {
    //gpa = totalQualityScore / numberOfCredits
    //return  gpa;
    //}


    //public static String getGradeLevel() {
    // Determine the grade level of the student based on numberOfCredits

    // pull number of credits
    // if numberOfCredits < 30 return freshman
    // if numberOfCredits > 29 and < 60 return sophomore
    // if numberOfCredits > 59 and < 90 return junior
    // if numberOfCredits > 91 return senior
    //}

}



//prep work for class 3.6 #2 Add custom equals() and toString() methods to the Student class.

// note:
// public String toString() {return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";}
// results in this: John (Credits: 0, GPA: 0.0)

