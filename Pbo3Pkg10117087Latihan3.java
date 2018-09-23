/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117087.latihan3;

import java.util.Scanner;

/**
 *
 * @author
 * Nama              : Ahmad Maula
 * Kelas             : PBO3
 * NIM               : 10117087
 * Deskripsi Program : Memasukkan Nilai dari Keyboard
 */
public class Pbo3Pkg10117087Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
    }
    
}
