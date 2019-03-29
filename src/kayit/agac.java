
package kayit;


public class agac extends bitki{
    
    private String agacin_Adi;
    private String agacin_Yeri;
    private String agacin_Durumu;
    private boolean verimli;
    
    
    public agac (String isim, int yas, double boyu,String renk ,String agacinCesidi,boolean verimli,String agacinYeri,String agacin_Durumu)
    {
        super(isim, yas, boyu,renk);
        this.agacin_Adi=agacinCesidi;
        this.agacin_Yeri=agacinYeri;
        this.agacin_Durumu=agacin_Durumu;
        this.verimli=verimli;
    }

    public String getAgacin_Adi() {
        return agacin_Adi;
    }

    public void setAgacin_Adi(String agacin_Adi) {
        this.agacin_Adi = agacin_Adi;
    }

    public String getAgacin_Yeri() {
        return agacin_Yeri;
    }

    public void setAgacin_Yeri(String agacin_Yeri) {
        this.agacin_Yeri = agacin_Yeri;
    }

    public String getAgacin_Durumu() {
        return agacin_Durumu;
    }

    public void setAgacin_Durumu(String agacin_Durumu) {
        this.agacin_Durumu = agacin_Durumu;
    }

    public boolean isVerimli() {
        return verimli;
    }

    public void setVerimli(boolean verimli) {
        this.verimli = verimli;
    }

   

    
    
}
