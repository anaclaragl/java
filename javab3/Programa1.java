package javab3;

import java.io.*;

public class Programa1 {
	
	public static void main(String args[]) throws IOException {
        FileInputStream stream = new FileInputStream("C:\\Users\\Fábio\\Desktop\\cefet 2021\\javab3\\p1.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader read = new BufferedReader(reader);
        String var = read.readLine();
        //----------------------------
        String [] input = new String[3];
        int u = 1;        
        while(var != null) {
        	u = u - 1;
            input[u] = var;
            var = read.readLine();
        }
        
        String [] tamanho = input[2].split(" ");
        int c1 = 0;
        int c2 = 0;
        for(int a=0; a < tamanho.length; a++) {
        	c1 += Integer.parseInt(tamanho[a]); 
        }
        
        c1 = c1/Integer.parseInt(input[0]);
        
        while(c1 > 0) {
        	for(int a=0; a < tamanho.length; a++) {
            	c2 += Integer.parseInt(tamanho[a])/c1;
        	}
        	if(c2 == Integer.parseInt(input[0])) {
        		System.out.println(c1);
        		break;
        	}
        	else {
        		c1 = c1 - 1;
        		c2 = 0;
        	}
        	read.close();
        };
    }
}