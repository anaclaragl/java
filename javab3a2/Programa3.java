import java.io.*;

public class Programa3{
    public static void Programa3(String args[]){
        Scanner input = new Scanner(System.in);
        String value = input.next();
        FileInputStream stream = new FileInputStream(value);
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        
        String plac = br.readLine();
        String model = br.readLine();
        String entradaString = br.readLine();
        String saidaString = br.readLine();

        LocalTime entrad = LocalTime.parse(entradaString);
        LocalTime said = LocalTime.parse(saidaString);

        Estacionamento estacionamento = new Estacionamento();

        estacionamento.set(plac, model, entrad, said);
        estacionamento.imprimir(0);
    }
    
    
    
}




//nao achei uma variavel que representasse horario, entao seria tudo por minutos, o horario inicial sendo 0.

class Estacionamento{
    private ArrayList<String> placa = new ArrayList();
    private ArrayList<String> modelo = new ArrayList();
    private ArrayList<int> entrada = new ArrayList();
    private ArrayList<int> saida = new ArrayList();
    private int horainicial = 0;

    public String getplaca(int p) {
        return placa.get(p);
    }
    
    public String getmodelo(int p) {
        return modelo.get(p);
    }
    
    public int getentrada(int p) {
        return entrada.get(p);
    }
    
    public int getsaida(int p) {
        return saida.get(p);
    }
    
    public void imprimir(int p) {
        System.out.println("placa: " + placa.get(p));
        System.out.println("modelo: " + modelo.get(p));
        System.out.println("entrada: " + entrada.get(p));
        System.out.println("saida: " + saida.get(p));
        System.out.println("valor: " + valorpago(p));
    }
    
    public double valorpago(int p) {
        int hora = (saida.get(p).getHour()) - horainicial;
        double valor = hora/60 * 1.5;

        return valor;
    }
}