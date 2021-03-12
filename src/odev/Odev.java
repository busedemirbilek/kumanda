/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev;

import java.util.Scanner;

/**
 *
 * @author bused
 */
public class Odev {

    private static final String marka="Firma: KGF";
           
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       TelevizyonKumandasi tk=new TelevizyonKumandasi();
       System.out.println(marka);
       System.out.println("tus sayisi:"+tk.TusSayisi);
       System.out.println("pil sayisi:"+tk.PilSayisi);
       System.out.println("üretim tarihi:"+tk.UretimTarihi);
       
       tk.Turnon();
       
       tk.setchanel(45);
       tk.Turnoff();
       tk.chanelDown();
       tk.chanelDown();
       tk.chanelDown();
       tk.setvolume(5);
       tk.volumeUp();
       System.out.println("kanal:"+ tk.chanel);
       System.out.println("ses:"+tk.volume);
       Scanner input = new Scanner(System.in);
        TelevizyonKumandasi tv2 = new TelevizyonKumandasi ();
      
       
       KlimaKumandasi kk=new KlimaKumandasi();
       System.out.println(marka);
       System.out.println("tus sayisi:"+kk.TusSayisi);
       System.out.println("tus sayisi:"+kk.PilSayisi);
       kk.Turnon();
       kk.setSicaklik(44);
       kk.sicaklikDown();
       kk.sicaklikDown();
       kk.sicaklikUp();
       kk.getTusSayisi();
       kk.getPilSayisi();
       System.out.println("sicaklik:"+ kk.sicaklik);
       System.out.println("üretim tarihi:"+tk.UretimTarihi);
       
      
       
       
    }}