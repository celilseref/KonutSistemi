public class Main {
    public static void main(String[] args) {
        Konut bina1= new Bina("Kadıköy",4); //Konut nesnesinden türettiğimiz 1 tane binamız var.
        //Bu binanın ev sahibini belirleyelim.
        EvSahibi evSahibi=new EvSahibi("Ayşegül","DAL", (Bina) bina1);

        //Binanın içine daireler ekleyelim
        Daire[] daireler=new Daire[]{new Daire("Kadıköy",5,1),
                            new Daire("Kadıköy",35,2),
                            new Daire("Kadıköy",19,3)
        };
        evSahibi.addApartment(daireler); //Ev sahibine evlerini ekledik.
        Kiraci kiraci=new Kiraci("Ali","Yılmaz",evSahibi);//Artık ev sahibi yukarda tanımladığımız Ayşegül Dal oldu.

        //Bilgileri yazdır
        System.out.println("\n--Ev Sahibi Bilgileri--");
        evSahibi.displayInfo();
        System.out.println("\n--Bina Bilgileri--");
        bina1.displayInfo();
        System.out.println("\n--Dairelerin Bilgileri--");

        for (Daire daire:daireler){ // Tüm daire bilgilerini yazdıran döngü.
            System.out.println("Adres:"+daire.adres+"\nApartman No:"+daire.getApartmentNumber()+"\nDaire Sırası:"+daire.daireSıraNo);
            System.out.println("\n");
        }
        System.out.println("\n--Kiracı Bilgileri--");
        kiraci.displayInfo();

    }
}