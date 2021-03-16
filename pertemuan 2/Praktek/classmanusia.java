package praktek.pkg1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class classmanusia {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[]args) {
        //TODO code application logic here
        TV tv1 = new TV ();
        tv1.turnOn() ;
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TV tv2 = new TV ();
        tv2.turnOn();
        tv2.ChannelUp();
        tv2.ChannelUp();
        tv2.VolumeUp();
        
        
    System.out.println("tv1's Channel is" + tv1.Channel
    +"and Volum is Level is"+ tv1.VolumeLevel);
    
    System.out.println("tv2's Channel is"+ tv2.Channel
    +"and Volume is Level is" + tv2.VolumeLevel);
    
    manusia mns1 = new manusia("Danisa");
    System.out.println(mns1.namaSaya());
    TV tvku = new TV();
    mns1.beliTV(tvku);
    mns1.jualSemuaTV();
    }
}
