/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class TransportasiDemo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil car = new Mobil();
        car.goStraight();
        car.turnLeft();
        car.turnLeft();
        
        System.out.println();
        
        System.out.println("---------------");
        
        Bicycle spd = new Bicycle ();
        spd.ringBell();
        spd.turnLeft();
        spd.turnLeft();
        
        System.out.println();
        
    }
    
}

