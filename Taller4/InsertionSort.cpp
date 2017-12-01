#include <iostream>
#include <conio.h>
using namespace std;
void Insertion (int array []);
void PrintArray(int array[]);
int a [] ={20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
int limit = (sizeof(a)/sizeof(a[0]));//size of a array
int main()
{
	cout<<"Insertion Sort\n"<<endl;
	cout<<"Initial Array"<<endl;
	PrintArray(a);//print "a" array
	cout<<"\n\nArray Organized\n";
	Insertion(a);//order the "a" array
	PrintArray(a);//print organized "a" array
	getch();
	return 0;
}
void Insertion (int array [])
{
	//method with order array type int
	int swap,i,j,k;
	for(i=1; i<limit; i++)
	{
		swap=array[i];//store the value for the swap
		for(j=i-1; j>=0; j--)
			if(array[i]>array[j])
				break;
			
		for(k=i; k>j+1; k--)
			array[k]=array[k-1];
			
		array[j+1]=swap;//make the swap
	}		
}
void PrintArray(int array[]){
	for (int i = 0; i < limit; i++){//go through the array
        cout<<"["<<a[i]<<"]";//print array
    }
}
