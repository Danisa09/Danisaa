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
public class GameEnemy {
     double width;
    double height ;
    int positionM;
    int positionN;
    
    //KONSTRUKTOR
    public GameEnemy (){
    }
    public GameEnemy (double width, double height){
    }
    public GameEnemy (double width, double height, int positionM, int positionN){
    }
    public void setDimension(double width, double heigt){
        this.width = width;
        this.height = height;
    }
    public void setPosition(int positionM, int positionN){
    this.positionM = positionM;
    this.positionN = positionN;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public int getM (){
        return this.positionM ;
    }
    public int getN (){
        return this.positionN ;
    }
    public void run(){
        System.out.println("player is running");
    }
    public void run ( int increment){
        positionM = positionM + increment ;
        System.out.println("Player still running... curent position of the player "+ positionM);
    }

    boolean getY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
            
}
