/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentadigitos;

// Importo el paquete java.util.* para poder utilizar la clase Scanner

import java.util.*;

/**
 *
 * @author Amarico
 */
public class CuentaDigitos {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    // Realiza un programa que nos diga cuántos dígitos tiene un número introducido
    //por teclado.
    
    // Creo una variable de tipo entero
    
    int numeroIntroducido;
    
    //Creo un objeto de la clase Scanner
    Scanner entrada = new Scanner (System.in);
    
    // Pido el número por teclado
    
    System.out.println("Introduzca un numero entero y te diré cuántas cifras tiene: ");
    
    numeroIntroducido = entrada.nextInt();
    
    // Comienzo el bucle
    
    if ((numeroIntroducido >=0) && (numeroIntroducido <10)){
      
      System.out.println("El número tiene una cifra");
      
    }else if ((numeroIntroducido >=10 ) && (numeroIntroducido < 100)){
      
      System.out.println("El número tiene dos cifras");
      
    }else if ((numeroIntroducido >=100 ) && (numeroIntroducido < 1000)){
      
      System.out.println("El número tiene tres cifras");
      
    }else if ((numeroIntroducido >=1000 ) && (numeroIntroducido < 10000)){
      
      System.out.println("El número tiene cuatro cifras");
      
    }else
      
      System.out.println("El número tiene 5 o más cifras ");
    
    
    
    
  }

}
