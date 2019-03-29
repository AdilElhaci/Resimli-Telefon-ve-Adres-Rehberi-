package kayit;

public  class bitki {
    
  
    private int yas;
    private double boyu;
    private String nesneTuru;
    private String renk; 

    public bitki(String isim, int yas, double boyu,String renk) {
      
        this.yas = yas;
        this.boyu = boyu;
        this.nesneTuru="bitki";
        this.renk=renk;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getBoyu() {
        return boyu;
    }

    public void setBoyu(double boyu) {
        this.boyu = boyu;
    }
    
    
}
