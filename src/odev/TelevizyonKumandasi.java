/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev;

import java.util.Date;
import java.util.List;

/**
 *
 * @author bused
 */
public class TelevizyonKumandasi extends Kumanda {

    Boolean cihazDurum =false;
    int chanel=0;
    int volume=0;
    int PilSayisi=4;
    int TusSayisi=100;
    public Date UretimTarihi;
    private List<TelevizyonKumandasi> kumanda;

    public TelevizyonKumandasi(int chanel,int volume,int PilSayisi,int TusSayisi) {
    }

    public TelevizyonKumandasi() {
        this.UretimTarihi=new Date();
    }
    @Override
    public String toString(){
        return this.UretimTarihi.toString();
    }
  

   

    public void setCihazDurum(Boolean cihazDurum) {
        this.cihazDurum = cihazDurum;
    }

    public void setChanel(int chanel) {
        this.chanel = chanel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setPilSayisi(int PilSayisi) {
        this.PilSayisi = PilSayisi;
    }

    public void setTusSayisi(int TusSayisi) {
        this.TusSayisi = TusSayisi;
    }

   
  
    
    public int getchanel() {
        return chanel;
    }

   
    public void setchanel(int nchanel) {
        chanel=nchanel;
    }

    public void setvolume(int nvolume) {
        volume = nvolume;
    }
    
    public void Turnon(){
        cihazDurum=true;
    
    }
    public void Turnoff(){
        cihazDurum=false;
    }
    public void chanelUp(){
        if(cihazDurum && chanel>0&&chanel<501)
        chanel++;
        System.out.println("yeni kanal numaranız: " + chanel);
        
        
    }
    
     public void volumeUp(){
        if(cihazDurum && volume>0&&volume<31)
            volume++;
    }
       public void chanelDown(){
        if(cihazDurum && chanel>0&&chanel<501)
            chanel--;
        System.out.println("yeni kanal numaranız: " + chanel);
    }
     public void volumeDown(){
        if(cihazDurum && volume>0&&volume<31)
            volume--;
    }
}
  
   

   