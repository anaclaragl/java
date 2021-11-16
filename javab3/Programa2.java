package javab3;

import java.io.*;

public class Programa2{

	public static void main(String args[]) throws IOException {
        FileInputStream stream = new FileInputStream("C:\\Users\\Fábio\\Desktop\\cefet 2021\\javab3\\p2.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader read = new BufferedReader(reader);
        String var = read.readLine();
        
        //----------------------------
        
        String inputA = var;
        var = read.readLine();
        String [] inputA1 = inputA.split(" ");
        String [] input = new String[Integer.parseInt(input1Separado[1])];
        int u = -1;        
        while(var != null) {
        	u = u + 1;
            input[u] = var;
            var = read.readLine();
        }
        
        int [] vend = new int [Integer.parseInt(inputA1[0])];
        int [] totalvend = new int [Integer.parseInt(inputA1[0])];
        int fina = 1;
        for(int i = 0; i < vend.length; i++) {
        	vend[i] = Integer.parseInt(input[i]);
        	input[i] = "0";
        }
        
        while(fina == 1) {
        	fina = 0;
        	for(int i = 0; i < vend.length; i++) {
            	vend[i] = vend[i]-1;
            	if(vend[i] == 0) {
            		totalvend[i] = totalvend[i] + 1;
            	}
            }
            for(int i = 0; i < vend.length; i++) {
            	for(int o = 0; o < input.length; o++) {
            		if(vend[i] == 0 && Integer.parseInt(input[o])!=0) {
            			vend[i] = Integer.parseInt(input[o]);
            			input[o] = "0";
            		}
            	}
            }
            for(int i = 0; i < vend.length; i++) {
            	if(vend[i]>0) {
            		fina = fina + 1;
            	}
            }
        }
        for(int i = 0; i < vend.length; i++) {
        	System.out.println(i + 1 + totalvend[i]);
        }
        read.close();
	}
}