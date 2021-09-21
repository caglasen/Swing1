import java.awt.event.*;  
import javax.swing.*;  

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f=new JFrame("Button Example");  
	    final JTextField tf=new JTextField();  
	    tf.setBounds(50,50, 150,20);  
	    JButton b=new JButton("Click Here");  
	    b.setBounds(50,100,95,30);  
	    b.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            tf.setText("Welcome to Javatpoint.");  
	        }  
	    });  
	    f.add(b); 
	    f.add(tf);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    
	    JLabel label1 = new JLabel("First label.");
	    
	    JLabel label2 = new JLabel("Second label.");
	    label1.setBounds(50, 50, 200, 50);
	    label2.setBounds(150, 50, 200, 50);
	    f.add(label1);
	    f.add(label2);
	    
	    f.setVisible(true);  
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    
	    
	}

}
