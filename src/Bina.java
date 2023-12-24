public class Bina extends Konut { //Konut sınıfından kalıtım yoluyla özellikler alındı.
    public int numberOfFloors;//Kat sayısı tanımlandı.
    public Bina(String adres,int numberOfFloors){//constructor oluşturuldu.
       super(adres); //Konut sınıfındaki constructor çalıştırıldı.
        this.numberOfFloors=numberOfFloors; //Atamalar yapıldı.
    }
    public void  displayInfo(){ //Bilgileri ekrana yazdıran metot.
        super.displayInfo();//üst sınıfın metodu çalıştırıldı ve adresi yazdırıldı.
        System.out.println("Kat Sayısı:"+numberOfFloors);

    }
}
