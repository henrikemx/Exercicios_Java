/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

/**
 *
 * @author loiane
 */
public class Exer25 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("// == Lojas Tabajara == //");
        
        boolean sair = false;
        String continuarCompra;
        int qtdProdutos;
        double preco;
        double total;
        String output;
        double valorPago, troco;
        
        do {
            
            System.out.print("Deseja informar uma nova compra? S/N ");
            continuarCompra = scan.next();
            
            if (continuarCompra.equalsIgnoreCase("s")){
                
                output = "\n// == Lojas Tabajara == //\n";
                
                System.out.print("Digite a quantidade de produtos da compra: ");
                qtdProdutos = scan.nextInt();
                
                total = 0;
                
                for (int i=1; i<=qtdProdutos; i++){
                    System.out.print("Informe preço do produto " + i + ": R$ ");
                    preco = scan.nextDouble();
                    total += preco;
                    output += "Produto " + i + ": R$ " + preco + "\n";
                }
                
                output += "Total:     R$ " + total;
                
                System.out.print("\nTotal:  R$ " + total);
                
                System.out.print("\nEntre com o valor pago: R$ ");
                valorPago = scan.nextDouble();
                
                output += "\nDinheiro:  R$ " + valorPago + "\n";
                
                troco = valorPago - total;
                
                output += "Troco:     R$ " + troco + "\n";
                
                System.out.println(output);
                
            } else {
                sair = true;
            }
           
        }while(!sair);
    }
}
