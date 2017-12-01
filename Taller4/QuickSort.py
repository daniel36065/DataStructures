'''
Created on 25/11/2017

@author: danfe
'''
a=""
b=[]
c=[]
def ChargeArray():
    a=str(input("Enter the values ​​separated by comma \n"))
    b=a.split(",")
    c=b
    for i in range (len(b)):
        c[i]=int(b[i])
    print("\nInitial Array\n",c)
def Quicksort(a,primero,ultimo):
    i=primero
    j=ultimo
    pivote = a[round(len(a)-1/2)]
    change=0
    while a[i]<pivote:
        i=i+1
        while a[j]>pivote :
            j=j-1
        if i<=j :
            change=a[i]
            a[i]=a[j]
            a[j]=change
            i=i+1
            j=j-1
    while i<=j:
        if primero<j :
            Quicksort(a,primero,j)
        if(ultimo>i):
            Quicksort(a,i,ultimo)
    print(a)
            
ChargeArray()
Quicksort(c,0,(len(c)-1))
