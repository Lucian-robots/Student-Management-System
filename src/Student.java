public class Student {
    // variables for stuff
    private int id;
    private String name;
    
    // num of students
    private int NumStudents = 0;

    // student constructor
    public Student(String tempName, int tempId) {
        this.name = tempName;
        this.id = tempId;
        NumStudents++;
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
}
/*
The student class will hold id, name, age, grade, and have a toString() thingy
*/
