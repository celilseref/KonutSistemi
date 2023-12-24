public class Kiraci {
    private String name;
    private String sname;
    private EvSahibi evSahibi;

    public Kiraci(String name, String sname, EvSahibi evSahibi) { //constructor oluşturuldu.
        this.name = name;
        this.sname = sname;
        this.evSahibi = evSahibi    ;
    }
    public void displayInfo(){ //Bilgileri ekrana yazdıran metot.
        System.out.println("Kiraci Adi:"+name+"\nKiraci Soyadi:"+sname+"\n\t Ev Sahibi\n"+evSahibi.toString());

    }

}
