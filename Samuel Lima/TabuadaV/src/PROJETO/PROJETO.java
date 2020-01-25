/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJETO;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class PROJETO extends Application {
     static String str   = "";
     static String str_1 = "";
     static String str_2 = "";
     static String str_4 = "x";
     static String str_5 = "=";
     static Stage  stage;
     Scene              scene;
     static Pane        root     = new Pane ( );
     static Canvas canvas = new Canvas ( 700, 540 );
     static GraphicsContext ctx = canvas.getGraphicsContext2D ( );
     static int x = 0, k = 0, w = 0, y = 1, i = 0, j = 0, m = 0;
     static int x_1 = 0, x_2 = 0, x_3 = 0, x_4 = 0, x_5 = 0;
     // ///////////////////////////////////////////////////////////////////
     public static  Node But_ton_1 ( ) {
         Button btn_1 = new Button ( "ok" );
         btn_1.setPrefWidth ( 50 );// Largura do botão
         btn_1.setLayoutX ( 80 );// Posição do botão
         btn_1.setPrefHeight ( 20 );// altura do botão
         btn_1.setLayoutY ( 480 );// //Posição do botão
         btn_1.setOnAction ( new EventHandler < ActionEvent > ( ) {
              @Override
              public void handle ( ActionEvent event ) {
                   int b = 0;
                   b = 1;
                   Sleep ( 1800, b );
                   b = 2;
                   Sleep ( 2800, b );
              }
         } );
         root.getChildren ( ).add ( btn_1 );
         return btn_1;
     }
     // ///////////////////////////////////////////////////////////////////
     public static  Node But_ton_2 ( ) {
         Button btn_2 = new Button ( "sair" );
         btn_2.setPrefWidth ( 50 );// Largura do botão
         btn_2.setLayoutX ( 570 );// Posição do botão
         btn_2.setPrefHeight ( 20 );// altura do botão
         btn_2.setLayoutY ( 480 );// //Posição do botão
         btn_2.setOnAction ( new EventHandler < ActionEvent > ( ) {
              @Override
              public void handle ( ActionEvent event ) {
                   System.exit ( 0 );
              }
         } );
         root.getChildren ( ).add ( btn_2 );
         return btn_2;
     }
     // ///////////////////////////////////////////////////////////////////
     //Chamando uma função depois de um certo tempo
     public static void Tempo_2 ( ) {
         ctx.setFill ( Color.GREEN );
         ctx.fillText ( "MUITO OBRIGADO", 280, 500 );
     }
     public static void Tempo_1 ( ) {
         ctx.setFill ( Color.BLUE );
         ctx.fillText ( "Por: Samuel Lima", 280, 90 );
     }
     public static int Sleep ( int x, int k ){
         Task < Integer > close = new Task < Integer > ( ) {
              @Override
              protected Integer call ( ) throws Exception {
                   Thread.sleep ( x );
                   return null;
              }
         };     
         close.setOnSucceeded ( c -> {
              if ( k == 1 )
                   Tempo_1 ( );
              if ( k == 2 )
                   Tempo_2 ( );
         } );
         new Thread ( close ).start ( );
         return 0;
     }
     @Override
     public void start ( Stage stage ) throws InterruptedException {
         ctx.setStroke ( Color.RED );
         ctx.setLineWidth ( 22.0 );
         ctx.strokeRoundRect ( 10, 10, 680, 520, 10, 10 );
         root.getChildren ( ).add ( canvas );
         Scene scene = new Scene ( root );
         stage.setTitle ( "TABUADA V - LINGUAGEM JAVA" );
         ctx.setFont ( Font.font ( "Arial", FontWeight.BOLD, 15 ) );
         ctx.setFill ( Color.RED );
         ctx.fillText ( "TABUADA V - LINGUAGEM JAVA", 220, 60 );
         ObservableList < Node > content = ( ( Pane ) scene.getRoot ( ) )
                   .getChildren ( );
         stage.setScene ( scene );
         stage.show ( );
         content.add ( Line ( ) );
     }
     public static Node Line ( ) {
         Group z = new Group ( );
         do {
              int p_1 = 120;
              int p_2 = 240;
              int p_3 = 360;
              int p_4 = 480;
              if ( y == 1 ){
                   j = 100;
                   x_1 = 70;
                   x_2 = 110;
                   x_3 = 150;
                   x_4 = 90;
                   x_5 = 130;
                   m = 115;
              }
              if ( y == 2 ){
                   j = 100;
                   x_1 = 70 + p_1;
                   x_2 = 110 + p_1;
                   x_3 = 150 + p_1;
                   x_4 = 90 + p_1;
                   x_5 = 130 + p_1;
                   m = 115;
              }
              if ( y == 3 ){
                   j = 100;
                   x_1 = 70 + p_2;
                   x_2 = 110 + p_2;
                   x_3 = 150 + p_2;
                   x_4 = 90 + p_2;
                   x_5 = 130 + p_2;
                   m = 115;
              }
              if ( y == 4 ){
                   j = 100;
                   x_1 = 70 + p_3;
                   x_2 = 110 + p_3;
                   x_3 = 150 + p_3;
                   x_4 = 90 + p_3;
                   x_5 = 130 + p_3;
                   m = 115;
              }
              if ( y == 5 ){
                   j = 100;
                   x_1 = 70 + p_4;
                   x_2 = 110 + p_4;
                   x_3 = 150 + p_4;
                   x_4 = 90 + p_4;
                   x_5 = 130 + p_4;
                   m = 115;
              }
              if ( y == 6 ){
                   j = 285;
                   x_1 = 70;
                   x_2 = 110;
                   x_3 = 150;
                   x_4 = 90;
                   x_5 = 130;
                   m = 300;
              }
              if ( y == 7 ){
                   j = 285;
                   x_1 = 70 + p_1;
                   x_2 = 110 + p_1;
                   x_3 = 150 + p_1;
                   x_4 = 90 + p_1;
                   x_5 = 130 + p_1;
                   m = 300;
              }
              if ( y == 8 ){
                   j = 285;
                   x_1 = 70 + p_2;
                   x_2 = 110 + p_2;
                   x_3 = 150 + p_2;
                   x_4 = 90 + p_2;
                   x_5 = 130 + p_2;
                   m = 300;
              }
              if ( y == 9 ){
                   j = 285;
                   x_1 = 70 + p_3;
                   x_2 = 110 + p_3;
                   x_3 = 150 + p_3;
                   x_4 = 90 + p_3;
                   x_5 = 130 + p_3;
                   m = 300;
              }
              if ( y == 10 ){
                   j = 285;
                   x_1 = 70 + p_4;
                   x_2 = 110 + p_4;
                   x_3 = 150 + p_4;
                   x_4 = 90 + p_4;
                   x_5 = 130 + p_4;
                   m = 300;
              }
              x = 1;
              for ( i = 0; i < 10; i++ ) {
                   do {
                        k = y;
                        w = k * x;
                        if ( y <= 10 ) {
                            str = str += ("\n");
                            str = str += k;
                        }
                        if ( x <= 10){
                            str_1 = str_1 += ("\n");
                            str_1 = str_1 += x;
                        }
                        if ( x < 10){
                            str_4 += ("\n");
                            str_4 += "x";
                        }
                        if ( x < 10){
                            str_5 += ("\n");
                            str_5 += "=";
                        }
                        if ( w <= 100){
                            str_2 += ("\n");
                            str_2 += w;
                        }
                        ctx.setFill ( Color.BLACK );
                        ctx.fillText ( str, x_1, j );
                        ctx.setFill ( Color.BLACK );
                        ctx.fillText ( str_1, x_2, j );
                        ctx.setFill ( Color.RED );
                        ctx.fillText ( str_2, x_3, j );
                        ctx.setFill ( Color.BLACK );
                        ctx.fillText ( str_4, x_4, m );
                        ctx.setFill ( Color.BLUE );
                        ctx.fillText ( str_5, x_5, m );
                        i++;
                        x++;
                   } while ( x <= 10 );
              }
              y++;
              str   = "";
              str_1 = "";
              str_2 = "";
              str_4 = "x";
              str_5 = "=";
         } while ( y <= 10 );
         But_ton_1 ( );
         But_ton_2 ( );
         return z;
     }
     // //////////////////////////////////////////////////////////////////////////
     public static void main ( String [ ] args ) {
         Application.launch ( args );
     }
}