
package com.mycompany.vetor03;

import java.util.Arrays;

public class Vetor03 {

    public static void main(String[] args) {
        double v[] = {3.5, 2.75, 9.0, -4.5};
        Arrays.sort(v);
        for(double valor:v){//para cada valor de v coloque dentro de valor
            System.out.print(valor + " ");
        }
    }
}
