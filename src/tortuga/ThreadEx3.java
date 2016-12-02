package tortuga;

//ThreadEx3.java

import ch.aplu.turtle.*;
import java.awt.Color;

public class ThreadEx3 extends TurtleFrame
{
    public void simular(){
        Turtle cabeza = new Turtle(this);
        
        Turtle cuerp = new Turtle(this, Color.red);
        Turtle antena = new Turtle(this, Color.green);
                
        cabeza.setPos(-50, 80);
        cuerp.setPos(-20, 80);
        antena.setPos(0, 140);
        
        cabeza.setPenColor(Color.red);
        cuerp.setPenColor(Color.black);
        
        new Cuadrado(cabeza).start();
        new cuerpo(cuerp).start();
        new Linea(antena).start();
    }


public static void main(String[] args)
{
   ThreadEx3 tablero =  new ThreadEx3();
   tablero.simular();
}
}