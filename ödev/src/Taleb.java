import javax.swing.*;

public class Taleb {

    public void AlmaTaleb(Programlama program,TalebEden talebEden,Egitmen egitmen){

        System.out.println(talebEden.Name+" Adlı kişi tarafından "+egitmen.ad+" Adlı eğitminin "+program.dersad+" Dersi Alındı! Teşekkürler");
        program.kapasite= program.kapasite-1;
        System.out.println("kalan kapasite: "+program.kapasite);

    }
    public void BırakmaTalebi(Programlama program,TalebEden talebEden,Egitmen egitmen){

        System.out.println(talebEden.Name+"Adlı kişi tarafından"+egitmen.ad+" Adlı eğitminin "+program.dersad+" Dersini bırakıldı!");
        program.kapasite= program.kapasite+1;
        System.out.println("Mevcuz kapasite: "+program.kapasite);

    }

}
