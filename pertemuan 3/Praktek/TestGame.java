package praktek.pkg3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class TestGame {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        gameObjek gamePlayer = new gameObjek ();
        gameObjek gameEnemy = new gameObjek();
            
        System.out.println("========MASUKKAN DATA========");
        
        System.out.println("========Game Player========");
        gamePlayer.setDimension ();
        gamePlayer.setPosition ();
        gamePlayer.run = "Player is Running..";
        System.out.println(""+gameEnemy.run);
        
        System.out.println("========Game Enemy========");
        gameEnemy.setDimension ();
        gameEnemy.setPosition ();
        gameEnemy.run = "Enemy is Running..";
        System.out.println(""+gameEnemy.run);
        
        System.out.println("\n======Data Yang Didapat======");
        
        System.out.println("Lebar (Game Player) : "+gamePlayer.width);
        System.out.println("Tinggi (Game Player) : "+gamePlayer.height);
        System.out.println("PosisiA (Game Player) : "+gamePlayer.positionA);
        System.out.println("posisiB (Game Player) : "+gamePlayer.positionB);
        System.out.print(""+gamePlayer.run);
        gamePlayer.incrementAfinish();
        
                
                    
    }
}
