import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		
		
		
		
		
		
		
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1));
        
        
        int x, y ;
        for( x = 800, y = 0; x >= 0 && y <= 580; x -= 15 , y += 10 ) {
                
        g2.drawLine(0, y, x, 0);
        g2.drawLine(0, (580-y), x, 580);
		
        }
        
        int j = 800, k = 0;
        while(j >= 0 && k <= 580 ) {
        	g2.drawLine( 800 -j, 0, 800 , k);
        	g2.drawLine( 800 - j, 580 , 800, 580 - k);
        	
        	j -= 15;
        	k += 10;
        }   
        
        
        
        
        /*	//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		g2.drawRect(10, 10, 765, 540);
		
		
		//2) Draw a horizontal line to bisect the Rectangle
		g2.drawLine(10, 270, 770, 270);
		
		
		//3) Draw a vertical line to bisect the shape again
		g2.drawLine(765/2, 10, 765/2,550 );
		
		
		//4) small rectangles on top-left
		//g2.drawLine(765/4, 10, 765/4, 550/2-10);
		
		int num = 0;
		
	
		
		
		
		while(num <= 100) {
			
			int x1 = (int)(Math.random()* (370) ) + 10;
			int y1 = (int)(Math.random()* (260) ) + 10; 
			int x2 = (int)(Math.random()* (370) ) + 10;
			int y2 = (int)(Math.random()* (260) ) + 10;
			
			int red = (int)(Math.random()*255);
			int blue = (int)(Math.random()*255);
			int green = (int)(Math.random()*255);
			
			g.setColor(new Color(red, green, blue));
			g2.drawLine(x1, y1, x2, y2);
			num++;
		}
		
		int rec = 0;
		
		while(rec <= 100) {
			
			int x3 = (int)(Math.random()* (310) ) + 390;
			int y3 = (int)(Math.random()* (200) ) + 15; 
			
			
			int red = (int)(Math.random()*255);
			int blue = (int)(Math.random()*255);
			int green = (int)(Math.random()*255);
			
			g.setColor(new Color(red, green, blue));
			g2.fillRect(x3, y3, 50, 50);
			rec++;
		}
		
		int cir = 0;
		
	/*	while(cir <= 25) {
			
			int x4 = (int)(Math.random()* (85) ) + 20;
			int y4 = (int)(Math.random()* (180) ) + 275; 
			int x5 = (int)(Math.random()* (165) ) + 5;
			int y5 = (int)(Math.random()* (75) ) + 275; 
			int x6 = (int)(Math.random()* (85) ) + 105;
			int y6 = (int)(Math.random()* (180) ) + 275; 
			int x7 = (int)(Math.random()* (85) ) + 190;
			int y7 = (int)(Math.random()* (180) ) + 275; 
			int r = (int)(Math.random()* (100) ) + 5;
			int s = (int)(Math.random()* (200) ) + 5;
			
			
			int red = (int)(Math.random()*255);
			int blue = (int)(Math.random()*255);
			int green = (int)(Math.random()*255);
			
			g.setColor(new Color(red, green, blue));
			g2.drawOval(x4, y4, r, r);
			g2.drawOval(x6, y6, r, r);
			g2.drawOval(x7, y7, r, r);
			g2.drawOval(x5, y5, s, s);
			cir++;
		}*/
	
		
	/*while(cir <= 100) {
		
		int x4 = (int)(Math.random()* (250) ) + 15;
		int y4 = (int)(Math.random()* (250) ) + 275; 
		int r = (int)(Math.random()* (200) ) + 5;

		if ( (x4 + r < 380) && (y4 + r < 550) ) {
			g2.drawOval(x4, y4, r, r);
		//	g2.drawOval(x4, y4, r, r);
		//	g2.drawOval(x4, y4, r, r);
		//	g2.drawOval(x4, y4, r, r);
			cir++;
		}
		
	
			
			
			int red = (int)(Math.random()*255);
			int blue = (int)(Math.random()*255);
			int green = (int)(Math.random()*255);
			
			g.setColor(new Color(red, green, blue));
			
		
		}
		
/*	int cir2 = 0;
	
			while(cir2 <= 25) {
		
				int x5 = (int)(Math.random()* (130) ) + 155;
				int y5 = (int)(Math.random()* (150) ) + 275; 
				int s = (int)(Math.random()* (100) ) + 5; 
		

				if ( (x5 + s < 450) && (y5 + s < 550) && (x5 - s >= 15)) {
					g2.drawOval(x5, y5, s, s);

					cir2++;
				}
				
				
				int red = (int)(Math.random()*255);
				int blue = (int)(Math.random()*255);
				int green = (int)(Math.random()*255);
				
				g.setColor(new Color(red, green, blue));
				
	} 
		
		
		
		
	
		
		/* 
		 * int var = 0; 						<---- control variable
		 * while(var < 10){ 					<---- condition to run the loop
		 *   
		 *   //any repeating code
		 *   
		 *   var++;								<---- update control variable
		 *   
		 * }
		 */
		
		 

	
	
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
