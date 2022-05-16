

/*
Programmer: Chris Hinshaw
Date: 5/15/22
Program Name: LaunchPage.java
Description: main page of quiz lets users decide which quiz to take
*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class LaunchPage implements ActionListener{

	JFrame frame = new JFrame();
	JLabel label = new JLabel("Welcome Please Pick A Quiz!");
	
	JButton myButton1 = new JButton("Fun");
	JButton myButton = new JButton("Educational");
	
	LaunchPage(){
		
label.setBounds(100,0,200,50);
		
		frame.add(label);
		
		myButton.setBounds(50,100,100,40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		
		
		
		frame.add(myButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	
		myButton1.setBounds(250,100,100,40);
		myButton1.setFocusable(false);
		myButton1.addActionListener(this);
		frame.add(myButton1);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		if(e.getSource()==myButton) {
		}
			Educational myWindow = new Educational();
	
		if(e.getSource()==myButton1) {
			
			Fun myWindow1 = new Fun();
			
		
		}
	
}

}