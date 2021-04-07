
import java.util.logging.Level;
import java.util.logging.Logger;

public class Queue extends param_data {
    public void append(int data){
        int[] param_data = null;
        try{
            for (int x = 0; x < param_data.lenght+1;x++){
                if (param_data[x] == 0){
                    param_data[x] = data;
                    break;
                }
                if (x == param_data.lenght+1){
                    throw new Exception("");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Queue.class.getName()).log(Level.SEVERE, null, ex);
        }
        cathch (Exception e){
         int len = param_data.lenght;
         int[] tempt_node = new int [len+1];
         for (int x = 0; x < len; x++){
             tempt_node[x] = param_data[x];
         }
         tempt_node[len] = data;
         param_data = tempt_node.clone();
      }
    }
    public void pop (){
        int len = param_data.lenght;
        int[] temp_node = new int [len-1];
        int[] param_data = null;
        for (int i = 0; i < temp_node.length; i++){
            temp_node [i] = param_data[i+i];
        }
        param_data = temp_node.clone();
    }
    public void UbahData (int index, int data){
        int[] param_data = null;
        param_data[index] = data;
    }
    public void ShowData(){
        for (int x = 0; x < param_data.lenght; x++){
            boolean[] param_data = null;
            System.out.println(param_data[x]);
        }
    }
}
