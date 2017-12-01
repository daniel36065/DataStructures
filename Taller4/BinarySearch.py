#cadena=str(raw_input("ingrese los elementos separados por coma\n"))
def CargarArray(b=[],c=[]):
    for i in range (len(b)):
        c[i]=int(b[i])
        
def BinarySearch (a,x):
    lowerbound=0
    upperbound=len(a)-1
    index=-1
    while lowerbound<upperbound:
        middlepoint=((lowerbound+upperbound)/2)
        if x==a[middlepoint]:
            index=middlepoint
            break
        elif x < a[middlepoint]:
            upperbound=middlepoint-1
        else:
                lowerbound=middlepoint+1
                if lowerbound==upperbound and a[lowerbound]==x:
                    index=lowerbound
    print("el elemento se encuentra en la pocision ",index)
a=str(input("ingrese los  numeros separados por coma: \n"))
b=a.split(",")
c=b
CargarArray(b, c)
print("\nArreglo inicial\n",c)
x=int(input("\ningrese elelemento que desea buscar\n"))
print(BinarySearch (a,x))
