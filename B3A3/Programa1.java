import java.io.*;
import java.text.ParseException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Programa1 {

  public static void main(String args[]) throws IOException {

    System.out.println("pedido de arquivo");
    Scanner input = new Scanner(System.in);
    String value = input.next();
    FileInputStream stream = new FileInputStream(value);
    InputStreamReader reader = new InputStreamReader(stream);
    BufferedReader br = new BufferedReader(reader);
    
    String nome = reader.readLine();
    String nomePai = reader.readLine();
    String nomeMae = reader.readLine();
    String irmao = reader.readLine();
    String pai = reader.readLine();
    String mae = reader.readLine();
    String ante = reader.readLine();
    
    Pessoa pessoa = new Pessoa();
    pessoa.irmaos(irmao,pai,mae);
    pessoa.parentes(ante);
  }

}


public class Pessoa{
    
    public String nome;
    public String nomePai;
    public String nomeMae;
    
    public void setNome(String nome) {
        this.nome = nome;
        this.nomePai = null;
        this.nomeMae = null;
    }

    public void setPessoa(String nome, String nomePai, String nomeMae) {
        this.nome = nome;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
    }
    
    public String getNome() {
        return nome;
    }

    public String getPai() {
        return nomePai;
    }

    public String getMae() {
        return nomeMae;
    }
    
    public void irmaos(String irmaos, String pai, String mae){
        if(pai.equals(nomePai) && mae.equals (nomeMae)){
            System.out.println(""+irmaos+" e "+nome+" sao irmaos");
        }else{
            System.out.println(""+irmao+" e "+nome+" nao sao irmaos");
        }
        
    }
    
    public void parentes(String ante){
        if(ante.equals (nomePai)){
            System.out.println("pai de"+nome);
        }else if(ante.equals (nomeMae)){
            System.out.println("mae de"+nome);
        }else{
            System.out.println("nao sao parentes");
        }
    }

}