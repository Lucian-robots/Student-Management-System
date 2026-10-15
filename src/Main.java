import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[]args) {
        ArrayList<Student> studentList = readFile();
        String name; 
        int ageInt;
        gradeLvl(5);

        // use getters from student class!
        // then we get the name and age from that!!
        int arrayNum = studentList.size();
        for (int i = 0; i < arrayNum; i++) {
            String name1 = studentList.get(i).getName();
            int age1 = studentList.get(i).getAge();
            //System.out.println(name1);
            int studentID = studentList.get(i).randId();
            
        }   
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

    // method for grade level bc i dont want to put it in the other for-loop
    public static int gradeLvl(int age) {
        int thing = 0;
        for (int i = 1; i < 13; i++) {
            if (age == i) {
                thing = i;
            } else {
                System.out.println("Invalid age");
            }
            
        }
        return thing;
        

    }


}

