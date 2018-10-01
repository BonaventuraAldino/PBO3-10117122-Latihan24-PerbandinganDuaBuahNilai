/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;
/**
 *
 * @author lenovo
 * 
 * NAMA  : BONAVENTURA ALDINO SENDA SENI
 * KELAS : PBO-3
 * NIM   : 10117122
 * Deskripsi Program : user memasukkan dua buah nilai, menampilkan hasil 
 *                     perbandingan nilai
 * 
 */
public class PBO310117122Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angka1, angka2;
        String masukData;
        Scanner input = new Scanner(System.in);
        System.out.println("=====PROGRAM PERBANDINGAN NILAI=====");
        
        do { 
            System.out.print("Masukkan Nilai Pertama = ");
            angka1 = input.nextInt();
            System.out.print("Masukkan Nilai Kedua   = ");
            angka2 = input.nextInt();
            if (angka1==angka2){
                System.out.println("Hasil : "+angka1+ " Sama Dengan " + angka2);
            }
            else if(angka1 > angka2){
                System.out.println("Hasil : "+angka1 + " Lebih Besar dari " 
                        + angka2);
        }
            else {
                System.out.println("Hasil : "+angka1 + " Lebih Kecil dari " 
                        + angka2);
            }  
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            masukData = input.next();
            if ("Ya".equals(masukData)) {
                angka1 = angka1;
            }
        }
        while (!(masukData.equals("Tidak")));
        System.out.println("(Developed by : Bonaventura Aldino Senda Seni)");
    }   
}
