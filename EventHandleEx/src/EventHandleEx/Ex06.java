package EventHandleEx;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex06 extends JFrame{
	JLabel la = new JLabel("C");
	JPanel p = new JPanel();
	public Ex06(){
		setTitle("클릭 연습 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(p);
		p.setLayout(null);
		
		la.setBounds(100, 100, 50, 50);
		la.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				la.setLocation((int) (Math.random() * 500), (int) (Math.random() * 500)); 
			}
			
		});
		p.add(la);
		
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new Ex06();
	}

}
