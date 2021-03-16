/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek.pkg1;

/**
 *
 * @author ASUS
 */
public class matematika {
    int tambah = 0;
        int kurang = 0;
        int kali = 0;
        int bagi = 0;
    void pertambahan (int a, int b) {
        tambah = a+b;
        System.out.println("Pertambahan : "+a+"+"+b+"="+tambah);
    }
    void pengurangan (int a, int b) {
        kurang = a-b ;
        System.out.println("Pengurangan : "+a+"-"+b+"="+kurang);
    }
    void perkalian (int a, int b) {
        kali = a*b ;
        System.out.println("perkalian : "+a+"x"+b+"="+kali);
    }
    void pembagian (int a, int b){
        bagi = a/b ;
        System.out.println("pembagian : "+a+"/"+b+"="+bagi) ;   
    }
    
}
