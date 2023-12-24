import java.util.ArrayList;
import java.util.List;

public class EvSahibi {
   private String name;
   private String sname;
   private List<Daire[]> sahipDaireleri; //Sahip olduğu daireler birden fazla olabileceği için listede tutuldu.
   public Bina bina; //Sahip olacağı bina nesnesi tanımlandı.

    public EvSahibi(String name, String sname, Bina bina) { //constructor oluşturuldu.
      //Atamalar yapılır.
        this.name=name;
        this.sname=sname;
        this.bina=bina;
        sahipDaireleri=new ArrayList<Daire[]>();
    }

  public String toString() { // Bu metot ile return kullanarak yazdırabildik.
        return "İsmi:"+name+"\nSoy ismi:"+sname+"\nBina Adresi:"+ bina.adres+"\nBina Kat Sayısı:"+ bina.numberOfFloors;
    }

    public void displayInfo(){ //Bilgileri yazdıran metot.
        System.out.println("İsmi:"+name+"\nSoy ismi:"+sname+"\nBina Adresi:"+ bina.adres+"\nBina Kat Sayısı:"+ bina.numberOfFloors);
    }
    public void addApartment(Daire[] daire){ //Sahip olduğu dairelere ekleme yapan metot.
        sahipDaireleri.add(daire);
    }
}
