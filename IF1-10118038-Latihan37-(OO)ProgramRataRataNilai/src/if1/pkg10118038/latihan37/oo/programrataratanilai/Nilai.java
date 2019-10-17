/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan37.oo.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Program Rata Rata Nilai
 */
public class Nilai {
	private int mahasiswa;
	private double ratarata, nilai;
	
	public void inputNilai(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan Banyaknya Mahasiswa : ");
            mahasiswa = sc.nextInt();
            for (int i = 0; i < mahasiswa; i++ ) {
		System.out.print("Nilai Mahasiswa ke - " + (i+1) + " : ");
		nilai += sc.nextDouble();
		}
		
	}
	
	public void outputHasil() {
            ratarata = nilai / mahasiswa;
            System.out.println("Maka, Rata-rata Nilainya adalah " + ratarata);
            System.out.println("Developed by : Lingga Purnama Al Hamdi");
	} 
	
	
}
