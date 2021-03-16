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
public class TextTv {
	public static void main(String[] args){
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3); 

		System.out.println("TV1's Channel: " + tv1.Channel 
		+ ", volume level: " + tv1.VolumeLevel);
	}

}

class TV {
	int Channel;
	int VolumeLevel;
	boolean on = false;

	public TV(){}
	public void turnOn(){
		on = true;
	}
	public void setChannel(int newChannel){
		Channel = newChannel;
	}
	public void setVolume(int newVolumeLevel){
		VolumeLevel = newVolumeLevel; 
	}
}

