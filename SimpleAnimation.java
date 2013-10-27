import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleAnimation {
	int x=50;
	int y=50;
	
	
	public static void main(String[] args) {
	
		SimpleAnimation gui = new SimpleAnimation();
		gui.go();
	}
	
	public void go(){
		JFrame frame = new JFrame("Простая анимация");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDrawPanel panel = new MyDrawPanel();
		
		frame.getContentPane().add(panel);
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		
		for(int i=0; i<130; i++){
			x++;
			//y++;
			panel.repaint();
			try{
				Thread.sleep(10);
			}catch(Exception ex){}
		}
		for(int i=0; i<130; i++){
			//x++;
			y++;
			panel.repaint();
			try{
				Thread.sleep(10);
			}catch(Exception ex){}
		}
		for(int i=0; i<130; i++){
			x--;
			//y--;
			panel.repaint();
			try{
				Thread.sleep(10);
			}catch(Exception ex){}
		}
		for(int i=0; i<130; i++){
			//x--;
			y--;
			panel.repaint();
			try{
				Thread.sleep(10);
			}catch(Exception ex){}
		}
		
	}
	}
