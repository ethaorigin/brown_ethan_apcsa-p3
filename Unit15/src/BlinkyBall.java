//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball
{

   public BlinkyBall(){
		super();
   }

   
   
   public BlinkyBall(int x, int y)
   {
	   super(x, y);
   }

   public BlinkyBall(int x, int y, int w, int h)
   {
	   super(x, y, w, h);
   }

   public BlinkyBall(int x, int y, int w, int h, int xS, int yS)
   {
	   super(x, y, w, h, xS, yS);
   }

   public BlinkyBall(int x, int y, int w, int h, Color col, int xS, int yS)
   {
	   super(x, y, w, h, col, xS, yS);
   }

   
   
   public Color randomColor()
   {
   		int r = (int)(Math.random() * 256);		//use Math.random()
 		int g = (int)(Math.random() * 256);
 		int b = (int)(Math.random() * 256);
 		return new Color(r,g,b);
   }

   public void moveAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setX(getX() + getXSpeed());
	   setY(getY() + getYSpeed());
	   draw(window, randomColor());
   }
   
}