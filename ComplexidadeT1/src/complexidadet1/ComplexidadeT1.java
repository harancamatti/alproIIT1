/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexidadet1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Haran
 */
public class ComplexidadeT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Fibonacci");
       for (int i = 0; i < 20; i++) {
           Contagem.reset();
           Funcoes.fibo(i);
           System.out.printf("%d;%d;%d\n", i, Funcoes.fibo(i), Contagem.getCounter());
       }
       
        System.out.println("------------------------------------------");
        System.out.println("Algoritmo 1");
        for (int i = 0; i < 20; i++) {
            Contagem.reset();
            Funcoes.alg1(i);
            System.out.printf("%d;%d;%d\n", i, Funcoes.alg1(i), Contagem.getCounter());
            
        }
        
        System.out.println("------------------------------------------");
        System.out.println("Algoritmo 2");
        for (int i = 0; i < 20; i++) {
            Contagem.reset();
            Funcoes.alg2(i);
            System.out.printf("%d;%d;%d\n", i, Funcoes.alg2(i), Contagem.getCounter());
            
        }
        System.out.println("------------------------------------------");
        System.out.println("Algoritmo 3");
        for (int i = 0; i < 20; i++) {
            Contagem.reset();
            Funcoes.alg3(i);
            System.out.printf("%d;%d;%d\n", i, Funcoes.alg3(i), Contagem.getCounter());
            
        }
        System.out.println("------------------------------------------");
        System.out.println("Algoritmo 4");
        for (int i = 0; i < 20; i++) {
            Contagem.reset();
            Funcoes.alg4(i);
            System.out.printf("%d;%d;%d\n", i, Funcoes.alg4(i), Contagem.getCounter());
            
        }
        System.out.println("------------------------------------------");
        System.out.println("Algoritmo 4");
        for (int i = 0; i < 20; i++) {
            Contagem.reset();
            Funcoes.alg4(i);
            System.out.printf("%d;%d;%d\n", i, Funcoes.alg4(i), Contagem.getCounter());
            
        }
        System.out.println("------------------------------------------");
        System.out.println("Algoritmo 5");
        for (int i = 0; i < 20; i++) {
            Contagem.reset();
            Funcoes.alg5(i,1);
            System.out.printf("%d;%d;%d\n", i, Funcoes.alg5(i,1), Contagem.getCounter());
            
        }
        System.out.println("------------------------------------------");
        System.out.println("Algoritmo 6");
        for (int i = 0; i < 20; i++) {
            Contagem.reset();
            Funcoes.alg6(i,1);
            System.out.printf("%d;%d;%d\n", i, Funcoes.alg6(i,1), Contagem.getCounter());
            
        }
        System.out.println("------------------------------------------");
        System.out.println("Algoritmo 7");
        for (int i = 0; i < 20; i++) {
            Contagem.reset();
            Funcoes.alg7(i);
            System.out.printf("%d;%d;%d\n", i, Funcoes.alg7(i), Contagem.getCounter());
            
        }
        System.out.println("------------------------------------------");
        System.out.println("Algoritmo 8");
        //criar array
        int[] ar = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        
        //criar arraylist e popular ele
        ArrayList<Integer> C = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C.add(ar[i]);
        }
        String s = "";
        for (int i = 0; i < 20; i++) {
            Contagem.reset();
            Funcoes.alg8(s, C);
            System.out.printf("%d;%d\n", i, Contagem.getCounter());
            
        }
    }
    
}
