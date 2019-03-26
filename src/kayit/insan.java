
package kayit;

public class insan extends eklenecekVarlik {
    
    private String uyruk;
    private String insan_Meslegi;
    private String e_mail;
    private String ev_Adresi;
    
    
    public insan (String isim,int yas,String foto,String uyruk,String insan_Meslegi,String e_mail,String ev_Adresi){
        super(isim, yas, foto,"insan");
        this.e_mail=e_mail;
        this.ev_Adresi=ev_Adresi;
        this.insan_Meslegi=insan_Meslegi;
        this.uyruk=uyruk;
        
    }

    public String getUyruk() {
        return uyruk;
    }

    public void setUyruk(String uyruk) {
        this.uyruk = uyruk;
    }

    public String getInsan_Meslegi() {
        return insan_Meslegi;
    }

    public void setInsan_Meslegi(String insan_Meslegi) {
        this.insan_Meslegi = insan_Meslegi;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getEv_Adresi() {
        return ev_Adresi;
    }

    public void setEv_Adresi(String ev_Adresi) {
        this.ev_Adresi = ev_Adresi;
    }

    
    
    

   
 
   
    
    
    
    
    
}
