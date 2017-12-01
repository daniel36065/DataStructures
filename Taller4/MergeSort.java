package Taller4;

import java.io.*;
public class MergeSort {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	static int []array;
	public static void main(String[] args) throws IOException {
		ChargeArray();
		bw.write("\nInitial Array\n");
		PrintArray(array);
		bw.write("\n\nArray Organized\n");
		array=MergeSort(array);
		PrintArray(array);
	}
	public static int[] MergeSort(int[]a){
		int Izq,Der;
		int b=0,j=0,k=0;
		Izq=a.length/2;
		Der=a.length-Izq;
		int aizq[]=new int[Izq];
		int ader[]=new int [Der];
		if (a.length==1){
			return a;
		}else{
			for(int i=0;i<Izq;i++){
				aizq[i]=a[i];
			}
			for(int i=Izq;i<Izq+Der;i++){
				ader[i-Izq]=a[i];
			}
			aizq=MergeSort(aizq);
			ader=MergeSort(ader);
			while(aizq.length != j && ader.length !=k){
				if(aizq[j]<ader[k]){
					a[b]=aizq[j];
					b++;
					j++;
				}else{
					a[b]=ader[k];
					b++;
					k++;
				}
			}
			while(aizq.length != j ){
				a[b]=aizq[j];
				b++;
				j++;
			}
			while(ader.length != k ){
				a[b]=ader[k];
				b++;
				k++;
			}
		}
		return a;
	}
	public static void PrintArray(int array[]) throws IOException{
        for (int i = 0; i < array.length; i++) {
            bw.write("[" + array[i] + "]");
            bw.flush();
        }
	}
	public static void ChargeArray() throws IOException{
		bw.write("Enter the values ​​separated by comma\n");
		bw.flush();
		String l=br.readLine();//the string is stored with commas
		String [] cad=l.split(",");//in a new string the elements are stored without the commas
		array=new int [cad.length];/*an array of integer type is created
		with the same size of the array that only contains the characters, but not the commas*/
        for (int i = 0; i < cad.length; i++){
            array[i]=Integer.parseInt(cad[i]);/*the elements of the "o" array are passed 
            to the int array, converting string to int*/
        }
	}
}