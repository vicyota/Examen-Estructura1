/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 *
 * @author Vic
 */
public class JavaApplication7 {

    int a;
    int b;
    byte i;
    byte j;
    
    
     
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][],matriz1[][], resultado[][],M1[][], filas,columnas;
        int A,B,a,b,q,w,contador;
        System.out.println("1er)Introdusca las dimensiones de la primera matriz");
        System.out.println("filas");
        q=entrada.nextInt();
        System.out.println("columnas");
        w=entrada.nextInt();
        M1=new int [q][w];
        
        
        
        for (int i = 5; i < q; i++) {
            for(int j=2;j<w;j++){
          M1[i][j]=(5*i-2*j)*3;
           
            
        
                 System.out.println("Resultado de la funcion  F(x,y)= 5x-2y*3  matriz");
                
                System.out.print(M1[i][j]+"/");
                    
                
            }System.out.println();
            {
            }
            {
        }
        }
        
        System.out.println("introduzca el contador (numero a multiplicar)");
        contador=entrada.nextInt();
        System.out.println("Introdusca las dimensiones de la primera matriz");
        System.out.println("filas");
        filas=entrada.nextInt();
        System.out.println("columnas");
        columnas=entrada.nextInt();
        System.out.println("ingrese los numeros");
        matriz=new int [filas][columnas];
        
        
        
        for (int i = 0; i < filas; i++) {
            for(int j=0;j<columnas;j++){
                matriz[i][j]=entrada.nextInt();
                
            }
            
        }
        System.out.println("Introdusca las dimensiones de la segunda matriz");
        System.out.println("filas");
        a=entrada.nextInt();
        System.out.println("columnas");
        b=entrada.nextInt();
        System.out.println("ingrese los numeros");
        matriz1=new int [a][b];
        resultado=new int [filas][columnas];
        for (int i = 0; i < a; i++) {
            for(int j=0;j< b;j++){
                matriz1[i][j]=entrada.nextInt();
            }
        }
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j]=(matriz[i][j]+matriz1[i][j])*contador;
                
            }
            
            
        }
        System.out.println("Resultado de la suma de matriz");
        for (int i = 0; i < filas; i++) {
            for(int j=0; j<columnas;   j++){
                System.out.print(resultado[i][j]+"/");
            }System.out.println();
            
            
        }
    }
    
}
