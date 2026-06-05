package com.mycompany.ejemplo1_2clase4;
import java.util.Scanner;

public class Ejemplo1_2clase4 {

    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      int n;
      long numeropar=5;
      long numeroimpar=3; 

      //Realizar un programa que respete el patron seguido
      System.out.println("--------Programa de secuencia");
      System.out.println("Ingrese el valor n que desea encontrar");
      n=leer.nextInt();
      System.out.println("1 = "+numeroimpar);
      System.out.println("2 = "+numeropar);
      for (int i=3;i<=n;i++)
      
      {
      long nuevopar=0,nuevoimpar=0;
   
      if (i%2==0)  
      {
      nuevopar=numeropar*3;
      numeropar=nuevopar;
      System.out.println(i+" = "+nuevopar);
      }
      else{
      
      nuevoimpar=numeroimpar*2;
      
      numeroimpar=nuevoimpar;
      System.out.println(i+" = "+nuevoimpar);
      }
      
      }
      
    
    }
}
