package com.aureliano.target.Questao1;
import java.util.Scanner;
/*@author Aureliano Amorim */
public class Questao1 {
/*Questao 1 - Fibonacci */
    public static void main(String[] args) {
        
        int f1 = 0;
        int f2 = 1;
        int x = 0;
        int usuario;
        int conf = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        usuario = scan.nextInt();
        
        System.out.print(f1 + " ");
        System.out.print(f2 + " ");
        
        while (x<usuario) {
            
            x = f1 + f2;
            f1 = f2;
            f2 = x;
            
            System.out.print(x + " ");
                    
            if(usuario == x){
                conf = 1;
            }
        }
        if(conf == 1){
                System.out.println();
                System.out.println("O numero pertence a sequencia de Fibonacci");
            }
            else{
                System.out.println();
                System.out.println("O numero nao pertence a sequencia de Fibonacci");
            } 
    }
}
