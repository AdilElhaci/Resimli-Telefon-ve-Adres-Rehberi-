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
public class taxiDuragi extends nobetYerleri{
    
    private int aktif_Taksi_Sayisi; 
    private int sofur_Sayisi;
    private int bekleme_odasinin_Sayisi;
    
    
    
    public taxiDuragi(String nesneninTuru, String adres_Bilgileri, String iletisim_Bilgileri,int bekleme_odasinin_Sayisi,int sofur_Sayisi,int aktif_Taksi_Sayisi) {
        super("Texi Duragi", adres_Bilgileri, iletisim_Bilgileri);
        this.aktif_Taksi_Sayisi= aktif_Taksi_Sayisi;
        this.bekleme_odasinin_Sayisi=bekleme_odasinin_Sayisi;
        this.sofur_Sayisi=sofur_Sayisi;
        
    }

    public int getAktif_Taksi_Sayisi() {
        return aktif_Taksi_Sayisi;
    }

    public void setAktif_Taksi_Sayisi(int aktif_Taksi_Sayisi) {
        this.aktif_Taksi_Sayisi = aktif_Taksi_Sayisi;
    }

    public int getSofur_Sayisi() {
        return sofur_Sayisi;
    }

    public void setSofur_Sayisi(int sofur_Sayisi) {
        this.sofur_Sayisi = sofur_Sayisi;
    }

    public int getBekleme_odasinin_Sayisi() {
        return bekleme_odasinin_Sayisi;
    }

    public void setBekleme_odasinin_Sayisi(int bekleme_odasinin_Sayisi) {
        this.bekleme_odasinin_Sayisi = bekleme_odasinin_Sayisi;
    }
    
}
