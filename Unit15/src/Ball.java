//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball(){
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y){
		super(x, y);
		setSpeed(3, 1);
	}
	
	public Ball(int x, int y, int width, int height){
		super(x, y, width, height);
	}
	
	public Ball(int x, int y, int width, int height, Color col){
		super(x, y, width, height, col);
	}
	
	public Ball(int x, int y, int width, int height, int xS, int xY){
		this(x, y, width, height);
		setSpeed(xS, xY);
	}
	
	public Ball(int x, int y, int width, int height, Color col, int xS, int xY){
		super(x, y, width, height, col);
		setSpeed(xS, xY);
	}

	
	public void setXSpeed(int xS){
		xSpeed = xS;
	}
	
	public void setYSpeed(int yS){
		ySpeed = yS;
	}
	
	public void setSpeed(int xS, int yS){
		xSpeed = xS;
		ySpeed = yS;
	}
	

   public void moveAndDraw(Graphics window){
	   draw(window, Color.WHITE);
	   setX(getX() + xSpeed);
	   setY(getY() + ySpeed);
	   draw(window);
   }
   
   
	public boolean equals(Object obj){
		Ball other = (Ball) obj;
		return super.equals(other) && xSpeed==other.getXSpeed() && ySpeed==other.getYSpeed();
	}

	public int getXSpeed(){
		return xSpeed;
	}
	
	public int getYSpeed(){
		return ySpeed;
	}


	public String toString(){
		return super.toString() + " " + xSpeed + " " + ySpeed;
	}
	
}