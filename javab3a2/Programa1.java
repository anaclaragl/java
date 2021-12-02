import java.io.*;
import java.text.ParseException;

public class Programa1
{
  public static void Programa1 (String[]args)
  {
    Scanner input = new Scanner (System.in);
    String value = input.next ();
    FileInputStream stream = new FileInputStream (value);
    InputStreamReader reader = new InputStreamReader (stream);
    BufferedReader br = new BufferedReader (reader);

    String nome = br.readLine ();
    String anoString = br.readLine ();
    String altString = br.readLine ();

    int anoX = int.parse (anoString);
    double alt = Double.parseDouble (altString);

    Pessoa pessoa = new Pessoa ();
      pessoa.setnome (nome);
      pessoa.setalt (alt);
      pessoa.setano (anoX);

      pessoa.imprimir ();

  }
}


class Pessoa {

	private String nome;
	private double alt;
	private int ano;

	public String getnome() {
		return nome;
	}
	public void setnome(String nomex) {
		this.nome = nomex;
	}
	public int getano() {
		return ano;
	}
	public void setano(int anoy) {
		this.ano = anoy;
	}
	public double getalt() {
		return alt;
	}
	public void setalt(double altx) {
		this.alt = altx;
	}
	
	public void imprimir(){
	    System.out.println(nome);
        System.out.println(alt);
        System.out.println(ano);
    }
    public int calcid(){
    int id = 2021 - ano;
    
    return id;
    }
}


