import java.io.*;

public class Programa2 {
    public static void Programa2(String args[]){
        Scanner input = new Scanner(System.in);
        String value = input.next();
        FileInputStream stream = new FileInputStream(value);
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);

        String ATyString = br.readLine();
        String CyString = br.readLine();
    
        int ATy = int.parseInt(ATyString);
        int Cy = int.parseInt(CyString);
    
        Elevador elevator = new Elevador(Cy, ATy);

        System.out.println("andar atual: " + elevator.getAA());
        System.out.println("total: " + elevator.getAT());
        System.out.println("capacidade: " + elevator.getC());
        System.out.println("numero de pessoas atual: " + elevator.getP());

  }

}

class Elevador {
  private int AA = 0;
  private int AT = 0;
  private int C;
  private int P;

  public void setAA(int andar) {
    AA = andar;
  }
  
  public int getAA() {
    return AA;
  }

  public void setP(int pessoas) {
    P = pessoas;
  }
  
  public int getP() {
    return P;
  }
  
  public int getAT() {
    return AT;
  }

  public int getC() {
    return C;
  }

  

  public Elevador(int cx, int ax){
    C = cx;
    AT = ax;
  }

  public boolean entra(){
    if(P < C) {
      P++;
      return true;
    } else {
      return false;
    }
  }

  public boolean sai(){
    if(P > 0) {
      P--;
      return true;
    } else {
      return false;
    }
  }

  public boolean sobe(){
    if(AA < AT){
      AA++;
      return true;
    }else {
      return false;
    }
  }

  public boolean desce() {
    if(AA > 0){
      AA--;
      return true;
    }else {
      return false;
    }
  }


}