package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SS {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		JButton button = new JButton();
		
		button.setBounds(30, 120, 200, 80);
		
		frame.add(button);
		
		frame.setLocation(1000, 100);


		frame.setLocation(600, 100);
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}

}
