/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.Random;

/**
 *
 * @author dci
 */
public class MayorNumAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("el mayor de 5 numeros generados de manera aleatoria es " + mayorNum());
    }
    
    public static int mayorNum (){
        int numeros[] = new int [5];
        int mayor;
        int i;
        Random rand = new Random();
        

        for (i = 0 ; i < 5 ; i++){
        numeros[i] = rand.nextInt(100);
        }

        mayor = numeros[0];
        for (i = 0 ; i < 5 ; i++){
            if (mayor < numeros[i]){
                mayor = numeros[i];
            }
        }
        return mayor;
    }
}
