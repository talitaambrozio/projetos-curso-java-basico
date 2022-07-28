package com.mycompany.exerciciorepita;

import javax.swing.JOptionPane; //telas já prontas

public class ExercicioRepita {

    public static void main(String[] args) {
        int n, s = 0, par = 0, impar = 0, maiorCem = 0, cont = 0;
        float media;
        do{
           n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <i>O valor 0 interrompe o programa.</i></html>"));
            s += n;
            if(n % 2 == 0){
                par++;
            }else{
                impar++;
            }
            if(n >100){
                maiorCem++;
            }
            cont++;
        }while(n != 0);
        media = s/cont;
        JOptionPane.showMessageDialog(null,"Resultado final: \n" +  "Soma dos valores: " + s + 
                "\nNúmeros pares: " + par + "\nNúmeros ímpares: " + impar + "\nMaiores que 100: " + maiorCem + "\nMédia dos valores: " + media);
        
    }
}
