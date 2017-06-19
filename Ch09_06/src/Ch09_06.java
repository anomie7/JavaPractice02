import javax.swing.*;
import java.awt.*;
public class Ch09_06 extends JFrame{
	Color[] bg = {Color.RED, Color.ORANGE, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA,
			Color.DARK_GRAY, Color.PINK, Color.LIGHT_GRAY, Color.GRAY, Color.YELLOW, Color.WHITE};
	public Ch09_06() {
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		for(int i = 0; i < 20; i++){
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			
			JLabel l = new JLabel();
			l.setOpaque(true);
			l.setBackground(bg[(int) (Math.random() * 12)]);
			l.setBounds(x, y, 10, 10);
			add(l);
		}
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new Ch09_06();
	}
}
