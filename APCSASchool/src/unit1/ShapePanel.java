package unit1;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);

//Robot
		/*
		//draw head
		window.setColor(Color.gray);
		window.fillOval(250, 50, 200, 100);
		//draw body
		window.setColor(Color.CYAN);
		window.fillRect(300, 150, 100, 200);
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
		//draw mouth
		window.setColor(Color.red);
		window.fillOval(335, 110, 30, 10);
	*/
		
//Create your own shape
		window.setColor(Color.CYAN);
		window.drawRect(10, 30, 400, 500);
		window.setColor(Color.GREEN);
		window.drawOval(50, 42, 199, 300);
		window.setColor(Color.RED);
		window.drawRect(60, 70, 106, 450);
		window.setColor(Color.GREEN);
		window.fillOval(403, 34, 234, 20);
		
	}
}

