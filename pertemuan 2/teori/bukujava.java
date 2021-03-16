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
public class bukujava {
    // atribut
    string judul,pengarang,penerbit;
    int tahun;
    // konstruk
    public bukujava (string judul, String penerbit,String pengarang, int tahun){
        this.judul = judul;
        this.penerbit = penerbit ;
        this.pengarang = pengarang;
        this.tahun = tahun;
    }
    // method 
    public void Cetak buku (){
        System.out.prinln(judul+" . "+pengarang + " . "+penerbit + " . "+tahun);
    }
}
