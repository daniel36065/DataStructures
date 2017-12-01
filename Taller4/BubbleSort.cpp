#include <iostream>
#include <conio.h>
#include <vector>
#include <cstdio>
using namespace std;
int a[]={20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
int limit = (sizeof(a)/sizeof(a[0]));//size of a array
void PrintArray(int array[]);
void Bubble (int array[]);
int main(){
	cout<<"BuubleSort\n"<<endl;
	cout<<"Initial Array"<<endl;
	PrintArray(a);//print "a" array
	Bubble (a);
	printf("\n\nArray Organized\n");
	PrintArray(a);//print "a" array
	getch();
	return 0;
}
void Bubble (int array[]){
	for(int i=0;i<limit -1;i++){
		bool swapped=false;
		for(int j=0;j<limit-1;j++){
			if(array[j] > array[j+1]){
				int swap=array[j];
				array[j]=array[j+1];
				array[j+1]=swap;
				swapped=true;
			}
		}
		if (swapped=false){
			break;
		}
	}
}
void PrintArray(int array[]){
	for (int i = 0; i < limit; i++){//go through the array
        cout<<"["<<a[i]<<"]";//print array
    }
}
