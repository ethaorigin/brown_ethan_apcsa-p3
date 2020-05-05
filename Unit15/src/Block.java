//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setX(0);
		setY(0);
		setWidth(50);
		setHeight(50);
		setColor(Color.red);
	}

	public Block(int x, int y)
	{
		setX(x);
		setY(y);
		setWidth(0);
		setHeight(0);
		setColor(Color.red);
	}
	
	public Block(int x, int y, int w, int h)
	{
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setColor(Color.red);
	}
	
	public Block(int x, int y, int w, int h, Color col)
	{
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setColor(col);
	}

	public void setX(int x)
	   {
			xPos = x;
	   }
	
	public void setY(int y)
	   {
			yPos = y;
	   }
	
	public void setPos(int x, int y)
	   {
			xPos = x;
			yPos = y;
	   }
	
	public void setWidth(int w)
	   {
			width = w;

	   }
	
	public void setHeight(int h)
	   {
			height = h;

	   }
   
   public void setColor(Color col)
   {
	   color = col;

   }

   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block other = (Block)obj;
		if(getX()==other.getX() && getY()==other.getY() && getWidth()==other.getWidth() && getHeight()==other.getHeight()){
			return true;
		}
		return false;
	}   

	
	public int getX(){
		return xPos;
	}
    
    public int getY(){
    	return yPos;
    }
    
    public int getWidth(){
    	return width;
    }
    
    public int getHeight(){
    	return height;
    }
    
    
    public Color getColor(){
    	return color;
    }
    

    public String toString(){
    	return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
    }
    
}