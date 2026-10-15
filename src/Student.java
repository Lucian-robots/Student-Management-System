

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
        NumStudents++;
    }
    // default if nothing is added
    public Student() {
        name = "Hello";
        NumStudents++;
    }

    // generate a random ID 
    public int randId() {
        int randId  = (int) (Math.random() *100000)+ 10;
        return randId;

    }

    
    // getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // toString
    @Override
    public String toString() {
        return name + " " + age;
    }
    
} 

/*
The student class will hold id, name, age, grade, and have a toString() thingy

the name and age need to go into array or student
student constructor is not working inside of student (duh)

*/
