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

    // misc note on method return types/values: you have to declare the data type of the object a method will return, if the method will not return a value, you declare it void instead of the data type

// behaviors - each will need an access modifiers (public/private), return type (void or data type), and arguments (input parameters)
// *add a student - public (so maybe a student or teacher class could add the class), void, Student
// record a grade discussion - a student can earn a grade, a teacher can assign a grade?
// *drop a student - public (so maybe a student or teacher class could add the class), void, Student
// *print roster - will display information, not retrieve anything, void, public








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

    public boolean addStudent (Student_s) { // was a void, but changed to bool since it's possible to not be able to be added to the class
        // to add a student you add them to the roster
        // the roster is an array list initialized in our construtor
        // so we need to grab it this.roster
        // then check list of available of things to do - select add(Student_s)
        // this.roster.add(s);
        // potential problems: adding same student multiple times
        // so we can check if student is already on the list by looping through the arraylist, use an if statement, or a combination of the two.
        // let's try a method built into an array list - found my typing into intelliJ and looking for options
        if (!this.roster.contains(s)) ;
        {// the ! means not, so this is saying if the roster does NOT contain this student,
            this.roster.add(s); // then add the student
            return true; // added when we changed from void to boolean
        }
        return false; // so you can alert the student if they weren't added
    }

    public void dropStudent(Student s) {
        this.roster.remove(s);
    }

    public void printRoster() {
        // loop
        for(int i - 0; i < this.roster.size(); i++) {
            System.out.println(this.roster.get(i)); //this.roster.get(i) is grabbing the student at that index. then we print out the student at that index, which calls the toString - if we don't set it, it will call the toString for the class
        }
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

    public static void main(String[] args) {
        Course lc101 = new Course("LaunchCode", "LC101");
        Student s = new Student ("Keanu Reeves"); // creates a new student, you have to provide any 1 of the constructors, so you can pass in just a name or a lot of details
        Student s2 = new Student ("Lawrence Fishbourne");
        Student s3 - new Student ("Carrie Moss");
        lc101.addStudent(s);// adds them to the course, start with name of course, then dot to give you a list to choose from
        lc101.addStudent(s2);
        lc101.addStudent(s3);
        lc101.printRoster();
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