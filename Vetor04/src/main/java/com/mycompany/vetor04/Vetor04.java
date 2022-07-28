package com.mycompany.vetor04;

import java.util.Arrays;

public class Vetor04 {

    public static void main(String[] args) {
        int v[] = {3, 7, 6, 1, 9, 4, 2};
        //impressao do vetor:
        System.out.print("Vetor v: ");
        for(int i =0; i<v.length; i++){
            System.out.print( v[i] + " ");
        }
        int p = Arrays.binarySearch(v, 10);
        System.out.println("\nEncontrei o valor na posição " + p );
    }
}
