import java.util.Arrays;

public class Section {
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize;

    public Section(String name, Teacher teacher) {
        this.currentSize = currentSize;
        this.name = name;
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student s) {
        this.students[currentSize] = s;
        currentSize++;
    }
    public String toString() {
        //“This [section name] class is taught by [Teacher] and has [size] students: [each student name]”
        String names = "";
        for(int i=0; i<currentSize; i++){
            names += this.students[i].getName();
            if(i!= currentSize-1){
                names += ", ";
            }
        }
        return "This " + this.name + " class is taught by " + this.teacher.getName() + " and has " + this.currentSize + " students: " + names;

    }
}