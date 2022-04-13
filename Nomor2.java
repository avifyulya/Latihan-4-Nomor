/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Nomor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        if(a %2==0){
            System.out.println(a);
            System.out.println("Genap");    
    }else{
            System.out.println(a);
            System.out.println("Ganjil");
        }
        if(b %2==0){
            System.out.println(b);
            System.out.println("Genap");    
    }else{
            System.out.println(b);
            System.out.println("Ganjil");
        }
    }
    
}
