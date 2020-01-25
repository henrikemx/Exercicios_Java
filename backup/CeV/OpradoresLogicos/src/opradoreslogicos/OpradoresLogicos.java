/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opradoreslogicos;

/**
 *
 * @author henrique
 */
public class OpradoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Operadores lógicos
        // && <=> .E. => exemplo: true && false retorna false
        // || <=> .OU. => exemplo: false || true retorna true
        // ^ <=> .XOU. => exemplo: true ^ true retorna false
        // ! <=> .NAO. => exemplo: !false retorna true
        
        int x, y, z;
        boolean r1, r2, r3, r4, r5, r6, r7;
        x = 4;
        y = 7;
        z = 12;
        r1 = (x < y && y < z) ? true:false;
        System.out.println("O resultado da equação '(x < y && y < z)' é: " + r1);
        r2 = (x < y && y == z) ? true:false;
        System.out.println("O resultado da equação '(x < y && y == z)' é: " + r2);
        r3 = (x == y && y < z) ? true:false;
        System.out.println("O resultado da equação '(x == y && y < z)' é: " + r3);
        r4 = (x == y && y == z) ? true:false;
        System.out.println("O resultado da equação '(x == y && y == z)' é: " + r4);
        r5 = (x < y || y == z) ? true:false;
        System.out.println("O resultado da equação '(x < y || y == z)' é: " + r5);
        r6 = (x < y ^ y == z) ? true:false;
        System.out.println("O resultado da equação '(x < y ^ y == z)' é: " + r6);
        r7 = (x < y ^ y < z) ? true:false;
        System.out.println("O resultado da equação '(x < y ^ y < z)' é: " + r7);
    }
    
}
