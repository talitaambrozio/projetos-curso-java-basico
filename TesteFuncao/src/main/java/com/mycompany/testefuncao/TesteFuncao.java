
package com.mycompany.testefuncao;

public class TesteFuncao {

    static int soma(int a, int b){
        int s = a+b;
        return s;
        
    }
    public static void main(String[] args) {
        int sm = soma(5,2);
        System.out.println("A soma é igual a " + sm);
    }
}