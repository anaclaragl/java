package javab3;

import java.io.*;

public class Programa3 {
	
	public static void main(String args[]) throws IOException {
        FileInputStream stream = new FileInputStream("C:\\Users\\Fábio\\Desktop\\cefet 2021\\javab3\\p3.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader read = new BufferedReader(reader);
        String var = read.readLine();
        //-----------------------------        
        String [] input = new String[2];
        int u = -1;        
        while(var != null) {
        	u = u + 1;
            input[u] = var;
            var = read.readLine();
        }
        
        String[] inputA1 = input[0].split(" ");
        String[] inputB1 = input[1].split(" ");
        int [] inputA1 = new int [inputA1.length];
        int [] inputB1 = new int [inputB1.length];
        for(int i=0; i<inputA1.length; i++) {
        	inputA1[i] = Integer.parseInt(inputA1[i]);
        	inputB1[i] = Integer.parseInt(inputB1[i]);
        }
        int A = inputA1[0];
        int B = inputA1[1];
        int C = inputA1[2];
        int D = inputA1[3];
        
        int E = inputB1[0];
        int F = inputB1[1];
        int G = inputB1[2];
        int H = inputB1[3];
    
        if(A >= A && E <= C && F >= B && F <= D){
        	System.out.println("1");        	
        }else{
        	if(G >= A && G <= C&& H >= B && H <= D){        	
        		System.out.println("1");
        	}else{
        		System.out.println("0");
        	}
        }
        read.close();
	}
}