import javax.swing.*;
import java.awt.*;
public class GridLayoutEx extends JFrame{
	public GridLayoutEx(){
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		GridLayout grid = new GridLayout(4,2);
		
//		setLayout(new GridLayout(4,2,0,5));
		
		grid.setVgap(5);
		c.setLayout(grid);
		c.add(new JLabel(" �̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �й�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �а�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" ����"));
		c.add(new JTextField(""));
		
		setSize(300, 200);
		setVisible(true);
		
	}
	public static void main(String[] args){
		new GridLayoutEx();
	}
}
