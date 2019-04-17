public class Teacher extends Person{
    private Section[] sections = new Section[10];
    private String subject;
    private int sectionCount;
    public Teacher(String subject, String name, int id){
        super(name, id);
        this.subject = subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Section[] getSections() {
        return sections;
    }

    public String getSubject() {
        return subject;
    }
    public void addSections(Section s){
        this.sections[sectionCount]= s;
        sectionCount++;
    }
}

