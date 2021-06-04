package com.example.MSGrades;
import java.util.ArrayList ;
import java.util.Arrays;


public class MSGrades {

    private final String[] teachers = {"Ms. Smith", "Mr. Johnson", "Mrs. Doe"};
    
    // Create 4 ArrayLists below all private constant properties (final)

        // 1. a new instance of a students ArrayList storing strings

    private final ArrayList<String> students = new ArrayList<>();

        // 2. a new instance of a math grades ArrayList storing integers

    private final ArrayList<Integer> mathGrades = new ArrayList<>();
        // 3. a new instance of a science grades ArrayList storing integers

    private final ArrayList<Integer> scienceGrades = new ArrayList<>();
        // 4. a new instance of a math grades ArrayList storing integers

    private final ArrayList<Integer> englishGrades = new ArrayList<>();


    public MSGrades(){
        // Add some students and their grades to the ArrayLists

            // add two students to the students ArrayList
            students.add("Jack");
            students.add("Jill");

            // add two corresponding values for the two students to the math grades ArrayList
            mathGrades.add(89);
            mathGrades.add(93);

            // add two corresponding values for the two students to the science grades ArrayList
            scienceGrades.add(97);
            scienceGrades.add(88);


            // add two corresponding values for the two students to the english grades ArrayList
            englishGrades.add(81);
            englishGrades.add(79);
    }

    public void printStudents(){
        // loop through the students ArrayList with a For Each loop
            // print each students name on a new line as output
        //students.forEach(n -> System.out.println(n));
        for(String student :  students){
            System.out.println("Student: " + student);
        }
    }

    // Make a method that prints an individual students grades
    // It will be public, not have a return value,
    // and have one int type parameter that is a students index
    public void grades(int student){
    // Inside the method:
        // Print the students name by using the index variable to index the students array
        System.out.println(students.get(student));
        // Print a concatenated string of say "Math: " + and the corresponding grade
        System.out.println("Math: "+ mathGrades.get(student));
            // from that ArrayList of grades by index
        // Do this for the next two subjects
        System.out.println("Science: "+ scienceGrades.get(student));
        System.out.println("English: "+ englishGrades.get(student));
        // Total of four output statements
        }
    public static void main(String[] args) {

        // create a new instance of MSGrades class and store in a variable
            // (anything like msGrade8)
        MSGrades msGrade8 = new MSGrades();
        // look up how to print an empty new line
            // for readability
        System.out.println();

        System.out.println("Middle School Roster");
        System.out.println("====================");

        // invoke or run the printStudents method on our class instance
        msGrade8.printStudents();
        // Print another empty line if desired for readability
        System.out.println();
        // Use a for loop to loop through the given teachers array on the class instance
        // inside the loop
       for (int i = 0; i < msGrade8.teachers.length; i++){
           // create a new variable that stores the result of "Teacher: " +
           // teachers name from the array using the counter variable

            String thisTeacher = "Teacher: "+ msGrade8.teachers[i];
           // Print the new variable as output
            System.out.println(thisTeacher);
        }




        System.out.println("\nStudent Grades:\n");

        // Use a for loop to loop through students ArrayList on the class instance
        for(int i = 0 ; i < msGrade8.students.size(); i++){
            // inside the loop
            // pass the counter var as an index to the printStudentGrades method
            msGrade8.grades(i);
            System.out.println();
            // to print each students info
            // Print a new line if you want it to look presentable

        }


    }
}
