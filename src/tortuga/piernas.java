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
public class piernas extends Thread{
  private Turtle turtle;

  piernas(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run()
 {
     for (int i = 0; i < 100; i++){
       if(i<1){segment(turtle);}
  
  
 }
 }
private void segment(Turtle t){
 t.right(180);t.forward(120);t.right(90);t.forward(50);t.right(150);t.forward(60);t.left(150);t.forward(20);t.left(90);t.forward(10);t.right(180);t.forward(100);
 t.right(90);t.penUp();t.forward(60);
  t.penDown();t.right(90);t.forward(120);t.left(90);t.forward(50);t.left(150);t.forward(60);t.right(150);t.forward(20);t.right(90);t.forward(10);t.left(180);t.forward(100);
 t.right(90);t.penUp();
}}