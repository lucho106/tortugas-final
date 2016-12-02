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
public class Cuadrado extends Thread{
  private Turtle turtle;

  Cuadrado(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run()
 {
   for (int i = 0; i < 100; i++){
       if(i<2){segment(turtle);}
 else if(i==2){segment1(turtle);}
 else if(i<5){segment(turtle);}
 else if(i<6){segment1(turtle);} 
 else if(i<7){segment2(turtle);}
else if(i<8){segment3(turtle);}
else if(i<9){for (int s = 0; s < 360; s++){segment4(turtle);}}       
 else if(i<10){segment5(turtle);}
 else if(i<11){segment6(turtle);}
 else if(i<12){for (int s = 0; s < 360; s++){segment4(turtle);}}       
 else if(i<13){segment7(turtle);} 
 else if(i<14){for (int s = 0; s < 90; s++){segment8(turtle);}}       
 
 
 else if(i<15){segment9(turtle);}
 else if(i<16){segment6(turtle);}
 else if(i<17){for (int s = 0; s < 180; s++){segment8(turtle);}}       
 else if(i<18){segment10(turtle);}
       
   }
   
 }

 private void segment(Turtle t)
 {t.forward(60);t.right(90);}
 private void segment1(Turtle t)
 {t.left(90);t.forward(60);t.right(90);}
private void segment2(Turtle t)
 {t.forward(45);t.penUp();t.right(90);}
private void segment3(Turtle t)
 {t.forward(25);t.penDown();}
private void segment4(Turtle t)
 {t.right(1);t.forward(0.2);}
private void segment5(Turtle t)
 {t.penUp();t.forward(70);}
private void segment6(Turtle t)
 {t.penDown();}
private void segment7(Turtle t)
 {t.penUp();t.right(90);t.forward(5);t.penDown();t.left(90);}
private void segment8(Turtle t)
 {t.right(1);t.forward(0.09);}
private void segment9(Turtle t)
 {t.penUp();t.right(90);t.forward(80);t.right(90);}
private void segment10(Turtle t)
 {t.penUp();t.forward(20);t.left(90);t.forward(10);t.right(90);t.penDown();t.forward(10);t.left(90);t.forward(40);t.left(90);
 t.forward(10);t.left(90);t.forward(40);t.left(180);t.forward(10);t.right(90);t.forward(10);t.left(90);
 t.forward(10);t.left(90);t.forward(10);t.right(90);t.forward(10);t.right(90);t.forward(10);
 }







}
