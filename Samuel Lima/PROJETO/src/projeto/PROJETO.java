/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author henrique
 */
import java.util.Scanner;
import static javafx.scene.input.KeyCode.J;

public class PROJETO {
     public static int  tam  = 20;
    public static void main ( String args [ ] ) {
         J jht = new J ( );
         jht.textbackground ( jht.WHITE );
         jht.Moldura ( ( short ) 1, ( short ) 24, ( short ) 2, ( short ) 78 );
         jht.title ( " " );
         String conv = "";
         char [ ] str = new char [ tam ];
         char [ ] pal = new char [ tam ];
         int a = 0, c, i, j, lenv;
         jht.textcolor ( jht.LIGHTRED );
         jht.gotoxy ( ( int ) 30, ( int ) 3 );
         System.out.printf ( "VERIFICANDO PALÍNDROME" );
         jht.textcolor ( jht.LIGHTBLUE );
         jht.gotoxy ( ( int ) 25, ( int ) 7 );
         System.out.printf ( "Digite uma Palavra: " );
         jht.textcolor ( jht.BLACK );
         Scanner dados = new Scanner ( System.in );
         conv = dados.nextLine ( );
         str = conv.toCharArray ( );
         lenv = conv.length ( );
         jht.textcolor ( jht.LIGHTBLUE );
         jht.gotoxy ( ( int ) 25, ( int ) 9 );
         System.out.printf ( "Palavra digitada ==> " );
         jht.textcolor ( jht.BLACK );
         for ( i = 0; i < str.length; i++ ) {
              System.out.print ( str [ i ] );
         }
         jht.getche ( );
         // ///////////////////////////////////////////////////////////////
         for ( i = 0; i < lenv; i++ )
              pal [ i ] = str [ i ];
         for ( j = 0; j < lenv; j++ )
              str [ j ] = pal [ lenv - 1 - j ];
         // ///////////////////////////////////////////////////////////////
         for ( j = 0; j < lenv; j++ )
              if ( str [ j ] == pal [ j ] ) {
                   jht.textcolor ( jht.LIGHTBLUE );
                   jht.gotoxy ( ( int ) 25, ( int ) 11 );
                   System.out.printf ( "É Palíndrome ==> " );
                   jht.textcolor ( jht.BLACK );
                   for ( j = 0; j < lenv; j++ )
                        System.out.printf ( "%c", str [ j ] );
              } else {
                   jht.textcolor ( jht.LIGHTBLUE );
                   jht.gotoxy ( ( int ) 25, ( int ) 11 );
                   System.out.printf ( "Não é Palíndrome ==> " );
                   jht.textcolor ( jht.BLACK );
                   for ( j = 0; j < lenv; j++ )
                        System.out.printf ( "%c", str [ j ] );
              }
         // ///////////////////////////////////////////////////////////////
         jht.textcolor ( jht.LIGHTBLUE );
         jht.gotoxy ( ( int ) 20, ( int ) 17 );
         jht.Sleep ( ( short ) 1800 );
         System.out.printf ( "Por: " );
         jht.textcolor ( jht.LIGHTMAGENTA );
         System.out.printf ( "Samuel Lima" );
         jht.textcolor ( jht.BLACK );
         jht.gotoxy ( ( int ) 20, ( int ) 18 );
         System.out.printf ( "sa_sp10@hotmail.com" );
         jht.Sleep ( ( short ) 1800 );
         jht.textcolor ( jht.LIGHTRED );
         jht.gotoxy ( ( int ) 34, ( int ) 22 );
         System.out.printf ( "MUITO OBRIGADO" );
         jht.getche ( );
     }
}
