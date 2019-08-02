/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.testrepo;

import java.util.Random;
import java

/**
 *
 * @author informatica
 */
public class Juego {
    
    public static void main(string[]args){
        
        int numero;
        int numeroALetorio;
        Scanner teclado = new Random();
        
    }
        
    
            
       
    {  System.out.println("dame un numero de 1 al 20");
        Scanner teclado = new Scanner(System.in);
        int numero = Integer.parseInt(teclado.nextLine());
        
        Random r = new Random();
        int numeroAletorio = r.nextInt(20)+1;
        
        if(numero == numeroAletorio){
            System.out.println("GANASTE con el " +numero);
            
        }else {
            System.out.println("PAilas el numero correcto era "+ numeroAletorio);
            
      }while (numero !=numeroAletorio);
      
      System.out.println("Gnaste despues de " +contador+ "intentos");

        

        
                
    
        
    
    
        
     
                
                
                
                
               
             
                
    }
}
