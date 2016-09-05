/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexidadet1;

/**
 *
 * @author Haran
 */
public class ComplexidadeT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       for (int i = 0; i < 20; i++) {
           Contagem.reset();
           Funcoes.fibo(i);
           System.out.printf("%d;%d;%d\n", i, Funcoes.fibo(i), Contagem.getCounter());
       }
    }
    
}
