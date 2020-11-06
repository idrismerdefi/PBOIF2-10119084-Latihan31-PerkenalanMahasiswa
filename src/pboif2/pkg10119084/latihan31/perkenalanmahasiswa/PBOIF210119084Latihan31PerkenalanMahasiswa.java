/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan31.perkenalanmahasiswa;
/**
 * @author  
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program untuk menampilkan perkenalan mahasiswa
 **/
public class PBOIF210119084Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa ();
        
        mhs.nim = "10119085";
        mhs.nama = "Udin zainul";
        
        mhs.perkenalkanDiri();
        
        mhs.nim = "10119054";
        mhs.nama = "Sulaiman ibrahim";
        
        mhs.perkenalkanDiri();
        
        mhs.nim = "10119034";
        mhs.nama = "Fahma";
        
        mhs.perkenalkanDiri();
        
        mhs.nim = "10119014";
        mhs.nama = "idris ibrahim";
        
        mhs.perkenalkanDiri();
        
        System.out.println("Developed by : Muhammad Idris Merdefi");
        
    }
    
}
