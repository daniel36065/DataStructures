#include <iostream>
#include <conio.h>
#include <vector>
using namespace std;
int a []={20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
int limit = (sizeof(a)/sizeof(a[0]));//size of array
int LinealSearch(int A[],int data);
void PrintArray(int array[]);
int main()
{
	cout<<"Initial Array"<<endl;
	PrintArray(a);
	int element=0;
	cout<<"\n\nEnter the value you want to search"<<endl;cin>>element;
	cout<<"\nthe element is in the position "<<LinealSearch(a,element)<<" of the array"<<endl;
	getch();
}
int LinealSearch(int A[],int data)
{
	int index=-1;
	//compare with all elements of the array
	for(int i=0;i<limit;i++)
	{
		if(A[i]==data)
		{
			//if the item matches the item that is being searched the result becomes the index of this
			index=i;
			break;
		}		
	}
	//return the index with contains the element
	return index;
}
void PrintArray(int array[]){
	for (int i = 0; i < limit; i++){//go through the array
        cout<<"["<<a[i]<<"]";//print array
    }
}
