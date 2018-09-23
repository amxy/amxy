/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117087.latihan4;

/**
 *
 * @author
 * Nama              : Ahmad Maula
 * Kelas             : PBO3
 * NIM               : 10117087
 * Deskripsi Program : kambing 
 */
public class Kambing {
    
    public void tambahKambing(){
    // Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);        
    }

    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
}
