import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerEx extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel la;
	
	public MouseListenerEx(){
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
//		contentPane.addMouseListener(new MyMouseListener());
//		contentPane.addMouseListener(new MouseListener(){
//			@Override
//			public void mousePressed(MouseEvent e){
//				int x = e.getX();
//				int y = e.getY();
//				la.setLocation(x, y);
//			}
//			@Override
//			public void mouseClicked(MouseEvent arg0) {}
//			@Override
//			public void mouseEntered(MouseEvent arg0) {}
//			@Override
//			public void mouseExited(MouseEvent arg0) {}
//			@Override
//			public void mouseReleased(MouseEvent arg0) {}
//		});
//		contentPane.addMouseListener(new MyMouseAdapter());
		contentPane.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent d){
				la.setLocation(d.getX(), d.getY());
			}
		});
		
		la = new JLabel("Hello");
		la.setSize(100, 60);
		la.setLocation(30, 30);
		contentPane.add(la);
		setSize(500, 500);
		setVisible(true);
	}
	
//	class  MyMouseListener implements MouseListener{
//		@Override
//		public void mousePressed(MouseEvent e){
//			int x = e.getX();
//			int y = e.getY();
//			la.setLocation(x, y);
//		}
//		@Override
//		public void mouseClicked(MouseEvent arg0) {}
//		@Override
//		public void mouseEntered(MouseEvent arg0) {}
//		@Override
//		public void mouseExited(MouseEvent arg0) {}
//		@Override
//		public void mouseReleased(MouseEvent arg0) {}
//	}
//	class MyMouseAdapter extends MouseAdapter{
//		@Override
//		public void mousePressed(MouseEvent d){
//			la.setLocation(d.getX(), d.getY());
//		}
//	}
	public static void main(String[] args){
		new MouseListenerEx();
	}

}
