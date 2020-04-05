/* Faça um programa para ler a cotação do dolar, e depois um valor em dólares
* a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, 
* considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe
* CurrencyConverter para ser responsável pelos cálculos. 
*    What is the dollar price? 3.10
*    How many dollars will be bougth? 200.00
*    Amount to be paid in reais = 657.20
*/ 
package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

/**
 *
 * @author Andressa Silva
 */

public class Program{

    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please, enter the dollar price: $");
        double dolarPrice = sc.nextDouble();
        
        System.out.print("How many dollars will be bougth? $");
        double dolarQtd = sc.nextDouble();
        
        double c = CurrencyConverter.totalTax(dolarQtd);
        double d = CurrencyConverter.totalValue(dolarPrice, c);
        
        System.out.print("You will pay in reais: " + d);
        
        sc.close();
    
        
        
    }

}
