/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev;

import java.util.Date;

/**
 *
 * @author bused
 */
public class KlimaKumandasi extends Kumanda {
    
    public int sicaklik=0;
    private Boolean cihazDurum =false;
    int PilSayisi=2;
    int TusSayisi=59;
    public Date UretimTarihi;
    
    @Override
    public String toString(){
        return this.UretimTarihi.toString();
    }

    public int getPilSayisi() {
        return PilSayisi;
    }

    public void setPilSayisi(int PilSayisi) {
        this.PilSayisi = PilSayisi;
    }

    public int getTusSayisi() {
        return TusSayisi;
    }

    public void setTusSayisi(int TusSayisi) {
        this.TusSayisi = TusSayisi;
    }

    public KlimaKumandasi() {
        this.UretimTarihi=new Date();
    }

    public KlimaKumandasi(Date uretimTarihi, int tusSayisi, int pilSayisi) {
        
        
    }
     public void Turnon(){
        cihazDurum=true;
    
    }
      public void Turnoff(){
        cihazDurum=false;
    }

    public int getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(int sicaklik) {
        this.sicaklik = sicaklik;
    }

 public void sicaklikUp(){
        if(cihazDurum && sicaklik>9&&sicaklik<44)
            sicaklik++;
      System.out.println("yeni ısı dereceniz: " + sicaklik);

}
  public void sicaklikDown(){
        if(cihazDurum && sicaklik>9&&sicaklik<44)
            sicaklik--;
        System.out.println("yeni ısı dereceniz: " + sicaklik);
    }
}