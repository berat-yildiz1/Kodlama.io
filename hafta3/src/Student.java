public class Student extends User{
    private int studentno;
    private String obs;

    public Student(){

    }
    public Student(int id,int studentno,String obs,String name){
        this.id=id;
        this.studentno=studentno;
        this.obs=obs;
        this.name=name;

    }


    public int getStudentno() {
        return studentno;
    }

    public void setStudentno(int studentno) {
        this.studentno = studentno;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }



}
