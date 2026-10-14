

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
    // student constructor for the file thingy
    public Student(String tempName, int tempAge) {
        this.name = tempName;
        this.age = tempAge;

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
    //  this is old one:  return "name is " + name + " and their id is: " + id + " ";
    public String toString() {
        return name + " " + age;
    }
    /* 
    public static void readFile() {
        File students = new File("/Users/lucianhoffman/Documents/students.txt");
        try (Scanner myReader = new Scanner(students)) {
            while (myReader.hasNextLine()) {
                String name = myReader.nextLine();
               // System.out.println(name);
                String s1 = name;
                String studentName = s1.substring(0, s1.indexOf(","));
                String studentAge = s1.substring((s1.indexOf(",") + 2));
                int age = Integer.parseInt(studentAge);
               // System.out.println("name: " + studentName + " and age is: " + age + " asd");
                
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }

    }
    */
   
// the code has the correct file location 
} 

/*
The student class will hold id, name, age, grade, and have a toString() thingy

the name and age need to go into array or student
student constructor is not working inside of student (duh)

*/
