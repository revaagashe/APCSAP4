package unit15;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Date;
import java.util.Timer;

public class InvisibleBall extends Ball {
	  public InvisibleBall()
	   {
			super();
	   }

	   public InvisibleBall(int x, int y)
	   {
		   super(x,y);


	   }

	   public InvisibleBall(int x, int y, int wid, int ht)
	   {
		   
		   super(x,y,wid,ht);


	   }

	   public InvisibleBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
	   {
		   super(x,y,wid,ht);
		   setXSpeed(xSpd);
		   setYSpeed(ySpd);

	   }

	   public InvisibleBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
	   {
		   super(x,y,wid,ht,col);
		   setXSpeed(xSpd);
		   setYSpeed(ySpd);



	   }
	   
	   public void time(int x, int y) {
		   long startTime = System.currentTimeMillis();
		   long elapsedTime = 0L;
		   while (elapsedTime<x) {
			   elapsedTime = (new Date()).getTime() - startTime;
			   setColor(Color.WHITE);
		   }
		   startTime = System.currentTimeMillis();
		   elapsedTime = 0L;
		   while (elapsedTime<y) {
			   elapsedTime = (new Date()).getTime() - startTime;

			   setColor(Color.BLUE);
		   }
		   
	   }
	   
	   public void moveAndDraw(Graphics window)
	   {
	   	//draw a white ball at old ball location
		 window.setColor(Color.WHITE);
		  window.fillRect(getX(), getY(), getWidth(), getHeight());  

	      setX(getX()+getXSpeed());
			//setY
	      setY(getY() + getYSpeed());
			//draw the ball at its new location
	      
	     	int t = (int)(Math.random()*(5)+1000);
	     	int t2 = (int)(Math.random()*(5)+1000);

	     	time(t, t2);
	     	draw(window);
	   }
	 
}
