import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Programa2{
    public static void main(String args[]) throws IOException{
        System.out.println("pedido de arquivo");
        Scanner input = new Scanner(System.in);
        String value = input.next();
        FileInputStream stream = new FileInputStream(value);
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        
        String port = br.readLine();
        int porta = Integer.parseInt(port);
        
        Carro corollaBlindado = new Carro();
        corollaBlindado.setPortas(porta);
        corollaBlindado.setMarca("toyota");
        corollaBlindado.setModelo("sedan");
        corollaBlindado.setRodas(4);
        corollaBlindado.acelerar(8);
        corollaBlindado.frear(2);
        corollaBlindado.imprimirInformacoes();
  }
}


class Veiculo {
    private String marca;
    private int qtdRodas;
    private String modelo;
    private int velocidade = 0;

    public String getMarca() {
        return marca;
    }
    
    public int getRodas(){
        return qtdRodas;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public int getVelocidade(){
        return velocidade;
    }
    
    public void setMarca(string m){
        marca = m;
    }
    
    public void setModelo(string mo){
        modelo = mo;
    }
    
    public void setRodas(int r) {
        qtdRodas = r;
    }
    
    public void setVelocidade(int v) {
        velocidade = v;
    }

    public void imprimirInformacoes(){
        System.out.println("marca: "+marca);
        System.out.println("rodas: "+qtdRodas);
        System.out.println("modelo: "+modelo);
        System.out.println("velocidade: "+velocidade);
    }
    
    public void acelerar(int valor){
        velocidade += valor;
    }
    
    public void frear(int valor){
        velocidade -= valor;
    }
}

class Automovel extends Veiculo{
    private double potencialDoMotor;

    public double getPotencial(){
        return potencialDoMotor;
    }

    public void setPotencial(double p){
        potencialDoMotor = p;
    }

    public void imprimirInformacoes(){
        System.out.println("marca: "+getMarca());
        System.out.println("rodas: "+getRodas());
        System.out.println("modelo: "+getModelo());
        System.out.println("velocidade: "+getVelocidade());
        System.out.println("potencial do motor: "+potencialDoMotor);
    }
}

class Carro extends Automovel{
    private int qtdPortas;

    public int getPortas(){
        return qtdPortas;
    }

    public void setPortas(int po){
        qtdPortas = po;
    }

    public void imprimirInformacoes(){
        System.out.println("marca: "+getMarca());
        System.out.println("rodas: "+getRodas());
        System.out.println("modelo: "+getModelo());
        System.out.println("velocidade: "+getVelocidade());
        System.out.println("portas: "+qtdPortas);
    }
}

class Moto extends Automovel{
    private boolean partidaEletrica;

    public boolean getPartida(){
        return partidaEletrica;
    }

    public void setPartida(boolean pe){
        partidaEletrica = pe;
    }

    public void imprimirInformacoes(){
        System.out.println("marca: "+getMarca());
        System.out.println("rodas: "+getRodas());
        System.out.println("modelo: "+getModelo());
        System.out.println("velocidade: "+getVelocidade());
        System.out.println("partida eletrica: "+partidaEletrica);
    }
}

class Bicicleta extends Veiculo {
    private int numMarchas;
    private boolean bagageiro;

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int ma) {
        numMarchas = ma;
    }

    public boolean getBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(boolean b) {
        bagageiro = b;
    }
    
    public void imprimirInformacoes(){
        System.out.println("marca: "+getMarca());
        System.out.println("rodas: "+getRodas());
        System.out.println("modelo: "+getModelo());
        System.out.println("velocidade: "+getVelocidade());
        System.out.println("partida eletrica: "+partidaEletrica);
        System.out.println("marchas " + numMarchas);
        System.out.println("bagageiro " + bagageiro);
    }
}
