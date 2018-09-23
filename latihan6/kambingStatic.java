/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117087.latihan6;

/**
 *
 * @author  
 * Nama              : Ahmad Maula
 * Kelas             : PBO3
 * NIM               : 10117087
 * Deskripsi Program : implementasi pada dia class
 */
public class kambingStatic {
        
        // NAMA_KAMBING sebagai konstanta
        public static final String NAMA_KAMBING = "MIDUN";
        
        public static void main(String[] args){
            Mamalia.jumlahKambing = 485000;
            System.out.println(NAMA_KAMBING + "memiliki kambing sebanyak"
                    + Mamalia.jumlahKambing);
        }
}
