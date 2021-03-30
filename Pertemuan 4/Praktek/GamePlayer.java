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
class GamePlayer {
    double width;
    double heigt;
    int positionnM;
    int positionN;
    private double height;
    private double widht;
    private int positionM;
    
    //Konstruktor
    public GamePlayer(){
    }
    public GamePlayer (double width,double height){
    }
    public GamePlayer (double width, double height, int positionM, int positionN){
    }
    public void setDimension (double width, double height){
        this.width = width;
        this.height = height;
        
    }
    public void setPosition(int positionM, int positionN){
    this.positionM = positionM;
    this.positionN = positionN;
    }
    public double getWidth(){
        return this.widht;
    }
    public double getHeight(){
        return this.height;
    }
    public int getM (){
        return this.positionnM;
    }
    public int getN (){
        return this.positionN;
    }
    public void run (){
        System.out.println("Player is running");
    }
    public void Run (int increment){
        int positionnM = positionM + increment;
        System.out.println("Player still Running ... current position of the pleyer: "+positionM);
    }

    boolean getY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
