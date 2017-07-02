import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LeftClickTest extends JFrame{
	public LeftClickTest(){
		setTitle("Left mouse Clicked");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout());
		
		JButton btn = new JButton("Click me");
		btn.setSize(20, 20);
		btn.addMouseListener(new MyMouseListener());
		add(btn);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter{
		JButton btn;
		
		@Override
		public void mousePressed(MouseEvent e){
			if(e.getButton() == MouseEvent.BUTTON1){
				btn = (JButton) e.getSource();
				btn.setBackground(Color.RED);
			}else if(e.getButton() == MouseEvent.BUTTON3){
				btn = (JButton)	 e.getSource();
				btn.setBackground(Color.BLUE);
			}
		}
	}
	
	public static void main(String[] args){
		new LeftClickTest();
	}

}
