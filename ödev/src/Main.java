public class Main {

    public static void main(String[] args) {

        Programlama programlama1 = new Programlama(1,"java+react",20);
        Programlama programlama2 = new Programlama(2,"C#",30);
        Programlama programlama3 = new Programlama(3,"PYTHON",40);

        Programlama[] Programlar ={programlama1,programlama2,programlama3};

        TalebEden talebEden1= new TalebEden(100,"Hüsna",programlama1.dersad);
        TalebEden talebEden2= new TalebEden(101,"Berat",programlama2.dersad);

        TalebEden[] talebedenler={talebEden1,talebEden2};

        Egitmen egitmen=new Egitmen(1,"Engin","Çok Acayip");

        Taleb taleb=new Taleb();

            taleb.AlmaTaleb(programlama1,talebEden1,egitmen);
            taleb.AlmaTaleb(programlama2,talebEden2,egitmen);
            taleb.BırakmaTalebi(programlama3,talebEden1,egitmen);
            taleb.BırakmaTalebi(programlama1,talebEden2,egitmen);


    }
}
