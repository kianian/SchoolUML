public class Runner {
    public static void main (String[] args){
        School hereYouGo =  new School("Berkeley High School");
        Teacher albi = new Teacher("Computer Science", "Mr. Albinson", 1224);
        Teacher wolkenfeld = new Teacher("Biology", "Mr. Wolkenfeld", 1234);
        Teacher weitz = new Teacher("Math", "Michael Weitz", 1256);
        Section math = new Section("Math",weitz);
        Section compSci = new Section("Computer Science",albi);
        Section bio = new Section("Biology",wolkenfeld);
        Student kian = new Student(12,"Kian",1298);
        Student jasper = new Student(4,"Jasper",1278);
        Student luke = new Student(1,"Luke Major", 1200);
        Student sam = new Student(1, "Sam Gray", 1212);
        Student noah = new Student(12, "Noah Ballbuttcrack", 1233);
        Student ben = new Student(11, "Ben",1211);
        weitz.addSections(math);
        albi.addSections(compSci);
        wolkenfeld.addSections(bio);
        math.addStudent(kian);
        math.addStudent(luke);
        compSci.addStudent(jasper);
        compSci.addStudent(sam);
        bio.addStudent(noah);
        bio.addStudent(ben);
        System.out.println(math.toString());
        System.out.println(compSci.toString());
        System.out.println(bio.toString());
    }

}
