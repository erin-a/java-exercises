import java.util.ArrayList;

public class Course {

// has-a's
// *name  - String
// *id number - String
// description - String
// meeting time/date - Date
// semester - String
// credits - double
// *roster - ArrayList<Student>  (array list of student object - NOT an array list of strings, it could be an array list of strings but it would be less useful)
// instructor(s) - Instructor (as a class we create, or an array list of Instructor objects)
// grades (gradebook) - Arraylist<HashMap<Student, double>> hashmap per assignment, use Student class/object, double for the grade
// number of seats (maximum capacity) - int
// prerequisites ArrayList<Course> (where Course is an object)
// location - String


    private String name;
    private String number;
    private ArrayList<Student> roster; //final for ArrayList - doesn't change the object, it stops you from making a new arraylist or swapping it out

    // inside () are the parameters
    // role of the constructor is to initialize the fields, 2 ways to do this:
    // 1. pass them in as parameters - these go inside the ()
    // 2. every time you create an object, the fields start as this value - these go in the

    // parameters
    public Course(String name, String number) {
        this.number = name; // this what you write for the parameters you pass in
        this.name = number;
        this.roster = new ArrayList<>(); // this is how you initialize this to a default value, in this case we are call the ArrayList constructor to make a brand new empty arry list so when we add students, the array list is ready to accept them.
    }

    //short cut for creating getters and setters:
    // go to Code menu in the nav bar
    // select generate
    // select getter, setter, getter AND setter - then it will auto generate, using the fields you've already created
    // generates as public by default, so you have to go back and change things to private
    // do this conscientiously and with purpose in terms of what has a getter and/or a setter, and what is public and what is private

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    private void setNumber(String number) {
        this.number = number;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }
}

// setter implies you're swapping the entire variable, not just modifying it a little bit
// setters can include things like validation and arithmetic and other manipulations
// so when you're setting an array list you're talking about throwing out the existing list and replacing it with an entirely new array list
// adding a student is a method - it's a behavior
// getters are almost always public, a private getter is really the same as this.___
// if you aren't sure if should be public or private, don't create it until you know - that way you know you need it, don't create something people can abuse
// if a setter exists, use it instead of the this.___


// prep work for class 3.6 #3 Add custom equals() and toString() methods to the Course class which you started in the exercises for class 5.