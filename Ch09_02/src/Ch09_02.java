import javax.swing.*;
import java.awt.*;
public class Ch09_02 extends JFrame{
	public Ch09_02() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 7));
		
		JButton b1 = new JButton("Center");
		b1.setBackground(Color.GRAY);
		c.add(b1, BorderLayout.CENTER);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("West"), BorderLayout.WEST);
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new Ch09_02();
	}
}
