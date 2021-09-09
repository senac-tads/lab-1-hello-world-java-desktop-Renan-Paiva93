
package com.mycompany.renanpaivaado1;


public class Raposa {
    //Atributos ( o quê construir)
    private String cor;
    private String sexo;
    private int peso;
    private String nome;
    private int comprimento;
    private int velocidade;
    
    
    //Criação construdor (como eu vou construir)
    public Raposa(String cor, String sexo, int peso, String nome) {
        this.cor = "laranja";
        this.sexo = "masculino";
        this.peso = 3;
        this.nome = "Rapasa";
    }

    public Raposa() {
        cor = "laranja";
    }
    
    
    //Ações - Métodos
    public void dormi (){
        this.velocidade = 50;
    }
    
    public void comer (){}
    
    public void correr (){}

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void informarVelocidade(int novoAnimal){
        this.velocidade = novoAnimal;
    }

    public void informarVelocidade() {
        
    }
   
    
    
    
    
    
}
