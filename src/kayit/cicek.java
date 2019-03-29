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
public class cicek extends bitki{
    
    private String cicegin_Kokusu;
    

    public cicek(String isim, int yas, double boyu, String renk) {
        super(isim, yas, boyu, renk);
    }

    public String getCicegin_Kokusu() {
        return cicegin_Kokusu;
    }

    public void setCicegin_Kokusu(String cicegin_Kokusu) {
        this.cicegin_Kokusu = cicegin_Kokusu;
    }
    
}
