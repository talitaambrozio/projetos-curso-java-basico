package com.mycompany.tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = entradaTeclado.nextLine();
        System.out.println("Digite a nota do aluno: ");
        float nota = entradaTeclado.nextFloat();
        System.out.printf("A nota de %s e %.2f \n", nome, nota);
    }
}
