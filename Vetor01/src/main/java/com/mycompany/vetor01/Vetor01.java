
package com.mycompany.vetor01;

public class Vetor01 {

    public static void main(String[] args) {
        //int n[] = new int[4]; uma opção
        int n[] = {3,2,8,7,5,4}; //declaração de vetor
        System.out.println("Total de casas do vetor n: " + n.length);
        //length é um atributo de um vetor que é o seu tamanho
        
        //impressão na tela do vetor:
        System.out.print("Vetor n: {");
        for(int c =0; c<n.length; c++){//usando o length nessa estrutura de repetição, 
            //dessa forma ela funcionará para qualquer vetor, pois é genérica
            System.out.print( n[c] + " "); // n na posição c
        }
        System.out.print("}");
    }
}
