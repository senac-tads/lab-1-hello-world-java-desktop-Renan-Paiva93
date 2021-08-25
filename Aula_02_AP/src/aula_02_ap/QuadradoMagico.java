
package aula_02_ap;


public class QuadradoMagico {
    public static boolean ehQuadroMagico (int [][] matriz){
        int soma = 0;
        int soma2 = 0;
        //somar elementos da primeira linha
        for (int j = 0; j < matriz.length; j++) {
           soma = soma + matriz[0][j]; 
        }
        // somar as demais linhas
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0 ; j < matriz.length[i]; j++) {
                soma2 = soma2 + matriz.length[i][j];
            }
        }
    }
    
    
    public static void main(String[] args) {
        
    }
    
}
