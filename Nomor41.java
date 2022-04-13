/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor4.pkg1;

/**
 *
 * @author ASUS
 */
public class Nomor41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("DATA ARRAY: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

        System.out.println("ARRAY GENAP: ");
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ",");
            }
        }
        System.out.println("\n");

        System.out.println("ARRAY GANJIL");
        for (int j = 0; j < 10; j++) {
            if ((array[j] % 2 != 0)) {
                System.out.print(array[j] + ",");
            }

        }
    }

}
