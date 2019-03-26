
package kayit;


public  class hayvan extends eklenecekVarlik {
    
    private String hayvvan_Sifati;
    private String hayvan_Ozelligi;
    private int kayit_Numarasi;
    
    public hayvan(String eklenecek_TamIsim,String hayvvan_Sifati, int yas, String eklenecek_Foto,String hayvan_Ozelligi,int kayit_Numarasi){
        super(eklenecek_TamIsim, yas, eklenecek_Foto,"hayvan");
        this.hayvvan_Sifati=hayvvan_Sifati;
        this.hayvan_Ozelligi=hayvan_Ozelligi;
        this.kayit_Numarasi=kayit_Numarasi;  
    } 

    public String getHayvvan_Sifati() {
        return hayvvan_Sifati;
    }

    public void setHayvvan_Sifati(String hayvvan_Sifati) {
        this.hayvvan_Sifati = hayvvan_Sifati;
    }

    public String getHayvan_Ozelligi() {
        return hayvan_Ozelligi;
    }

    public void setHayvan_Ozelligi(String hayvan_Ozelligi) {
        this.hayvan_Ozelligi = hayvan_Ozelligi;
    }

    public int getKayit_Numarasi() {
        return kayit_Numarasi;
    }

    public void setKayit_Numarasi(int kayit_Numarasi) {
        this.kayit_Numarasi = kayit_Numarasi;
    }

   


    

   
        
  
    
    
}
