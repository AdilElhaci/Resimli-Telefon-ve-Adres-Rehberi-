/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kayit;

/**
 *
 * @author adel
 */
public class acilNumaralar extends nobetYerleri{
    private String kurumun_Adi;
    public acilNumaralar( String adres_Bilgileri, String iletisim_Bilgileri,String kurum_Adi) {
        super("Acil Numarlari", adres_Bilgileri, iletisim_Bilgileri);
        this.kurumun_Adi=kurumun_Adi;
    }

    public String getKurumun_Adi() {
        return kurumun_Adi;
    }

    public void setKurumun_Adi(String kurumun_Adi) {
        this.kurumun_Adi = kurumun_Adi;
    }
    
}
