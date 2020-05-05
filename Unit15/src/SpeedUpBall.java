//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   public SpeedUpBall(){
	   super();
   }

   public SpeedUpBall(int x, int y){
	   super(x, y);
   }


   public SpeedUpBall(int x, int y, int xS, int yS){
	   super(x, y);
	   setSpeed(xS, yS);
   }

   public SpeedUpBall(int x, int y, int w, int h, int xS, int yS){
	   super(x, y, w, h, xS, yS);
   }

   public SpeedUpBall(int x, int y, int w, int h, Color col, int xS, int yS){
	   super(x, y, w, h, col, xS, yS);
   }

   public void setXSpeed( int xS ){
	   if (xS<0) super.setXSpeed(xS - 1);
	   else super.setXSpeed(xS + 1);
   }

   public void setYSpeed( int yS ) {
	   if (yS<0) super.setYSpeed(yS - 1);
	   else super.setYSpeed(yS + 1);
   }
}
