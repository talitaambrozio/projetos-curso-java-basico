package com.mycompany.aula12estruturasrepeticoes;

import java.util.Scanner;

public class Aula12EstruturasRepeticoes {

    public static void main(String[] args) {
        int n, s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Digite um numero: ");
            n = teclado.nextInt();
            s += n;
            System.out.println("Deseja continuar? (S/N");
            resp = teclado.next();
        }while(resp.equals("S"));
        System.out.println("A soma de todos os valores é igual a " + s);
                
    }
}
