import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ButtonFrame extends JFrame{
	private JPanel panel;
	private JButton button;

	ButtonFrame(){
		setSize(200,100);
		panel = new JPanel();
		button = new JButton();
		ButtonListener a = new ButtonListener(Color.RED);
		button.addActionListener(a);
		panel.add(button);
		add(panel);
	}

	private class ButtonListener implements ActionListener{
		private Color backgroundColor;
		ButtonListener(Color c){
			backgroundColor = c;
		}
		public void actionPerformed(ActionEvent e){
			panel.setBackground(backgroundColor);
		}
	}
}
class ButtonFrameTest{
	public static void main(String[] args){
		ButtonFrame a = new ButtonFrame();
		a.setVisible(true);
	}
}
