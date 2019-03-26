
package kayit;


public  class kurulus extends eklenecekVarlik {
    private int kurulus_Tarihi;
    private String kurulus_Adi;
    private String kurulus_Sektoru;
    private String iletisim_Bilgileri;
    
    
    public kurulus(String eklenecek_TamIsim, int yas,String iletisim_Bilgileri, String eklenecek_Foto,String kurulus_Sektoru,int kurulus_Tarih,String kurulus_Adi) {
        super(eklenecek_TamIsim, yas, eklenecek_Foto,"kurulus");
        this.kurulus_Tarihi=kurulus_Tarihi;
        this.kurulus_Adi=kurulus_Adi;
        this.kurulus_Sektoru=kurulus_Sektoru;
        this.iletisim_Bilgileri=iletisim_Bilgileri;
        
        
    }

    public int getKurulus_Tarihi() {
        return kurulus_Tarihi;
    }

    public void setKurulus_Tarihi(int kurulus_Tarihi) {
        this.kurulus_Tarihi = kurulus_Tarihi;
    }

    public String getKurulus_Adi() {
        return kurulus_Adi;
    }

    public void setKurulus_Adi(String kurulus_Adi) {
        this.kurulus_Adi = kurulus_Adi;
    }

    public String getKurulus_Sektoru() {
        return kurulus_Sektoru;
    }

    public void setKurulus_Sektoru(String kurulus_Sektoru) {
        this.kurulus_Sektoru = kurulus_Sektoru;
    }

    public String getIletisim_Bilgileri() {
        return iletisim_Bilgileri;
    }

    public void setIletisim_Bilgileri(String iletisim_Bilgileri) {
        this.iletisim_Bilgileri = iletisim_Bilgileri;
    }

  


    
    
}
