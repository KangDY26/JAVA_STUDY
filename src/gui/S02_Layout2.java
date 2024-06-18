package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

public class S02_Layout2 {

	public static void main(String[] args) {
		new Border();
		new GridLayoutExample();
		new FlowLayoutExample();
	}
}

/*
 * # 레이아웃 (Layout)
 * 
 * - 컨테이너에는 레이아수을 설정할 수 있다 - 레이아웃은 해당 컨테이너에 컴포넌트를 배치하는 방식을 결정한다 - 컨테이너의 레이아웃을
 * null로 설정하면 컴포넌트를 모두 직접 배치해야 한다
 * 
 * https://www.javatpoint.com/java-layout-manager(참조)
 */

class Border {
	JFrame f;

	Border() {
		// 프레임으로 인스턴스 생성 (JFrame으로 만든 인스턴스 레이아웃 기본값이 BorderLayout이다)
		f = new JFrame();

		// 버튼 인스턴스 생성
		JButton b1 = new JButton("북쪽버튼");
		JButton b2 = new JButton("남쪽버튼");
		JButton b3 = new JButton("동쪽버튼");
		JButton b4 = new JButton("서쪽버튼");
		JButton b5 = new JButton("중앙버튼");

		// 보더 레이아웃이 설정된 컨테이너에 컴포넌트를 붙일 때 방향을 설정할 수 있다
		f.add(b1, BorderLayout.NORTH);
		f.add(b2, BorderLayout.SOUTH);
		f.add(b3, BorderLayout.EAST);
		f.add(b4, BorderLayout.WEST);
		f.add(b5, BorderLayout.CENTER);

		// 기본 X버튼 동작이 눌렀을때 창을 사라지게만 함 (DISPOSE_ON_CLOSE)
		// 프로그램이 제대로 종료되게 하려면 EXIT_ON_CLOSE로 변경해야함
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(1000, 100);
		f.setSize(300, 300);
		f.setVisible(true);
	}
}

class GridLayoutExample {
	JFrame frameObj;

	// constructor
	GridLayoutExample() {
		frameObj = new JFrame();

		// creating 9 buttons
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");

		// adding buttons to the frame
		// since, we are using the parameterless constructor, therfore;
		// the number of columns is equal to the number of buttons we
		// are adding to the frame. The row count remains one.
		frameObj.add(btn1);
		frameObj.add(btn2);
		frameObj.add(btn3);
		frameObj.add(btn4);
		frameObj.add(btn5);
		frameObj.add(btn6);
		frameObj.add(btn7);
		frameObj.add(btn8);
		frameObj.add(btn9);

		// 보더 레이아웃이 아닌 다른 레이아웃은 컨테이너에 설정해줘야 한다
		// GridLayout은 행과 열의 크기를 설정할 수 있다
		frameObj.setLayout(new GridLayout(3, 3, 10, 20));

		frameObj.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frameObj.setLocation(400, 100);
		frameObj.setSize(300, 300);
		frameObj.setVisible(true);
	}

}

class FlowLayoutExample {

	JFrame frameObj;

	// constructor
	FlowLayoutExample() {
		// creating a frame object
		frameObj = new JFrame();

		// creating the buttons
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b10 = new JButton("10");
		JButton b11 = new JButton("11");

		// adding the buttons to frame
		frameObj.add(b1);
		frameObj.add(b2);
		frameObj.add(b3);
		frameObj.add(b4);
		frameObj.add(b5);
		frameObj.add(b6);
		frameObj.add(b7);
		frameObj.add(b8);
		frameObj.add(b9);
		frameObj.add(b10);
		frameObj.add(b11);

		// parameter less constructor is used
		// therefore, alignment is center
		// horizontal as well as the vertical gap is 5 units.
		frameObj.setLayout(new FlowLayout());

		frameObj.setLocation(700, 100);
		frameObj.setSize(300, 300);
		frameObj.setVisible(true);
	}

}

class GridBagLayoutDemo {
	final static boolean shouldFill = true;
	final static boolean shouldWeightX = true;
	final static boolean RIGHT_TO_LEFT = false;

	public static void addComponentsToPane(Container pane) {
		if (RIGHT_TO_LEFT) {
			pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		}

		JButton button;
		pane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		if (shouldFill) {
			//natural height, maximum width  
			c.fill = GridBagConstraints.HORIZONTAL;
		}

		button = new JButton("Button 1");
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		pane.add(button, c);

		button = new JButton("Button 2");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 0;
		pane.add(button, c);

		button = new JButton("Button 3");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 2;
		c.gridy = 0;
		pane.add(button, c);

		button = new JButton("Long-Named Button 4");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 40; // make this component tall
		c.weightx = 0.0;
		c.gridwidth = 3;
		c.gridx = 0;
		c.gridy = 1;
		pane.add(button, c);

		button = new JButton("5");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0; // reset to default
		c.weighty = 1.0; // request any extra vertical space
		c.anchor = GridBagConstraints.PAGE_END; // bottom of space
		c.insets = new Insets(10, 0, 0, 0); // top padding
		c.gridx = 1; // aligned with button 2
		c.gridwidth = 2; // 2 columns wide
		c.gridy = 2; // third row
		pane.add(button, c);
	}

	private static void createAndShowGUI() {
		//Create and set up the window.  
		JFrame frame = new JFrame("GridBagLayoutDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Set up the content pane.  
		addComponentsToPane(frame.getContentPane());

		//Display the window.  
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}