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
public class BukuDemo {
    
    //**
     * @param args the command line arguments
     */
    public static void main (String[]args) {
        //TODO code application logic here
        Buku buku1 = new Buku("Pemrograman Berbasis Web dengan Java","Indrajani" "Elexmedia Komputindo",2007);
        buku1.Cetakbuku();
        System.out.println("Judul : "+buku1.judul);
        System.out.println("Pengarang: "+buku1.pengarang);
        System.out.println("Penerbit"+ buku1.penerbit);
        System.out.println("Tahun" + buku1.tahun);
        
        Buku buku2 = new Buku("Dasar Pemrograman Java","Abdul Kadir","Andi Offset",2004);
        buku2.Cetakbuku();
        System.out.println("Judul:"+buku2.judul);
        System.out.println("Pengarang:"+buku2.pengarang);
        System.out.println("Penerbit: "+buku2.penerbit);
        System.out.println("Tahun: "+buku2.tahun);
        
    }
            
}
