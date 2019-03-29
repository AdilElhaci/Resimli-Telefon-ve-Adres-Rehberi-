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
public class nobetciEczaneler extends nobetYerleri{

    
    private String eczacenin_isimi;
    private int eczane_Sira_No;
    private int calisan_Sayisi;

    public nobetciEczaneler(String nesneninTuru, String adres_Bilgileri, String iletisim_Bilgileri,int eczane_Sira_No,String eczacenin_isimi,int calisan_Sayisi) {
        super( "Eczane",  adres_Bilgileri,  iletisim_Bilgileri);
        this.eczacenin_isimi=eczacenin_isimi;
        this.eczane_Sira_No=eczane_Sira_No;
        this.calisan_Sayisi=calisan_Sayisi;
    }

    public int getCalisan_Sayisi() {
        return calisan_Sayisi;
    }

    public void setCalisan_Sayisi(int calisan_Sayisi) {
        this.calisan_Sayisi = calisan_Sayisi;
    }

    public String getEczacenin_isimi() {
        return eczacenin_isimi;
    }

    public void setEczacenin_isimi(String eczacenin_isimi) {
        this.eczacenin_isimi = eczacenin_isimi;
    }

    public int getEczane_Sira_No() {
        return eczane_Sira_No;
    }

    public void setEczane_Sira_No(int eczane_Sira_No) {
        this.eczane_Sira_No = eczane_Sira_No;
    }
        
 
    
    
}
