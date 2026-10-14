import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[]args) {
    //Student s1 = new Student();

    //System.out.println("s1 is " + s1.toString());

    //readFile();
    ArrayList<Student> studentList = readFile();

    //System.out.println(studentList);
    System.out.println(studentList.get(0));
    

    }
    
    
    public static ArrayList<Student> readFile() {
        ArrayList<Student> studentList = new ArrayList<>();


        File students = new File("/Users/lucianhoffman/Documents/students.txt");
        try (Scanner myReader = new Scanner(students)) {
            while (myReader.hasNextLine()) {
                String name = myReader.nextLine();
               // System.out.println(name);
                String s1 = name;
                String studentName = s1.substring(0, s1.indexOf(","));
                String studentAge = s1.substring((s1.indexOf(",") + 2));
                int age = Integer.parseInt(studentAge);
                
                Student student = new Student(studentName, age); // hmmm
                studentList.add(student);


                // System.out.println("name: " + studentName + " and age is: " + age + " asd");
                
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        // return the array list of students
        return studentList;
        
        
    }


}

