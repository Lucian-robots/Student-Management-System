import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Student {
    // variables for stuff
    private int id;
    private String name;
    private int age;
    private int grade;

    // num of students
    private int NumStudents = 0;

    // student constructor
    public Student(String tempName, int tempId, int tempAge, int tempGrade) {
        this.name = tempName;
        //this.id = tempId;
        this.age = tempAge;
        this.grade= tempGrade;
        id = NumStudents + 1000;
        NumStudents++;
    }
    public Student() {
        name = "Hello";
    }

  
    // getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    // toString
    public String toString() {
        return "name is " + name + " and their id is: " + id + " ";
    }
    public static void readFile() {
        File students = new File("/Users/lucianhoffman/Documents/students.txt");
        try (Scanner myReader = new Scanner(students)) {
            while (myReader.hasNextLine()) {
                String name = myReader.nextLine();
                System.out.println(name);
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }

// the code has the correct file location 
} 
/*
The student class will hold id, name, age, grade, and have a toString() thingy


*/
