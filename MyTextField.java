import javax.swing.*;
import java.awt.*;

public class MyTextField {
   public static void main(String args[]){
       JFrame frame = new JFrame("My First JFrame");
	   frame.setVisible(true);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setBounds(100, 100, 1000, 500);
	   frame.setTitle("My Frame");
	   Container c = frame.getContentPane();
	   c.setLayout(null);
	   
	   
	   JTextField t1 = new JTextField();
	   t1.setBounds(100, 50, 120, 30);
	   
	   t1.setText("shubham");
	   
	   Font font = new Font("Arial", Font.BOLD, 25);
	   t1.setFont(font);
	   t1.setBackground(Color.YELLOW);
	   t1.setForeground(Color.GREEN);
	   t1.setEditable(false);
	   c.add(t1);
	   
	   
	   
	   
   }
}   