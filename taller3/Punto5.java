package Taller3;

import java.io.*;

public class Taller2_p5 {
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		bw.write("ingrese el tamaño de la matriz\n");//se solicita el tamaño de la matriz
		bw.flush();
		int tam= Integer.parseInt(br.readLine());//se pasa el tamaño de String a integer
		bw.write("ingrese los "+tam*tam+" elementos de la matriz separados por ,\n");
		// se piden los elementos de la matriz dependiendo del tamaño
		bw.flush();
		String l=br.readLine();
		String[] o = l.split(",");//se separan los elementos ingresados por coma (,)
		String[][] matriz=new String[tam][tam];//se crea la matriz con el tamaño ingresado
		String[][]matriz2=new String[tam][tam];
		cargarArray(matriz2);
		cargarMatriz(matriz,o);
		bw.write("\nMatriz inicial: ");
		bw.flush();
		imprimeMatriz(matriz);
		bw.write("\n");
		rombo(matriz,matriz2,tam);
		bw.write("\nElementos externos al rombo interno de la matriz: ");
		bw.flush();
		imprimeMatriz(matriz2);
	}
	public static void rombo (String [][] matriz,String[][]matriz2,int tam) throws IOException{
		int vi=((tam-1)/2),vf=vi+1;
		boolean swi=true;
		for(int i=0;i<tam;i++){
			for (int j = 0; j < tam; j++){
				if ( i > -1 && i < tam+1){
					if ( j < vi || vf< j ){
						matriz2[i][j] = matriz[i][j]; 
					}
				}else{
					matriz2[i][j] =matriz[i][j]; 
				}
			}
			if ( i>-1 && i<tam){
				if ( swi == true ){
					if (vi > -1 && vf< tam){
						vi--;
						vf++;
					}else{
						swi = false;
						vi = 1;
						vf = tam-2;
					}
				}else{
					vi++;
					vf--;
				}
			}
		}
	}
	public static void cargarMatriz(String[][] matriz,String []o) throws IOException{
		int i2=0;
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[i].length; j++){
					matriz[i][j]=o[i2];	
					// se asignan los valores del array a la matriz por orden de entrada
					i2++;
	        }
        } 
	}
	public static void imprimeMatriz(String matriz[][]) throws IOException{
        for (int fil = 0; fil < matriz.length; fil++){
            bw.write("\n");//salto entre filas de la matriz
            bw.flush();
            for (int col = 0; col < matriz[fil].length; col++){
                bw.write("[" + matriz[fil][col] + "]");// imprime matriz
                bw.flush();
            }
        }
    }
	public static void cargarArray(String array[][]){
        for (int fil = 0; fil < array.length; fil++){
            for (int col = 0; col < array[fil].length; col++){
                array[fil][col] = " ";
            }
        }
    }
}
