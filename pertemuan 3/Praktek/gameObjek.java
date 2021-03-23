package praktek.pkg3;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class gameObjek {
    double widht, height ;
    int positionA, positionB, incrementA, finish;
    String run;
    
    Scanner get = new Scanner(System.in);
    String width;
    
    
   void setDimension(){
       System.out.print("Masukkan Lebar  : ");
       double width = get.nextDouble();
       System.out.print("Masukkan Tinggi : ");
       height = get.nextDouble();
   }
   void setPosition(){
       System.out.print("Masukkan PosisiA  :  ");
       positionA = get.nextInt();
       System.out.print("Masukkan PosisiB  :  ");
       positionB = get.nextInt();
       System.out.print("Masukkan IncrementA  : ");
       incrementA = get.nextInt() ;
       
               
   }

    void incrementAfinish() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
