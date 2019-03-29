/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
    

   

    
    

 */
package kayit;

public class nobetYerleri {
    
    private String nesnenin_Turu;
    private String adres_Bilgileri;
    private String iletisim_Bilgileri;

    public nobetYerleri(String nesneninTuru, String adres_Bilgileri, String iletisim_Bilgileri) {
        this.nesnenin_Turu = nesneninTuru;
        this.adres_Bilgileri = adres_Bilgileri;
        this.iletisim_Bilgileri = iletisim_Bilgileri;
    }

    public String getNesnenin_Turu() {
        return nesnenin_Turu;
    }

    public void setNesnenin_Turu(String nesnenin_Turu) {
        this.nesnenin_Turu = nesnenin_Turu;
    }

    public String getAdres_Bilgileri() {
        return adres_Bilgileri;
    }

    public void setAdres_Bilgileri(String adres_Bilgileri) {
        this.adres_Bilgileri = adres_Bilgileri;
    }

    public String getIletisim_Bilgileri() {
        return iletisim_Bilgileri;
    }

    public void setIletisim_Bilgileri(String iletisim_Bilgileri) {
        this.iletisim_Bilgileri = iletisim_Bilgileri;
    }

  
   

    
}
