package game;

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
    public static void main (String [] args){
        herro.setDimension(12,12);
        herro.setPosition (10,220);
        System.out.println("position Player = "+herro.getM()+","+herro.getN());
        herro.run(12);
        System.out.println("position Player= "+herro.getM()+","+herro.getN());
        Object GamePlayer = null;

new GamePlayer();
        herro2.setDimension(12,32);
        herro2.setPosition(10,10);
        
        System.out.println("/");
        
        GameEnemy monster = new GameEnemy ();
        monster.setDimension(12,32);
        monster.setPosition(10,10);
        System.out.println ("position Enemy = "+monster.getM()+","+monster.getN());
        monster.run();
        
        System.out.println ("=============================================\n");
        GameEnvironment scane = new GameEnvironment ();
        GamePlayer herro = null;
        scane.addPlayer(herro);
        scane.addPlayer (herro);
        GamePlayer herro2 = null;
        scane.addPlayer(herro2);
        scane.getAllPlayer();
        scane.getAllPlayer(herro);
        scane.getAllPlayer();
        scane.getAllEnemy(monster);
        /*scane.getAllEnemy();*/
        scane.Interaction();
          
    }
}
