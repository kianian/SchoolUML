public class School {
    private String name;
    private Section[] sectionArray = new Section[200];
    private int sectionCount;
    public School(String name){
        this.name = name;
        this.sectionCount = sectionCount;
        this.sectionArray= sectionArray;
    }
    public String getName() {
        return name;
    }
    public Section[] getSectionArray() {
        return sectionArray;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addSection(Section s){
        this.sectionArray[sectionCount]= s;
        sectionCount++;
    }
}
