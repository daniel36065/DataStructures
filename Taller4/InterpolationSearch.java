package Taller4;

import java.io.*;

public class InterpolationSearch {
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static int a[];
	public static void main(String[] args) throws NumberFormatException, IOException{
		ChargeArray();//metodo que pasa de string a int y los carga en un arreglo
		bw.write("\nInitial Array\n");//print the first array
		PrintArray(a);
		bw.write("\n\ningrese el valor que desa buscar\n");
		bw.flush();
		int b=Integer.parseInt(br.readLine());//convert de string to int
		bw.write("\nthe element is in the position "+Interpolation(a,b)+" of the array");
		bw.flush();
	}
	public static int Interpolation(int[] a,int x){
		//metodo que encuentra un elemento dentro de un arreglo
		int lowerbound=0;
		int upperbound=a.length-1;
		int index=-1;
		int higherbound=a.length-1;
		int middlepoint=0;
		while (lowerbound<upperbound){
			middlepoint=lowerbound+((higherbound-lowerbound)/(a[higherbound]-a[lowerbound]))*(x-a[lowerbound]);
			if(x==a[middlepoint]){
				index=middlepoint;
				break;
			}else{
				if(x<a[middlepoint]){
					upperbound=middlepoint-1;
				}else{
					lowerbound=middlepoint+1;
				}
			}
		}
		if (lowerbound==upperbound && a[lowerbound]==x){
			index=lowerbound;
		}
		return index;
	}
	public static void PrintArray(int a[]) throws IOException{
		//metodo que imprime arreglo
        for (int i = 0; i < a.length; i++){
            bw.write("["+a[i]+"]");
            bw.flush();
        }
    }
	public static void ChargeArray() throws IOException{
		bw.write("Enter the values ​​separated by comma (,)\n");
		bw.flush();
		String l=br.readLine();//the string is stored with commas
		String [] cad=l.split(",");//in a new string the elements are stored without the commas
		a=new int [cad.length];/*an array of integer type is created
		with the same size of the array that only contains the characters, but not the commas*/
        for (int i = 0; i < cad.length; i++){
            a[i]=Integer.parseInt(cad[i]);/*the elements of the "o" array are passed 
            to the int array, converting string to int*/
        }
	}
}
