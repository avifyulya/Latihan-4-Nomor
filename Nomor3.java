/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Nomor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        System.out.print("Faktorial dari penjumlahan "+angka+" adalah ");
        
        for (int i = 1; i <= angka; i++) {
            System.out.print(i += 1 );
        }
    }
}
