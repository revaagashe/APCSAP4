//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package unit15;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;

	int RightScore = 0;
	int LeftScore = 0;

	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(300, 20, 10, 10, Color.RED, -1, -1);		
		
		leftPaddle = new Paddle(30,300,30,100, Color.GREEN,5);
		
		rightPaddle = new Paddle(750,300,30,100, Color.GREEN,5);
		
		RightScore = 0;
		LeftScore = 0;


		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		//graphToBack.drawString("Left Player: " + LeftScore + "\nRight Player: " + RightScore, 300, 400);


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		graphToBack.setColor(Color.RED);
		graphToBack.drawString("Scores",350,380);
		
		//see if ball hits left wall or right wall
		if(!(ball.getX()<=20) && ball.getX()>=770)
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);

			if (ball.getX()<= 20){
			//if (ball.getX()<=leftPaddle.getX() + leftPaddle.getWidth()){
				//graphToBack.setColor(Color.WHITE);
				//graphToBack.drawString("Right Paddle: "+RightScore, 300, 500);

				RightScore +=1;
			
				
			}
			 if (ball.getX()>=770){
				//graphToBack.setColor(Color.WHITE);
				//graphToBack.drawString("Left Paddle: "+LeftScore, 200, 500);
				LeftScore+=1;

				
			}
				graphToBack.setColor(Color.WHITE);
				graphToBack.drawString("Right Paddle: "+(RightScore-1), 300, 400);
				graphToBack.drawString("Left Paddle: "+(LeftScore-1), 300, 450);		
				
				graphToBack.setColor(Color.BLUE);

				graphToBack.drawString("Right Paddle: "+RightScore, 300, 400);
				graphToBack.drawString("Left Paddle: "+LeftScore, 300, 450);

			ball.setX(300);
			ball.setY(30);
			graphToBack.setColor(Color.BLUE);

			ball.setXSpeed(-1);
			ball.setYSpeed(-1);
		}

		
		//see if the ball hits the top or bottom wall 

	//	if (!(ball.getY()>=0 && ball.getY()<=550)){
		//	ball.setYSpeed(-ball.getYSpeed());

	//	}	
		if (!(ball.getY()>=20 && ball.getY()<=550)){
		ball.setYSpeed(-ball.getYSpeed());
		}

		if (ball.didCollideLeft(leftPaddle) || ball.didCollideRight(rightPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		
		
		else if (ball.didCollideTop(rightPaddle) || ball.didCollideBottom(rightPaddle)){
			ball.setYSpeed(-ball.getYSpeed());
			ball.setXSpeed(-ball.getXSpeed());
			
		}
		else if ( ball.didCollideTop(leftPaddle) || ball.didCollideBottom(leftPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
				ball.setYSpeed(-ball.getYSpeed());

		}

//code befoREd collidable stuff got implemented
		//see if the ball hits the left paddle
		
	/*	if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed())){
			if ((ball.getY() >= leftPaddle.getY())&&(ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight()))
				{
				if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed())){
					ball.setYSpeed(-ball.getYSpeed());

				}
				else {
					ball.setXSpeed(-ball.getXSpeed());

				}
				}
			else if (((leftPaddle.getY() <= ball.getY() + ball.getHeight() ) ) &&  (ball.getY() + ball.getHeight() > leftPaddle.getY() + leftPaddle.getHeight())){
				
				if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed())){
					ball.setYSpeed(-ball.getYSpeed());

				}
				else {
					ball.setXSpeed(-ball.getXSpeed());

				}
			}
		}
		
		
		//see if the ball hits the right paddle
		
		if (ball.getX() <= rightPaddle.getX() + Math.abs(ball.getXSpeed())){
			if ((ball.getY() >= rightPaddle.getY())&&(ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight()))
				{
				if (ball.getX() <= rightPaddle.getX()  - Math.abs(ball.getXSpeed())){
					ball.setYSpeed(-ball.getYSpeed());

				}
				else {
					ball.setXSpeed(-ball.getXSpeed());

				}
				}
			else if (((rightPaddle.getY() <= ball.getY() + ball.getHeight() ) ) &&  (ball.getY() + ball.getHeight() > rightPaddle.getY() + rightPaddle.getHeight()))
			{
				if (ball.getX() <= rightPaddle.getX()  - Math.abs(ball.getXSpeed())){
					ball.setYSpeed(-ball.getYSpeed());
	
				}
				else {
					ball.setXSpeed(-ball.getXSpeed());
	
				}
			}
		}
		*/


		//see if the paddles need to be moved

		if (keys[0] == true)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(graphToBack);

		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}













		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}