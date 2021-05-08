public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1, 10, "brtyldz", "berat");
        Student student2 = new Student(2, 11, "frtyldz", "ferat");
        Student student3 = new Student(3, 12, "crtyldz", "cerat");

        Student [] students={student1,student2,student3};

        Instructor ınstructor1 = new Instructor(1,10,"bilgisayar","kasım");
        Instructor ınstructor2 = new Instructor(2,11,"filgisayar","fasım");
        Instructor ınstructor3 = new Instructor(3,12,"cilgisayar","casım");

        Instructor [] instructors={ınstructor1,ınstructor2,ınstructor3};

        InstructorManager instructorManager=new InstructorManager();


            instructorManager.notver(ınstructor1,student1);
            instructorManager.notver(ınstructor2,student3);

        StudentManager studentManager=new StudentManager();

        studentManager.dersal(ınstructor1,student2);
        studentManager.dersal(ınstructor2,student1);



    }
}
