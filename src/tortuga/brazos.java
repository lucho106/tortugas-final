/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tortuga;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Equipo
 */
public class brazos extends Thread{
  private Turtle turtle;

  brazos(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run()
 {
     for (int i = 0; i < 100; i++){
       if(i<1){segment(turtle);}
       else if(i<2){
         for (int m = 0; m < 360; m++){   segment1(turtle);
       }}else if(i<3){segment2(turtle);}
       else if (i<4){
           segment3(turtle);
       }else if(i<5){
         for (int m = 0; m < 360; m++){   segment4(turtle);
       }}else if(i<6){
           segment5(turtle);
       }else if(i<7){
         for (int m = 0; m < 450; m++){   segment6(turtle);}}
       else if(i<8){segment7(turtle);}
  
       
       else if(i<9){segment9(turtle);}
       else if(i<10){
         for (int m = 0; m < 360; m++){   segment10(turtle);
       }}else if(i<11){segment11(turtle);}
       else if (i<12){
           segment12(turtle);
       }else if(i<13){
         for (int m = 0; m < 360; m++){   segment13(turtle);
       }}else if(i<14){
           segment14(turtle);
       }else if(i<15){
         for (int m = 0; m < 450; m++){   segment15(turtle);}}
       else if(i<16){segment16(turtle);}
 }
 }
private void segment(Turtle t){
 t.left(90);t.forward(10);t.right(90);}
private void segment1(Turtle t){
 t.left(1);t.forward(0.3);}
private void segment2(Turtle t){
 t.left(90);t.penUp();t.forward(12);}
private void segment3(Turtle t){
 t.right(90);}
private void segment4(Turtle t){
 t.penDown();t.left(1);t.forward(0.1);}
private void segment5(Turtle t){
 t.right(180);t.penUp();t.forward(18);t.penDown();t.forward(5);
t.right(90);t.forward(10);t.right(90);t.forward(5);t.right(90);t.forward(10);t.right(90);t.forward(5);
t.left(90);t.forward(5);
t.right(90);t.forward(80);t.right(90);t.forward(20);t.right(90);t.forward(80);t.right(90);
t.forward(7);t.penUp();t.right(90);t.forward(80);t.penDown();t.forward(5);t.penUp();t.left(90);t.forward(6);t.left(90);t.penDown();t.forward(5);
t.left(90);t.forward(3);t.penUp();t.left(90);t.forward(4);t.right(90);
}
private void segment6(Turtle t){
 t.penDown();t.left(1);t.forward(0.15);}
private void segment7(Turtle t){
t.forward(15);t.right(90);t.forward(5);t.right(90);t.forward(15);t.right(90);t.forward(5);t.penUp();
t.forward(18);t.penDown();t.forward(5);t.right(90);t.forward(15);t.right(90);t.forward(5);t.right(90);
t.forward(15);t.penUp();t.forward(110);t.right(90);t.forward(8);t.penDown();t.forward(10);t.penUp();t.forward(140);t.left(90);t.forward(5);t.right(90);
}




private void segment9(Turtle t){
t.penDown();t.forward(10);t.left(90);}
private void segment10(Turtle t){
 t.right(1);t.forward(0.3);}
private void segment11(Turtle t){
 t.right(90);t.penUp();t.forward(12);}
private void segment12(Turtle t){
 t.left(90);}
private void segment13(Turtle t){
 t.penDown();t.right(1);t.forward(0.1);}
private void segment14(Turtle t){
 t.left(180);t.penUp();t.forward(18);t.penDown();t.forward(5);
t.left(90);t.forward(10);t.left(90);t.forward(5);t.left(90);t.forward(10);t.left(90);t.forward(5);
t.right(90);t.forward(5);
t.left(90);t.forward(80);t.left(90);t.forward(20);t.left(90);t.forward(80);t.left(90);
t.forward(7);t.penUp();t.left(90);t.forward(80);t.penDown();t.forward(5);t.penUp();t.right(90);t.forward(6);t.right(90);t.penDown();t.forward(5);
t.right(90);t.forward(3);t.penUp();t.right(90);t.forward(4);t.left(90);
}
private void segment15(Turtle t){
 t.penDown();t.right(1);t.forward(0.15);}
private void segment16(Turtle t){
t.forward(15);t.left(90);t.forward(5);t.left(90);t.forward(15);t.left(90);t.forward(5);t.penUp();
t.forward(18);t.penDown();t.forward(5);t.left(90);t.forward(15);t.left(90);t.forward(5);t.left(90);
t.forward(15);t.penUp();t.forward(110);t.left(90);t.forward(8);t.penDown();t.forward(10);t.penUp();t.forward(140);t.right(90);t.forward(5);t.left(90);




}
}
