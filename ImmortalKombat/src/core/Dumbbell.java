package core;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
//add int x and all that 
public class Dumbbell {

	protected float x;
	protected float y;
	protected float xSpeed;
	protected float ySpeed;
	
	public Dumbbell()
	{
		this.x = 10;
		this.y = 50;
		xSpeed  = xSpeed + x;
	}

	
	public void update()
	{
		//x++;
	}
	public void render(Graphics g)
	{
		g.drawRect(x,y,50,50);
	}
	
	public void keyPressed(int key, char c)
	{
		// This code happens every time the user presses a key
		if(key == Input.KEY_D)
		{
			x++;
		}
		if(key == Input.KEY_A)
		{
			x--;
		}
		
	}
	
	public float getX() 
	{
		return x;
	}
	
	public float getY()
	{
		return y;
	}
}
