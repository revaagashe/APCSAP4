package unit1;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      window.fillOval(10,  10,  100,  100);
      head(window);
      upperBody(window);
      otherParts(window);
   }

   public void head( Graphics window )
   {
      //window.setColor(Color.YELLOW);

     // window.fillOval(300, 100, 200, 100);

    //  window.drawOval(10, 10, 100, 100);

		window.setColor(Color.gray);
		window.fillOval(250, 50, 200, 100);				
   }

   public void upperBody( Graphics window )
   {

		window.setColor(Color.CYAN);
		window.fillRect(300, 150, 100, 200);
   }

   public void otherParts( Graphics window )
   {

		//draw arms
		window.setColor(Color.black);
		window.drawLine(200, 100, 300, 200);
		window.drawLine(500, 100, 400, 200);
		//instantiate a Shape
		//draw legs
		window.drawLine(200, 400, 300, 350);
		window.drawLine(500, 400, 400, 350);
		//draw eyes
		window.setColor(Color.magenta);
		window.fillOval(300, 80, 10, 10);
		window.fillOval(380, 80, 10, 10);
	
	   

   }
}