/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.modul4;

/**
 *
 * @author Lenovo
 */
public class no1 {
        public static void A_insertion(int[] A) {
        for (int i = 1; i < A.length; i++) { //1<5
            int key = A[i]; //7
            int j = i - 1; //0
            while ((j>=0) && (A[j] > key)) { //0>=0 T && 25>7
                A[j+1] = A[j]; //a[1] = 25
                j--; //0--
            }
            A[j+1] = key; //A[1] = 7
        }
    }
    
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
            
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] a = {25,7,9,13,3};
        no1.tampil(a);
        no1.A_insertion(a);
        no1.tampil(a);
        
        
        System.out.println();
        System.out.println("    Muhammad Rizqi");
        System.out.println("** Terimakasih **");
    }
}

