/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Nomor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        System.out.println(a+", "+b);
        if(a>b){
            System.out.println(a);
        }else if(b>a){
            System.out.println(b);
        }else{
            System.out.println("Error");
        }
        
    }
    
}
