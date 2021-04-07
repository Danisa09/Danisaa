/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Array_Stack_Queue {
    /**
     * @param args the command line argument
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println ("[Array List]");
        Array new_array = new ArrayList ();
        new_array.append (1);
        new_array.append (2);
        new_array.append (3);
        new_array.append (4);
        new_array.ShowData ();
        System.out.println("-");
        new_array.append (5);
        new_array.ShowData();
        System.out.println("-");
        new_array.pop ();
        new_array.ShowData();
        System.out.println("-");
        new_array.UbahData(0,7);
        new_array.ShowData();
        System.out.println("\n");
        
        System.out.println("[Stack]");
        Stack new_stack = new Stack ();
        new_stack.append(1);
        new_stack.append(2);
        new_stack.append(3);
        new_stack.append(4);
        new_stack.append(5);
        new_stack.ShowData();
        System.out.println("-");
        new_stack.append(6);
        new_stack.ShowData();
        System.out.println("-");
        new_stack.UbahData(0,0);
        new_stack.ShowData();
        System.out.println("\n");
        
        System.out.println("[Queue]");
        Queue new_Queue= new Queue ();
        new_Queue.append(1);
        new_Queue.append(2);
        new_Queue.append(3);
        new_Queue.append(4);
        new_Queue.append(5);
        new_Queue.ShowData();
        System.out.println("-");
        new_Queue.append(6);
        new_Queue.ShowData();
        System.out.println("-");
        new_Queue.UbahData(0,0);
        new_Queue.ShowData();
        System.out.println("\n");
        
        
    }
    
}
