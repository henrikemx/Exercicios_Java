/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJETO;

/**
 *
 * @author henrique
 */
import java.awt.Toolkit;
import java.util.Scanner;
import javafx.scene.input.KeyCode.J;

public class PROJETO {
     public static void Inform ( ) {
         J jht = new J ( );
         // //////////////////////////////////////////////////////////////////
         // Parâmetros da função printfx
         // Coord x, Coord y, String, cor de frente, cor de fundo,
         // Comprimento, Tempo, frequência, duração.
         jht.printfx ( 22, 18, "Por: ", 12, 15, 5, 0, 0, 0 );
         jht.printfx ( 27, 18, "Samuel Lima", 9, 15, 11, 0, 0, 0 );
         jht.printfx ( 22, 19, "sa_sp10@hotmail.com", 0, 15, 20, 0, 0, 0 );
         jht.printfx ( 28, 22, "MUITO OBRIGADO", 12, 15, 15, 0, 0, 0 );
     }
     // ///////////////////////////////////////////////////////////////////////
     // Esta função não permite a entrada de caracteres
     public static int relogio ( char c ) {
         int i;
         for ( i = 0; i < ( c ); i++ ) {
              if ( c < '0' || c > '9' )
                   return 0;
         }
         return 1;
     }
     // ///////////////////////////////////////////////////////////////////////
     static String str_1;
     static String str_2;
     static String str_3;
     static String str_4;
     static String str_5;
     static int         hora, min, seg, hr = 0, mn = 0, sg = 0;
     static int         hralm, minalm, adc;
     // ///////////////////////////////////////////////////////////////////////
     public static boolean acerta_hora ( ) {
         if ( hora > 23 ) {
              return true;
         }
         return false;
     }
     public static boolean acerta_min ( ) {
         if ( min > 59 ) {
              return true;
         }
         return false;
     }
     public static boolean acerta_seg ( ) {
         if ( seg > 59 ) {
              return true;
         }
         return false;
     }
     // ///////////////////////////////////////////////////////////////////////
     // Para o alarme do relógio digital
     public static boolean acerta_hora_alm ( ) {
         if ( hralm > 23 ) {
              return true;
         }
         return false;
     }
     public static boolean acerta_min_alm ( ) {
         if ( minalm > 59 ) {
              return true;
         }
         return false;
     }
     // ///////////////////////////////////////////////////////////////////////
     public static void main ( String [ ] args ) throws Exception {
         J jht = new J ( );
         int i;
         jht.Moldura ( 1, 24, 2, 70, 15 );
         // Este laço repetidor força a repetição
         // em caso de erros nas entradas de dados
         do {
              jht.cls ( );
              jht.poscolor ( 20, 2, 12, 15 );
              System.out.println ( "RELÓGIO DIGITAL COM ALARME EM JAVA" );
              jht.poscolor ( 20, 4, 9, 15 );
              System.out.print ( "Hora atual => " );
              jht.textcolor ( 12 );
              @SuppressWarnings ( "resource" )
              Scanner hms = new Scanner ( System.in );
              str_1 = hms.nextLine ( );
              if ( relogio ( str_1.charAt ( 0 ) ) == 0 ) {
                   Toolkit.getDefaultToolkit ( ).beep ( );
                   // Apaga o caractere digitado
                   jht.Apaga ( 4, 5, 34, 40, 15 );
                   continue;
              }
              // Conversão de String para inteiro
              hora = Integer.parseInt ( str_1 );
              if ( acerta_hora ( ) ) {
                   Toolkit.getDefaultToolkit ( ).beep ( );
                   // Apaga o número inválido digitado
                   jht.Apaga ( 4, 5, 34, 40, 15 );
                   continue;
              }
              // /////////////////////////////////////////////
              jht.poscolor ( 20, 5, 9, 15 );
              System.out.print ( "Minutos => " );
              jht.textcolor ( 12 );
              str_2 = hms.nextLine ( );
              jht.textcolor ( 12 );
              if ( relogio ( str_2.charAt ( 0 ) ) == 0 ) {
                   Toolkit.getDefaultToolkit ( ).beep ( );
                   continue;
              }
              // Conversão de String para inteiro
              min = Integer.parseInt ( str_2 );
              if ( acerta_min ( ) ) {
                   Toolkit.getDefaultToolkit ( ).beep ( );
                   continue;
              }
              // //////////////////////////////////////////////
              jht.poscolor ( 20, 6, 9, 15 );
              System.out.print ( "Segundos => " );
              jht.textcolor ( 12 );
              str_3 = hms.nextLine ( );
              jht.textcolor ( 12 );
              if ( relogio ( str_3.charAt ( 0 ) ) == 0 ) {
                   Toolkit.getDefaultToolkit ( ).beep ( );
                   continue;
              }
              // Conversão de String para inteiro
              seg = Integer.parseInt ( str_3 );
              if ( acerta_seg ( ) ) {
                   Toolkit.getDefaultToolkit ( ).beep ( );
                   continue;
              }
              // /////////////////////////////////////////////
              //Abaixo o bloco de código do alarme
              // Este laço repetidor força a repetição em caso
              // de erros nas entradas de dados do alarme
              do {
                   jht.cls ( );
                   jht.poscolor ( 20, 2, 12, 15 );
                   System.out.println ( "ALARME DO RELÓGIO DIGITAL EM JAVA" );
                   jht.poscolor ( 20, 4, 9, 15 );
                   System.out.print ( "Hora programada => " );
                   jht.textcolor ( 12 );
                   str_4 = hms.nextLine ( );
                   if ( relogio ( str_4.charAt ( 0 ) ) == 0 ) {
                        Toolkit.getDefaultToolkit ( ).beep ( );
                        // Apaga o caractere digitado
                        jht.Apaga ( 4, 5, 39, 49, 15 );
                        continue;
                   }
                   // Conversão de String para inteiro
                   hralm = Integer.parseInt ( str_4 );
                   if ( acerta_hora_alm ( ) ) {
                        Toolkit.getDefaultToolkit ( ).beep ( );
                        // Apaga o número inválido digitado
                        jht.Apaga ( 4, 5, 39, 49, 15 );
                        continue;
                   }
                   jht.poscolor ( 20, 5, 9, 15 );
                   System.out.print ( "Minutos programado => " );
                   jht.textcolor ( 12 );
                   str_5 = hms.nextLine ( );
                   jht.textcolor ( 12 );
                   if ( relogio ( str_5.charAt ( 0 ) ) == 0 ) {
                        Toolkit.getDefaultToolkit ( ).beep ( );
                        // Apaga o caractere digitado
                        jht.Apaga ( 4, 5, 42, 52, 15 );
                        continue;
                   }
                   // Conversão de String para inteiro
                   minalm = Integer.parseInt ( str_5 );
                   if ( acerta_min_alm ( ) ) {
                        Toolkit.getDefaultToolkit ( ).beep ( );
                        // Apaga o número inválido digitado
                        jht.Apaga ( 4, 5, 42, 52, 15 );
                        continue;
                   }
                   adc = hralm + minalm;
                   hr = hora;
                   mn = min;
                   sg = seg;
                   break;
              } while ( true );
              // ///////////////////////////////////////////////////////////////
              /*
               * Este laço repetidor funciona como contador Vai incrementando até
               * que atinge o número máximo em cada operação.
               */
              while ( true ) {
                   jht.Sleep ( 1000 );
                   sg++;
                   if ( sg > 59 ) {
                        sg = 0;
                        mn++;
                   }
                   if ( mn > 59 ) {
                        mn = 0;
                        hr++;
                   }
                   if ( hr > 23 ) {
                        hr = 0;
                   }                 
                   // ///////////////////////////////////////////////////////////
                   //Abaixo a impressão do alarme em funcionamento            
                   jht.poscolor ( 20, 12, 9, 15 );
                   System.out.printf ( " H   M " );
                   jht.poscolor ( 19, 14, 12, 15 );
                   System.out.printf ( " %d : %d", hr, mn );
                   if ( adc > 1 ) {
                        jht.Apaga ( 10, 11, 19, 52, 15 );
                        jht.poscolor ( 20, 10, 9, 15 );
                        System.out.printf ( "ALARME EMITINDO" );
                        if ( adc == hr + mn ) {
                            for ( i = 0; i < 10; i++ ) {
                                 //Som do alarme
                                 jht.Beep ( 1000, 1000 );
                            }
                            //Quamdo o alarme termina de despertar
                            //As variáveis abaixo são resetadas
                            adc = 0;
                            hralm = 0;
                            minalm = 0;
                        }
                   }
                   // /////////////////////////////////////////////////////////////
                   //Abaixo a impressão do relógio em funcionamento
                   jht.cls ( );
                   jht.poscolor ( 20, 2, 12, 15 );
                   System.out.println ( "RELÓGIO DIGITAL COM ALARME EM JAVA" );
                   jht.poscolor ( 20, 4, 9, 15 );
                   System.out.print ( "Horas, minutos e segundos" );
                   jht.poscolor ( 20, 6, 9, 15 );
                   System.out.printf ( "H   M   S" );
                   jht.poscolor ( 19, 8, 12, 15 );
                   System.out.printf ( " %d : %d  %d ", hr, mn, sg );
                   // /////////////////////////////////////////////////////////////
                   //Mostra a mensagem sobre o alarme enquanto ele não desperta
                   //Isto é, enquanto as variáveis "hralm, minalm" estão carregadas
                   if ( hralm > 0 && minalm > 0 ){
                   jht.poscolor ( 20, 10, 9, 15 );
                   System.out.printf ( "O alarme despertará as" );
                   jht.poscolor ( 19, 12, 12, 15 );
                   System.out.printf ( " %d : %d", hralm, minalm );
                   }
                   // /////////////////////////////////////////////////////////////
                   Inform ( );
              }
         } while ( true );
     }
}