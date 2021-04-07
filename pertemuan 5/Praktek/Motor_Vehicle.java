/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Motor_Vehicle {
    int sizeofEngine = 1 ;
    String licencePlate ="H 1 IDN"
    private int sizeoEngine;
            
    public Motor_Vehicle (){
    }
    public Motor_Vehicle (int sizeofEngine, String licensePlate){
        this.sizeoEngine = sizeofEngine;
        this.licencePlate = licencePlate;
    }
    public int getSizeofEngine (){
        return this.sizeofEngine;
    }
    public String getLicencePlate(){
        return this.licencePlate;
    }
}
