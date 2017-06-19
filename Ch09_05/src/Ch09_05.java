import java.awt.*;
import javax.swing.*;

public class Ch09_05 extends JFrame{
	Color[] bg = {Color.RED, Color.ORANGE, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA,
			Color.DARK_GRAY, Color.PINK, Color.LIGHT_GRAY, Color.GRAY, Color.YELLOW, Color.WHITE};
	public Ch09_05() {
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(4, 4));
		for(int i = 0; i < 16; i++){
			JLabel l = new JLabel(Integer.toString(i));
			l.setOpaque(true);
			l.setBackground(bg[(int) (Math.random() * 12)]);
			add(l);
		}
		
		setSize(600, 200);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new Ch09_05();
	}

}
