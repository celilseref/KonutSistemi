public abstract class Konut {
    protected String adres;
    public Konut(String adres) { //constructor oluşturuldu.
        this.adres = adres; //atama yapıldı.
    }
      void displayInfo(){ //Bilgileri ekrana yazdıran metot.
        System.out.println("Adres:"+adres);
    }

    public void setAddress(String adres) {
        this.adres = adres;
    }
}
