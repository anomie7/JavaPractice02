package EventHandleEx;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenChallenge extends JFrame{
	public OpenChallenge(){
		setTitle("Open Challenge 10");
		
		JPanel p = new GamePanel();
		
		setContentPane(p);
		
		setSize(500, 250);
		setVisible(true);
		p.requestFocus();
	}
	public static void main(String[] args){
		new OpenChallenge();
	}

}

class GamePanel extends JPanel{
	
	public GamePanel(){
		JLabel[] la = new JLabel[3];
		JLabel ev = new JLabel("시작합니다.");
		
		setLayout(null);
		
		for(int i = 0; i < la.length; i++){
			la[i] = new JLabel(0 + "");
			la[i].setBackground(Color.MAGENTA);
			la[i].setOpaque(true);
			la[i].setFont(new Font("Arial", Font.PLAIN, 60));
			la[i].setSize(70, 50);
			la[i].setLocation( 120 + (i* 80), 50);
			add(la[i]);
		}
			ev.setSize(90, 50);
			ev.setLocation(180, 100);
			add(ev);
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					System.out.println("dd");
					
					for(int i = 0; i < la.length; i++){
						int x = (int) (Math.random() * 5);
						la[i].setText(x + "");
					}
					
					if(la[0].getText().equals(la[1].getText() ) && la[1].getText().equals(la[2].getText() ) ){
						ev.setText("축하합니다!!");
					}else{
						ev.setText("아쉽군요");
					}
					
				}
			}
			
		});
		
		setSize(200, 200);
		setVisible(true);
	}
}
