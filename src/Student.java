public class Student extends Person{
    private Section[] sections = new Section[10];
    private int grade;
    private int sectionCount;

    public Student(int grade, String name, int id){
        super(name, id);
        this.grade = grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Section[] getSections() {
        return sections;
    }
    public int getGrade() {
        return grade;
    }
    public void addSections(Section s){
        this.sections[sectionCount]= s;
        sectionCount++;
    }
}
