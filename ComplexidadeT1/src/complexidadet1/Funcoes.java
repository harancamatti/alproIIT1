package complexidadet1;

import java.util.ArrayList;



public class Funcoes {
    public static int fibo(int n){
        Contagem.add();
        if (n <= 1) return 1;
        return (fibo(n-1)+fibo(n-2));
    }
    
    public static int alg1(int n){
        int r=0;
        for (int i = 0; i <= n; i++) {
            r = r++;
            Contagem.add();
        }
        return r;
    }
    
    public static int alg2(int n){
        int r=0;
        for (int i = 0; i < n; i++) {
            Contagem.add();
            for (int j = i+1; j <= n; j++) {
                Contagem.add();
                r = r+2;                
            }   
        }
        return r;
    }
    public static int alg3(int n){
        int r=0;
        Contagem.add();
        for (int i = 0; i <= n; i++) {
            Contagem.add();
            for (int j = i; j <= 2*i; j++) {
                Contagem.add();
                for (int k = i; k <= j; k++) {
                    Contagem.add();
                    r = r++;
                }
                
            }
            
        }
        
        return r;
    }
    
    public static int alg4(int n){
        int r=0;
        for (int i = 0; i <= n; i++) {
            Contagem.add();
            for (int j = i; j < i+3; j++) {
                Contagem.add();
                for (int k = i; k < j; k++) {
                    Contagem.add();
                    r++;
                    
                }
                
            }
            
        }
        return r;
    }
    //chamada inicial alg5(n,1)
    public static int alg5(int n, int d){
        Contagem.add();
        if (n == 0) return d;
        return alg5(n-1, 1-d)+alg5(n-1,d);
    }
    //chama inicial alg6(n,1)
    public static int alg6(int n,int d){
        Contagem.add();
        if (n == 0) return d;
        return 2*alg6(n-1,1-d); 
    }
    
    public static int alg7(int n){
        int r=0,b=0;
        for (int i = 0; i <= n; i++) {
            Contagem.add();
            b = i;
            while(b>0){
                r = r+1;
                b = b/2;
            }                                   
        }
        return r;
    }
    //chamada inicial f8(s="", C={1, 2, 3,..., n}
    public static void alg8(String s, ArrayList<Integer> arr){
        if (arr.isEmpty()){
            System.out.println(s);
            return;
        }
        ArrayList<Integer> copy = new ArrayList(arr);
        int a = copy.remove(1);
        alg8(s, copy);
        alg8(s + "," + a, copy );
    }
}
