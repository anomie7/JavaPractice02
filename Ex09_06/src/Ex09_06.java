import javax.swing.*;
import java.awt.*;
public class Ex09_06 extends JFrame{
	Color[] bg = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY,
			  Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW, Color.MAGENTA, Color.CYAN
			  , Color.PINK};
	public Ex09_06() {
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		for(int i = 0; i < 50; i++){
			int x = (int) (Math.random()*500) + 50;
			int y = (int) (Math.random()*500) + 50;
			JLabel la = new JLabel(Integer.toString(i));
			la.setBounds(x, y, 20, 20);
			la.setOpaque(true);
			la.setBackground(bg[(int)(Math.random() * 16)]);
			add(la);
		}
		setSize(600, 600);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new Ex09_06();
	}
}
