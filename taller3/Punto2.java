package Taller3;

import java.io.*;

public class Taller2_p2 {
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException 
	{
		String m="";
		bw.write("ingrese el tamaño de la matriz\n");//solicita tamaño de la matriz
		bw.flush();
		m=br.readLine();
		int [][] matriz=new int[Integer.parseInt(m)][Integer.parseInt(m)];
		//se le asigna el tamaño ingresadoa a la matriz
		cargarMatriz(matriz,0,100);
		imprimeMatriz(matriz);
		bw.write("\n\n");
		bw.flush();
		espiral(matriz,Integer.parseInt(m));
	}
	public static void espiral(int[][] matriz,int m) throws IOException
	{
		int inicial=0;
		int vfinal = m-1;
		int cont=0;
		while(cont < (m*m) )
		{
			for(int i=inicial;i<=vfinal;i++)//recorre fila de arriba
			{
				bw.write("");
				bw.flush();
				bw.write("["+matriz[inicial][i]+"]");
				bw.flush();
				cont++;
			}
			for(int i=inicial+1;i<=vfinal;i++)//recorre columna de la derecha
			{
				bw.write("["+matriz[i][vfinal]+"]");
				bw.flush();
				cont++;
			}
			for(int i=vfinal-1;i>inicial;i--)//recorre fila inferior
			{
				bw.write("["+matriz[vfinal][i]+"]");
				bw.flush();
				cont++;
			}
			for(int i=vfinal;i>inicial;i--)//recorre columna izquierda
			{
				bw.write("["+matriz[i][inicial]+"]");
				bw.flush();
				cont++;
			}
			
			inicial=inicial+1;//acumulador que aumenta para general la espiral
			vfinal=vfinal-1;
		}
	}
	public static void cargarMatriz(int matriz[][], int minRandom, int maxRandom) 
	{
        for (int fil = 0; fil < matriz.length; fil++) 
        {
            for (int col = 0; col < matriz[fil].length; col++) 
            {
                matriz[fil][col] = minRandom - ((int) Math.round((Math.random()) * (minRandom - maxRandom)));
                //llena la matriz con numeros pseudoaleatorios
            }
        }
    }
	public static void imprimeMatriz(int matriz[][]) throws IOException
	{
        for (int fil = 0; fil < matriz.length; fil++) 
        {
            bw.write("\n");
            bw.flush();
            for (int col = 0; col < matriz[fil].length; col++) 
            {
                bw.write("[" + matriz[fil][col] + "]");//imprime la matriz
                bw.flush();
            }
        }
    }
}
