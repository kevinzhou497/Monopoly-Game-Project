import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class Rules extends JPanel implements ActionListener, KeyListener
{
	public static void main(String[] args)
	{}
	JFrame window = new JFrame();
	JLabel information = new JLabel ();
	JLabel information2 = new JLabel ();
	JLabel information3 = new JLabel ();
	JLabel information4 = new JLabel ();
	JButton backButton = new JButton();
	Font customFont = new Font("Bold", Font.BOLD, 20);
	Font comboFont = new Font("Italic", Font.ITALIC, 25);
	
	Rules()
	{
		this.setBackground(Color.BLACK);
		window.add(this);
		backButton.setFont(customFont);
		backButton.setText("Back");
		backButton.setForeground(Color.BLACK);
		backButton.setBackground(Color.LIGHT_GRAY);
		backButton.addKeyListener(this);
		backButton.addActionListener(this);
		window.add(backButton, BorderLayout.EAST);
		information.setBackground(Color.DARK_GRAY);
		information.setForeground(Color.BLACK);
		information.setFont(customFont);
		window.add(information,BorderLayout.PAGE_START);
		information.setText("The rules are the same as normal Monopoly rules with a few exceptions: ");
		information2.setBackground(Color.DARK_GRAY);
		information2.setForeground(Color.BLACK);
		information2.setFont(customFont);
		window.add(information2,BorderLayout.PAGE_END);
		information2.setText("3: You can own a maximum of 2 houses. (2 house rent) = (hotel rent in the normal game)");
		information3.setBackground(Color.DARK_GRAY);
		information3.setForeground(Color.BLACK);
		information3.setFont(customFont);
		window.add(information3,BorderLayout.WEST);
		information3.setText("1: If you land on jail, just skip your next turn");
		information4.setBackground(Color.DARK_GRAY);
		information4.setForeground(Color.BLACK);
		information4.setFont(customFont);
		window.add(information4,BorderLayout.CENTER);
		information4.setText("     2: There is no trading of properties");
		window.setSize(900, 700);
		window.setLocation(50, 50);
		window.setVisible(true);
	}
	@Override
	public void keyPressed(KeyEvent kp) {
		// TODO Auto-generated method stub
		if (kp.getKeyCode() == KeyEvent.VK_ESCAPE)
		{
			window.dispose();
			StartingWindow sw = new StartingWindow();
		}

	} 

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == backButton)
		{
			window.dispose();
			Stages sw = new Stages();
		}
	}


}
