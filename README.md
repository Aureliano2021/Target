# Target
## Códigos para o desafio target

### Resposta 1 - Linguagem JAVA

package com.aureliano.target.Questao1;

import java.util.Scanner;

/*@author Aureliano Amorim */

public class Questao1 {

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

### Resposta 2

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
### Resposta 3

Resposta: 77

### Resposta 4

4 - a) 9; b) 128; c) 49; d) 100; e) 13; f) ?

### Resposta 5

Ligaria o interruptor 1 e o interruptor 2 e iria até um das salas que estão as lampadas. Se a sala que eu entrar estiver com a lampada desligada, encontrei o interruptor três, depois voltaria para a sala dos interruptores e desligaria o interruptor 2 e entraria em uma das salas das lampadas que eu não tinha entrado ainda. Se a lampada dessa sala estiver acessa, então é a lampada do interruptor 1 e a na outra sala que não entrei estaria a lampada do interruptor 2. Se a lampada da sala que eu entrei estiver apagada, então a lampada é do interruptor 2 e a outra sala que não entrei é do interruptor 1.

Caso a primeira sala que eu entrei estivesse com a lampada acessa, saberia que o interruptor 1 ou o interruptor 2 pertencia à aquela sala. Então entraria em uma outra sala com lampadas, se estivesse acessa, saberia que o interruptor 1 ou 2 pertencia aquela segunda sala, e na terceira sala pertencia o interruptor 3.
