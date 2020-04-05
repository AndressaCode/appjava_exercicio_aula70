/* Faça um programa para ler a cotação do dolar, e depois um valor em dólares
* a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, 
* considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe
* CurrencyConverter para ser responsável pelos cálculos. 
*    What is the dollar price? 3.10
*    How many dollars will be bougth? 200.00
*    Amount to be paid in reais = 657.20
*/ 

package util;
/**
 *
 * @author Andressa Silva
 */
public class CurrencyConverter {
    
    public static double totalTax(double dolarQtd){
        double r = dolarQtd * 6/100; // imposto
        return r + dolarQtd; // imposto + o valor do dolar
    }
    
    public static double totalValue(double dolarPrice, double s){
        return s * dolarPrice; // preço do dolar * quantidade total de dollars que serão comprados
    }
    //totalValue * dolarPrice;
    
} // dolarQtd += 
// dolares que serão comprados + o valor do imposto
// entao o imposto 6/100 * qtdDolar
// posso chamar esses métodos na classe Program por serem estáticos, pois
// lá nenum objeto do tipo CurrencyCalculator foi instanciado.
// Esta classe aqui só é utilitária, ela não precisa "gerar" objetos.