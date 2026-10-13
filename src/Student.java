public class Student {
    // variables for stuff
    private int id;
    private String name;
    
    // num of students
    private int NumStudents = 0;

    // student constructor
    public void Student(String tempName, int tempId) {
        this.name = tempName;
        this.id = tempId;
        NumStudents++;
    }

    // getters
    
}
/*
The student class will hold id, name, age, grade, and have a toString() thingy
*/
