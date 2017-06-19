import javax.swing.*;
import java.awt.*;
public class OpenChallenge09 extends JFrame{
	public OpenChallenge09(){
		setTitle("Open Challenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new NorthPanel(), BorderLayout.NORTH);
		add(new CenterPanel(), BorderLayout.CENTER);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args){
		new OpenChallenge09();
	}
}
class NorthPanel extends JPanel{
	 public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		add(new JButton("Open"));
		add(new JButton("Read"));
		add(new JButton("Close"));
	}
}

class CenterPanel extends JPanel{
	public CenterPanel(){
		setLayout(null);
		
		String[] str = new String[3];
		str[0] = "Hello";
		str[1] = "Love";
		str[2] = "Java";
		
		for(int i = 0; i < 3; i++){
			JLabel l = new JLabel(str[i]);
			l.setBounds((int) (i*(Math.random() *200)), (int) (i*(Math.random() *200)), 50, 20);
			add(l);
		}
	}
}