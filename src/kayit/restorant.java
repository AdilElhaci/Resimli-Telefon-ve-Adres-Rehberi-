/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kayit;

/**
Restoran Özellikleri :
-Açık Havada Oturma
-Dışarı Yemek Servisi
-Kredi Kartı Geçerli
* 
* ----------
* 
Öğünler
-Kahvaltı
-Brunch
-Öğle Yemeği
-Akşam Yemeği 

* 
* Yemekleri
  -kebap 
  -Fondü
  -Dondurma
  -Donutlar
  -Hamburger
* 
 */
public class restorant extends nobetYerleri{
    private String ogunler;
    private String restoran_Ozellikleri;
    private String yemek_Cesitleri; 
    private String yemekleri;
    public restorant(String nesneninTuru, String adres_Bilgileri, String iletisim_Bilgileri,String yemek_Cesidi,String ogunler,String mutfaklar_Ve_Yemekler) {
        super("Resturant", adres_Bilgileri, iletisim_Bilgileri);
        this.yemek_Cesitleri=yemek_Cesidi;
        this.ogunler=ogunler;
        this.yemekleri=yemekleri;
    }

    public String getOgunler() {
        return ogunler;
    }

    public void setOgunler(String ogunler) {
        this.ogunler = ogunler;
    }

    public String getRestoran_Ozellikleri() {
        return restoran_Ozellikleri;
    }

    public void setRestoran_Ozellikleri(String restoran_Ozellikleri) {
        this.restoran_Ozellikleri = restoran_Ozellikleri;
    }

    public String getYemek_Cesitleri() {
        return yemek_Cesitleri;
    }

    public void setYemek_Cesitleri(String yemek_Cesitleri) {
        this.yemek_Cesitleri = yemek_Cesitleri;
    }

    public String getYemekleri() {
        return yemekleri;
    }

    public void setYemekleri(String yemekleri) {
        this.yemekleri = yemekleri;
    }
    
    
    
}
