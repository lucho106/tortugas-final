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
public class Linea extends Thread{
  private Turtle turtle;

  Linea(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run()
 {
     for (int i = 0; i < 100; i++){
       if(i<1){segment(turtle);}

  else if(i<2){for (int s = 0; s < 360; s++){segment2(turtle);}}
else if(i<3){{segment3(turtle);}}
  
      
  
 }
 }
private void segment(Turtle t)
 {t.forward(40);t.right(90);t.penUp();t.forward(3);t.left(90);t.forward(-2);t.left(90);}

private void segment2(Turtle t)
 {t.penDown();t.right(1);t.forward(0.15);}
private void segment3(Turtle t)
 {t.right(180);t.penUp();t.forward(3);t.right(90);t.penDown();t.forward(40);}


}