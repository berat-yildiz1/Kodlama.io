public class Instructor extends User{

    private int personelid;
    private String Depname;


    public Instructor(){

    }
    public Instructor(int id,int personelid,String depname,String name){
        this.id=id;
        this.personelid=personelid;
        this.setDepname(depname);
        this.name=name;

    }

    public int getNotv() {
        return notv;
    }

    public void setNotv(int notv) {
        this.notv = notv;
    }

    private  int notv;

    public int getPersonelid() {
        return personelid;
    }

    public void setPersonelid(int personelid) {
        this.personelid = personelid;
    }

    public String getDepname() {
        return Depname;
    }

    public void setDepname(String depname) {
        Depname = depname;
    }
}
