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
public class No3 {
    public static void selectionSort(int[] A) {
        int smallIndex;
        int pass, j, n = A.length;
        int temp;
        
        //index of smallest element in the sublist
        for (pass = 0; pass < n - 1; pass++ ) {
            smallIndex = pass;
            for (j = pass + 1; j < n; j++) {
                if (A[j] < A[smallIndex]) {
                    smallIndex =j;
                }
            }
            //tukar nilai terkecil dengan array[pass]
            temp = A[pass];
            A[pass] = A[smallIndex];
            A[smallIndex] = temp;
        }
    }
    public static void tampil(int data[]) {
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int A[] = {25, 7, 9, 13, 3};
        No3.tampil(A);
        No3.selectionSort(A);
        No3.tampil(A);
        
    System.out.println(" ");
    System.out.println("Muhammad Rizqi");
    System.out.println("** Terimakasih **");
    }    
}
