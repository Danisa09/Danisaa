/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
class car {
     boolean seatbelt = false;
    
    public car (){
    }

    car() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    car() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    car() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setSeatBelt (int seatbelt){
        if(seatbelt == 1){
            this.seatbelt = true;
        }else if(seatbelt == 0){
            this.seatbelt = false;
        }
    }
    boolean getSeatBelt(){
        return this.seatbelt;
    }
}
