package kayit;

public  class bitki extends eklenecekVarlik{
    private String renk;
    private double boyu;
    private String kokusu;
    
    public bitki (String eklenecek_tamIsim, int yas, String eklenecek_foto,String renk,double boyu)
    {
        super(eklenecek_tamIsim, yas, eklenecek_foto, "bitki");
        this.boyu=boyu;
        this.renk=renk;        
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getBoyu() {
        return boyu;
    }

    public void setBoyu(double boyu) {
        this.boyu = boyu;
    }

    
}
