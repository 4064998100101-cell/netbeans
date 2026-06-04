
package com.mycompany.ejerciciodeprueba;

import java.util.Scanner;

public class Ejerciciodeprueba {

    public static void main(String[] args) {
      int N;  
      Scanner leer = new Scanner(System.in); 
      
      //Ingresamos el valor del rombo que necesitamos
      
      System.out.println("Ingrese un numero impar positivo");
      N= leer.nextInt(); 
      int lineasarriba=(40-N)/2;
      for (int j=0 ; j<lineasarriba;j++)
      {
          System.out.println("");
      }
      int a;
      int mitad=N/2;
      for (int i=0; i<N ;i++ )
      {
     
      // ahora buscaremos el numero de asteriscos

      int asteriscos;
      int espacios;
      if (i<=mitad)
      {
         asteriscos = 2 * i + 1;  
         espacios = mitad - i;    
      }
      else
      {

          asteriscos = 2 * (N - i) - 1; 
          espacios = i - mitad;         
              
      } 
      //ahora vamos a imprimir los espacios a la izquierda
      int e=(40-N)/2;
      for (int l=0; l<e;l++)
      {
      System.out.print(" ");
      }
      for (int k=0; k<espacios; k++)
      
      {
      System.out.print(" ");
      
      }
      
      //ahora vamos a imprimir nuestros asteriscos
      for(int p=0; p<asteriscos; p++)
      {
      
      System.out.print("*");
      
      
      }
      System.out.println();
      }
        
    }
}
