package com.aureliano.questao2;

/*@author Aureliano Amorim
 */
public class Questao2 {
    public static void main(String[] args) {
        String nome = "Aureliano Amorim de Oliveira";
        int i=0, cont = 0;
        
        
        System.out.println("Texto digitado: " + nome);

        
        char[] charArray = nome.toCharArray();
        for(char caracter : charArray){
            
            if(charArray[i] == 'a' || charArray[i] == 'A'){
                cont++;
            }
            i++;
        }
        
        if(cont > 0){
            System.out.printf("No texto digitado existe a letra 'A', ela existe " + cont + " vezes");
        }
        
        else{
            System.out.printf("Nao existe a letra 'A' no texto digitado.");
        }
        }
        
    }
