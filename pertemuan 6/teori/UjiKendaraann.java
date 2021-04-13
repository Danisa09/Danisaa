/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class UjiKendaraann {
    public static void kendaraannmelaju(Vehicle vehikel){
        vehikel.goStraight();
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bicycle sepeda = new bicycle();
        MotorVehiclee mtr = new MotorVehiclee();
        Vehicle vehikell = new Vehicle();
        car carr = new car();
        
        System.out.println("---------------");
        System.out.println(sepeda.speed);
        System.out.println(sepeda.color);
        sepeda.turnleft();
        sepeda.ringBell();
        
        System.out.println("---------------");
        
        System.out.println(mtr.speed);
        System.out.println(mtr.color);
        System.out.println(mtr.licencePlate);
        System.out.println(mtr.sizeofEngine);
        mtr.turnLeft();
        System.out.println(mtr.getLicencePlate());
        System.out.println(mtr.getSizeofEngine());
        
        System.out.println("---------------");
        
        vehikell.goStraight();
        vehikell.turnLeft();
        vehikell.turnLeft();
        
        System.out.println();
        
        System.out.println("---------------");
        
        carr.setSeatBelt(0);
        System.out.println("seatbelt: " + carr.getSeatBelt());
        carr.setSeatBelt(1);
        System.out.println("seatbelt: " + carr.getSeatBelt());
        
        System.out.println("---------------");
        
        System.out.println();
        kendaraannmelaju(new Vehicle());
        kendaraannmelaju(new bicycle());
        kendaraannmelaju(new MotorVehiclee());
        kendaraannmelaju(new car());
    }
}
