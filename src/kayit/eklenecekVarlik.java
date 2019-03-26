
package kayit;


public  abstract class   eklenecekVarlik {
    private String eklenecek_TamIsim;
    private int yas;
    private String eklenecek_Foto;
    private String nesnenin_Turu;
    
    public eklenecekVarlik(String eklenecek_TamIsim, int yas, String eklenecek_foto,String nesnenin_Turu) {
        this.eklenecek_TamIsim = eklenecek_TamIsim;
        this.yas = yas;
        this.eklenecek_Foto = eklenecek_foto;
        this.nesnenin_Turu=nesnenin_Turu;
    }

    public String getEklenecek_TamIsim() {
        return eklenecek_TamIsim;
    }

    public void setEklenecek_TamIsim(String eklenecek_TamIsim) {
        this.eklenecek_TamIsim = eklenecek_TamIsim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getEklenecek_Foto() {
        return eklenecek_Foto;
    }

    public void setEklenecek_Foto(String eklenecek_Foto) {
        this.eklenecek_Foto = eklenecek_Foto;
    }

    public String getNesnenin_Turu() {
        return nesnenin_Turu;
    }

    public void setNesnenin_Turu(String nesnenin_Turu) {
        this.nesnenin_Turu = nesnenin_Turu;
    }
    
  

    
}
