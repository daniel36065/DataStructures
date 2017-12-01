'''
Created on 13/11/2017

@author: danfe
'''
from pip._vendor.distlib.compat import raw_input
from random import randint
tam=int(raw_input("ingrese m\n"))
matriz=[]
vi=((tam-1)/2)
vf=vi+1
swi = True;
for i in range(tam) :
    matriz.append([0]*tam) 
for j in range(tam) :
    for k in range(tam) :
        matriz[j][k]=randint(1,9)
        
print ("\nmatriz obtenida")
for i in range(tam) :
    print (matriz[i],"\n")        
   
for i in range(tam):    
    for j in range(tam):  
        if  i > -1 and i < tam:
            if j < vi or vf< j :
                matriz[i][j] = 0
        else:
            matriz[i][j] = 0
    if  i>-1 and i<tam:
        if swi == True :
            if vi > -1 and vf< tam:
                vi-=1
                vf+=1
            else:
                swi = False;
                vi = 1;
                vf = tam-2;
        else:
            vi+=1
            vf-=1
print("\nelementos que pertenecen al rombo de la matriz")
for i in range(tam) :
    print (matriz[i],"\n") 
            
            
            
            
            
            