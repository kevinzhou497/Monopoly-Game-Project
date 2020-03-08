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
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class Stages extends JPanel implements ActionListener, KeyListener
{
	public static void main(String[] args)
	{

	}
	JFrame window = new JFrame();
	JComboBox Stages = new JComboBox();
	String[] string = {"Rules, Game"};
	JButton enterButton = new JButton();
	JButton backButton = new JButton();
	JButton characters = new JButton();
	JButton rules = new JButton();
	JButton names = new JButton();

	Font customFont = new Font("Bold", Font.BOLD, 28);
	Font comboFont = new Font("Italic", Font.ITALIC, 25);

	Stages()
	{
		this.setBackground(Color.BLACK);
		window.add(this);

		rules.setFont(customFont);
		rules.setText("Rules");
		rules.addKeyListener(this);
		rules.addActionListener(this);
		rules.setForeground(Color.BLACK);
		rules.setBackground(Color.LIGHT_GRAY);
		window.add(rules, BorderLayout.WEST);

		backButton.setFont(customFont);
		backButton.setText("Back");
		backButton.setForeground(Color.BLACK);
		backButton.setBackground(Color.LIGHT_GRAY);
		backButton.addKeyListener(this);
		backButton.addActionListener(this);

		window.add(backButton, BorderLayout.PAGE_END);

		enterButton.setIcon(new ImageIcon("StartGame.jpg"));
		enterButton.addKeyListener(this);
		enterButton.addActionListener(this);
		window.add(enterButton, BorderLayout.EAST);


		window.setSize(650, 500);
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
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == backButton)
		{
			window.dispose();
			StartingWindow  sw = new StartingWindow();
		}
		else if (ae.getSource() == enterButton)
		{
			window.dispose();
			Menu gui = new Menu();
			gui.initializeplayers();
			gui.initializeMonopoly();
			gui.setVisible(true);

			gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			gui.setSize(1600, 2400);
			gui.setTitle("Monopoly");
		}
		else if (ae.getSource() == rules)
		{
			window.dispose();
			Rules rules = new Rules ();
		}
		else if (ae.getSource() == names)
		{
			window.dispose();
		
		}

	}


}
