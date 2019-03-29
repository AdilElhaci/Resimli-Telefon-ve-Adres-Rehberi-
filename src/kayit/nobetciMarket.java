package kayit;

/*
Kategoriler :
 Sıvı Yağlar 
 Organik Gıda 
 Gurme Ürünler 
 Glutensiz Ürünler 
 Kuruyemiş 
 Baharat 
 Aktar Ürünleri 
------------------


bulunan_Markalar :

Nescafe
Arifoğlu 
Mehmet Efendi
Kahve Dünyası 
Lavazza
Komili 
Jacobs 
Familia 
Aktar Diyarı

------------------
firsat_Urunleri







*/

public class nobetciMarket extends nobetYerleri{
    private String market_Ozellikleri;
    private String Kategoriler;
    private String bulunan_Markalar;
    private String firsat_Urunleri;
    public nobetciMarket( String adres_Bilgileri, String iletisim_Bilgileri,String firsat_Urunleri,String bulunan_Markalar,String Kategoriler) {
        super("Market", adres_Bilgileri, iletisim_Bilgileri);
        this.Kategoriler=this.Kategoriler;
        this.bulunan_Markalar=bulunan_Markalar;
        this.firsat_Urunleri=this.firsat_Urunleri;
        this.market_Ozellikleri=market_Ozellikleri;
    }

    public String getMarket_Ozellikleri() {
        return market_Ozellikleri;
    }

    public void setMarket_Ozellikleri(String market_Ozellikleri) {
        this.market_Ozellikleri = market_Ozellikleri;
    }

    public String getKategoriler() {
        return Kategoriler;
    }

    public void setKategoriler(String Kategoriler) {
        this.Kategoriler = Kategoriler;
    }

    public String getBulunan_Markalar() {
        return bulunan_Markalar;
    }

    public void setBulunan_Markalar(String bulunan_Markalar) {
        this.bulunan_Markalar = bulunan_Markalar;
    }

    public String getFirsat_Urunleri() {
        return firsat_Urunleri;
    }

    public void setFirsat_Urunleri(String firsat_Urunleri) {
        this.firsat_Urunleri = firsat_Urunleri;
    }

   
    
}
