import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Toolkit;
import java.awt.Frame;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;


public class SimpleFrameTest{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		MyComponent a = new MyComponent();
		a.setBackground(Color.PINK);
		frame.add(a);
		frame.setSize(300,200);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
class MyComponent extends JComponent{
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		Rectangle2D rect = new Rectangle2D.Double(50,50,100,100);
		g2.setPaint(new Color(123,200,50));
		System.out.println(Color.RED);
		g2.fill(rect);
	}
}
