import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartingWindow extends JPanel implements ActionListener,KeyListener
{
	public static void main(String[] args)
	{}
	JFrame window = new JFrame();
	JButton playButton = new JButton ();
	JButton exitButton = new JButton ();
	JLabel information = new JLabel ();
	JLabel help = new JLabel ();
	JLabel centerImageLabel = new JLabel();
	JButton backgroundButton = new JButton();
	StartingWindow() {
		Font customFont = new Font("Bold", Font.BOLD, 32);
		this.setBackground(Color.DARK_GRAY);
		this.setForeground(Color.DARK_GRAY);
		window.add(this);
		playButton.setBackground(Color.DARK_GRAY);
		playButton.setIcon(new ImageIcon("NewPlayButton.jpg"));
		playButton.addActionListener(this);
		playButton.addKeyListener(this);
		window.add(playButton, BorderLayout.PAGE_START);
		window.setSize(1000,750);
		window.setVisible(true);
		exitButton.setBackground(Color.DARK_GRAY);
		exitButton.setIcon(new ImageIcon("CloseButton.jpg"));
		exitButton.addActionListener(this);
		exitButton.addKeyListener(this);
		window.add(exitButton, BorderLayout.PAGE_END);
		information.setBackground(Color.DARK_GRAY);
		information.setForeground(Color.BLACK);
		window.add(information,BorderLayout.EAST);
		information.setFont(customFont);
		information.setText("WELCOME TO MONOPOLY (2 PLAYERS)");
		centerImageLabel.setBackground(Color.WHITE);
		centerImageLabel.setIcon(new ImageIcon("monopolystart.jpg"));
		window.add(centerImageLabel, BorderLayout.WEST);
		window.setLocation(50, 50);
		window.setUndecorated(true);
		window.setSize(650,500); 
		window.setVisible(true);
	}
	@Override
	public void keyPressed(KeyEvent kp) 
	{
		if (kp.getKeyCode() == KeyEvent.VK_ESCAPE);
			window.dispose();
		if(kp.getKeyCode() == KeyEvent.VK_ENTER)
		{
			window.dispose();
			Stages stages = new Stages();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0)
	{}

	@Override
	public void keyTyped(KeyEvent arg0) {}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == exitButton)
		{
			window.dispose();
		}
		else if(ae.getSource() == playButton)
		{
			window.dispose();
			Stages stages = new Stages();
		}
	}
}
