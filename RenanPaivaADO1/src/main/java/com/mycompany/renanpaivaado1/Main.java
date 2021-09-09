
package com.mycompany.renanpaivaado1;

public class Main {
  
    public static void main(String[] args) {
        
        Raposa novoAnimail = new Raposa();
        System.out.println(novoAnimail.getCor());
        
        novoAnimail.informarVelocidade(50);
        
        System.out.println(String.valueOf(novoAnimail.getVelocidade()));
       
       
    }
    
}
