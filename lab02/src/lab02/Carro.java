
package lab02;

public class Carro {
    //atributos
    String fabricante;
    String rodas [] = {};
    String cor;
    String modelo;
    int velocidadeAtual;

    //mostrar status do objeto
    public void status(){
        System.out.println("");
        System.out.println("um carro " + this.cor);
        System.out.println("qual fabricante? " + this.fabricante);
        System.out.println("modelo de carro " + this.modelo);

    }
    
    //métodos
    public String getFabricante() {
        
        return fabricante;
        
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String[] getRodas() {
        return rodas;
    }

    public void setRodas(String[] rodas) {
        this.rodas = rodas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    
}
