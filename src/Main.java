import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[]args) {
        // array list 
        ArrayList<Student> studentList = readFile();
        ArrayList<Student> newStudent = newList(studentList);
        
        System.out.println("Imported the .txt file");
        System.out.println(".txt Array list:\t " + studentList);
        //int gradeLvl = gradeLvl(ageInt);
        //System.out.println(gradeLvl);
        
        // use getters from student class!
        // then we get the name and age from that!!
        // int arrayNum = studentList.size();
        //System.out.println(studentList);
        System.out.println("New list:\t" + newStudent);
        //System.out.println(newStudent.get(2));
    }
   
    // readFile() to create an array list of students
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
 
 
                //System.out.println("name: " + studentName + " and age is: " + age + " asd");
                
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        // return the array list of students
        return studentList;
        
        
    }
    public static ArrayList<Student> newList(ArrayList<Student> studentList) {
        ArrayList<Student> newStudent = new ArrayList<>();
        //ArrayList<Student> studentList = readFile();

        for (int i = 0; i < studentList.size(); i++) {
            String name1 = studentList.get(i).getName();
            int age1 = studentList.get(i).getAge();
            
            //System.out.println(name1);
            int studentID = studentList.get(i).randId();
            int grade = gradeLvl(age1);
            
            Student student1 = new Student(name1, studentID, age1, grade);
            newStudent.add(student1); 
        }  
        return newStudent;
    } 

    // method for grade level bc i dont want to put it in the other for-loops
    public static int gradeLvl(int age) {
        
        int thing=0;
        for (int i = 0; i < 18; i++) {
            if (age == i) {
                thing = i-6;
            } else {
              
                
            }
            
        }
        //System.out.println(thing);
        return thing;
        
    }

}