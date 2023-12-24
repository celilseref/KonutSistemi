public class Daire extends Konut{ //Konut sınıfından kalıtım yoluyla özellikler alınır.
    int daireSıraNo; //dairenin sıra numarası tanımlandı.
    private int apartmentNumber; //Daire numarası tanımladık.

    public Daire(String adres, int apartmentNumber, int daireSıraNo) { //constructor oluşturuldu.
        super(adres);//üst sınıfın metodu çalıştırıldı ve adresi yazdırıldı.
        this.daireSıraNo = daireSıraNo; //Atamalar yapıldı.
        this.apartmentNumber=apartmentNumber; //Atamalar yapıldı.
    }
    public void displayInfo(){ //Bilgileri ekrana yazdıran metot.
        super.displayInfo(); //Konut sınıfının bilgileri yazdıran metodu çalıştırıldı.
        System.out.println("\nDaire Numarası:"+apartmentNumber);
    }
    public int compareTo(Daire otherDaire){ //Daireleri karşılaştıran metot.
        return Integer.compare(this.apartmentNumber,otherDaire.getApartmentNumber());

    }

    public int getApartmentNumber() {  //apartmentNumber private olduğu için getter metodu kullanıldı.
        return apartmentNumber;
    }
}


