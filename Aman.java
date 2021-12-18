package mypack;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;    
public  class Aman {
	private static JTextField txtName;  
	private static JTextField textField;
public static void main(String[] args) {  
    JFrame f=new JFrame("Button Example");  
    f.setTitle("Java Swing\r\n");
    f.setBackground(Color.CYAN);
    f.getContentPane().setForeground(new Color(204, 255, 102));
    f.getContentPane().setBackground(Color.ORANGE);
    JButton b=new JButton("Submit\r\n");  
    b.setBackground(new Color(102, 255, 0));
    b.setFont(new Font("Tahoma", Font.BOLD, 11));
    b.setForeground(new Color(153, 51, 0));
    b.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    	}
    });
    b.setBounds(140,162,95,30);  
    f.getContentPane().add(b);  
    f.setSize(400,400);  
    f.getContentPane().setLayout(null);  
    
    txtName = new JTextField();
    txtName.setForeground(new Color(0, 0, 0));
    txtName.setToolTipText("dwf");
    txtName.setBounds(198, 64, 86, 20);
    f.getContentPane().add(txtName);
    txtName.setColumns(10);
    
    JLabel lblNewLabel = new JLabel("Fistsname");
    lblNewLabel.setBounds(92, 67, 71, 14);
    f.getContentPane().add(lblNewLabel);
    
    JLabel lblLastname = new JLabel("Lastname");
    lblLastname.setBounds(92, 118, 46, 14);
    f.getContentPane().add(lblLastname);
    
    textField = new JTextField();
    textField.setBounds(198, 115, 86, 20);
    f.getContentPane().add(textField);
    textField.setColumns(10);
    f.setVisible(true);   
}  
}