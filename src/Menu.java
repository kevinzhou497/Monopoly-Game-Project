


import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class Menu extends JFrame {

	private ImageIcon image;
	private JLabel label;
	private Player mover;
	private JButton name1;
	private JButton name2;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JButton yes;
	private JButton no;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JLabel label9;
	private JTextField tf1;
	private JTextField tf2;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button6;
	private JButton button5;
	private Player player1;
	private Player player2;
	private ArrayList<properties> monopoly;
	private JButton button4;
	private JMenu menu;
	private JMenuBar menubar;
	private JMenuItem menuitem1;
	private JMenuItem menuitem2;
	private JMenuItem menuitem3;
	private JMenuItem menuitem4;
	private JMenuItem menuitem5;
	private JMenuItem menuitem6;
	private JMenuItem menuitem7;
	private JMenuItem menuitem8;
	private JMenuItem menuitem9;
	private JMenuItem menuitem10;
	private JMenuItem menuitem11;
	private JMenuItem menuitem12;
	private JMenuItem menuitem13;
	private JMenuItem menuitem14;
	private JMenuItem menuitem15;
	private JMenuItem menuitem16;
	private JMenuItem menuitem17;
	private JMenuItem menuitem18;
	private JMenuItem menuitem19;
	private JMenuItem menuitem20;
	private JMenuItem menuitem21;
	private JMenuItem menuitem22;
	private String p1name;
	private String p2name;
	Menu() {
		p1name="";
		p2name="";
		setLayout(new FlowLayout());
		/*
		 * image=new
		 * ImageIcon(getClass().getResource("monopoly_photoshop_template.jpg"));
		 * label=new JLabel(image); add(label);
		 */     	 
		button1 = new JButton("BUY PROPERTY");// yup
		add(button1);
		button3 = new JButton("END TURN");// yup
		add(button3);
		button4 = new JButton("ROLL");// yup
		add(button4);
		button5 = new JButton("CHECK CARD STATS");
		add(button5);
		button6 = new JButton("VIEW PERSONAL CARDS");
		add(button6);

		buy y = new buy();
		button1.addActionListener(y);
		Endturn e = new Endturn();
		button3.addActionListener(e);
		Roll z = new Roll();
		button4.addActionListener(z);
		stats c = new stats();
		button5.addActionListener(c);
		cardCheck d = new cardCheck();
		button6.addActionListener(d);
		menubar = new JMenuBar();
		add(menubar);
		menu = new JMenu("BUILD HOUSE");
		menubar.add(menu);
		menuitem1 = new JMenuItem("MEDITERRANEAN AVENUE");
		menu.add(menuitem1);
		menuitem2 = new JMenuItem("BALTIC AVENUE");
		menu.add(menuitem2);
		menuitem3 = new JMenuItem("ORIENTAL AVENUE");
		menu.add(menuitem3);
		menuitem4 = new JMenuItem("VERMONT AVENUE");
		menu.add(menuitem4);
		menuitem5 = new JMenuItem("CONNECTICUT AVENUE");
		menu.add(menuitem5);
		menuitem6 = new JMenuItem("ST. CHARLES PLACE");
		menu.add(menuitem6);
		menuitem7 = new JMenuItem("STATES AVENUE");
		menu.add(menuitem7);
		menuitem8 = new JMenuItem("VIRGINIA AVENUE");
		menu.add(menuitem8);
		menuitem9 = new JMenuItem("ST. JAMES PLACE");
		menu.add(menuitem9);
		menuitem10 = new JMenuItem("TENNESSEE AVENUE");
		menu.add(menuitem10);
		menuitem11 = new JMenuItem("NEW YORK AVENUE");
		menu.add(menuitem11);
		menuitem12 = new JMenuItem("KENTUCKY AVENUE");
		menu.add(menuitem12);
		menuitem13 = new JMenuItem("INDIANA AVENUE");
		menu.add(menuitem13);
		menuitem14 = new JMenuItem("ILLINOIS AVENUE");
		menu.add(menuitem14);
		menuitem15 = new JMenuItem("ATLANTIC AVENUE");
		menu.add(menuitem15);
		menuitem16 = new JMenuItem("VENTNOR AVENUE");
		menu.add(menuitem16);
		menuitem17 = new JMenuItem("MARVIN GARDENS");
		menu.add(menuitem17);
		menuitem18 = new JMenuItem("PACIFIC AVENUE");
		menu.add(menuitem18);
		menuitem19 = new JMenuItem("NORTH CAROLINA AVENUE");
		menu.add(menuitem19);
		menuitem20 = new JMenuItem("PENNSYLVANIA AVENUE");
		menu.add(menuitem20);
		menuitem21 = new JMenuItem("PARKPLACE");
		menu.add(menuitem21);
		menuitem22 = new JMenuItem("BOARDWALK");
		menu.add(menuitem22);
		housebuyer1 f1 = new housebuyer1();
		housebuyer2 f2 = new housebuyer2();
		housebuyer3 f3 = new housebuyer3();
		housebuyer4 f4 = new housebuyer4();
		housebuyer5 f5 = new housebuyer5();
		housebuyer6 f6 = new housebuyer6();
		housebuyer7 f7 = new housebuyer7();
		housebuyer8 f8 = new housebuyer8();
		housebuyer9 f9 = new housebuyer9();
		housebuyer10 f10 = new housebuyer10();
		housebuyer11 f11 = new housebuyer11();
		housebuyer12 f12 = new housebuyer12();
		housebuyer13 f13 = new housebuyer13();
		housebuyer14 f14 = new housebuyer14();
		housebuyer15 f15 = new housebuyer15();
		housebuyer16 f16 = new housebuyer16();
		housebuyer17 f17 = new housebuyer17();
		housebuyer18 f18 = new housebuyer18();
		housebuyer19 f19 = new housebuyer19();
		housebuyer20 f20 = new housebuyer20();
		housebuyer21 f21 = new housebuyer21();
		housebuyer22 f22 = new housebuyer22();

		menuitem1.addActionListener(f1);
		menuitem2.addActionListener(f2);
		menuitem3.addActionListener(f3);
		menuitem4.addActionListener(f4);
		menuitem5.addActionListener(f5);
		menuitem6.addActionListener(f6);
		menuitem7.addActionListener(f7);
		menuitem8.addActionListener(f8);
		menuitem9.addActionListener(f9);
		menuitem10.addActionListener(f10);
		menuitem11.addActionListener(f11);
		menuitem12.addActionListener(f12);

		menuitem13.addActionListener(f13);
		menuitem14.addActionListener(f14);
		menuitem15.addActionListener(f15);
		menuitem16.addActionListener(f16);
		menuitem17.addActionListener(f17);
		menuitem18.addActionListener(f18);
		menuitem19.addActionListener(f19);
		menuitem20.addActionListener(f20);
		menuitem21.addActionListener(f21);
		menuitem22.addActionListener(f22);

		label2 = new JLabel("");
		add(label2);
		label3 = new JLabel("");
		add(label3);
		label6 = new JLabel("");
		add(label6);
		label7 = new JLabel("");
		add(label7);
		label8 = new JLabel("");
		add(label8);

	}
	public class name implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			p2name=tf2.getText(); 	 
		}
	}
	public class names implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			p1name=tf1.getText(); }
	}

	public void initializeMonopoly() {
		monopoly = new ArrayList<properties>();
		properties MEDITERRANEANAVENUE = new properties("MEDITERRANEAN AVENUE", "Brown", 2, 10, 30, 60, 50, 0,0);
		properties BALTICAVENUE = new properties("BALTIC AVENUE", "Brown", 4, 20, 60, 60, 50, 0,0);
		properties ORIENTALAVENUE = new properties("ORIENTAL AVENUE", "Light Blue", 6, 30, 90, 100, 50, 0,0);
		properties VERMONTAVENUE = new properties("VERMONT AVENUE", "Light Blue", 6, 30, 90, 100, 50, 0,0);
		properties CONNECTICUTAVENUE = new properties("CONNECTICUT AVENUE", "Light Blue", 8, 40, 100, 120, 50, 0,0);
		properties STCHARLESPLACE = new properties("ST. CHARLES PLACE", "Pink", 10, 50, 150, 140, 100, 0,0);
		properties STATESAVENUE = new properties("STATES AVENUE", "Pink", 10, 50, 150, 140, 100, 0,0);
		properties VIRGINIAAVENUE = new properties("VIRGINIA AVENUE", "Pink", 12, 60, 180, 160, 100, 0,0);
		properties STJAMESPLACE = new properties("ST. JAMES PLACE", "Orange", 14, 70, 200, 180, 100, 0,0);
		properties TENNESSEEAVENUE = new properties("TENNESSEE AVENUE", "Orange", 14, 70, 200, 180, 100, 0,0);
		properties NEWYORKAVENUE = new properties("NEW YORK AVENUE", "Orange", 16, 80, 220, 200, 100, 0,0);
		properties KENTUCKYAVENUE = new properties("KENTUCKY AVENUE", "Red", 18, 90, 250, 220, 150, 0,0);
		properties INDIANAAVENUE = new properties("INDIANA AVENUE", "Red", 18, 90, 250, 220, 150, 0,0);
		properties ILLINOISAVENUE = new properties("ILLINOIS AVENUE", "Red", 20, 100, 300, 240, 150, 0,0);
		properties ATLANTICAVENUE = new properties("ATLANTIC AVENUE", "Yellow", 22, 110, 330, 260, 150, 0,0);
		properties VENTNORAVENUE = new properties("VENTNOR AVENUE", "Yellow", 22, 110, 330, 260, 150, 0,0);
		properties MARVINGARDENS = new properties("MARVIN GARDENS", "Yellow", 24, 120, 360, 280, 150, 0,0);
		properties PACIFICAVENUE = new properties("PACIFIC AVENUE", "Green", 26, 130, 390, 300, 200, 0,0);
		properties NORTHCAROLINAAVENUE = new properties("NORTH CAROLINA AVENUE", "Green", 26, 130, 390, 300, 200, 0,0);
		properties PENNSYLVANIAAVENUE = new properties("PENNSYLVANIA AVENUE", "Green", 28, 150, 450, 320, 200, 0,0);
		properties PARKPLACE = new properties("PARK PLACE", "Blue", 35, 175, 500, 350, 200, 0,0);
		properties BOARDWALK = new properties("BOARDWALK", "Blue", 50, 200, 600, 400, 200, 0,0);
		properties GO= new properties("GO", 0);
		properties chance= new properties("CHANCE... BREAK A LEG, LOSE 100", -100);
		properties incometax= new properties("INCOME TAX...LOSE 200", -200);
		properties chance1= new properties("CHANCE...WIN TALENT SHOW, GAIN 100", 100);
		properties justvisiting= new properties("JUST VISITING JAIL", 0);
		properties chance2= new properties("CHANCE... GET ARRESTED, PAY BAIL, LOSE 500",-500);
		properties freeparking= new properties("FREE PARKING...GAIN 200", 200);
		properties chance3= new properties("CHANCE...FIND 50 DOLLARS ON THE STREET", 50);
		properties jail= new properties ("JAIL... SKIP 2 TURNS",0);    
		properties chance4= new properties("CHANCE... TAKE A TRIP ON A RAILROAD, LOSE 200", -200);
		properties chance5= new properties("CHANCE... GET A JOB, GAIN 75 DOLLARS", 75);
		properties luxurytax= new properties("LUXURY TAX...LOSE 100", -100);
		monopoly.add(GO);
		monopoly.add(MEDITERRANEANAVENUE);
		monopoly.add(chance);
		monopoly.add(BALTICAVENUE);
		monopoly.add(incometax);
		monopoly.add(ORIENTALAVENUE);
		monopoly.add(chance1);
		monopoly.add(VERMONTAVENUE);
		monopoly.add(CONNECTICUTAVENUE);
		monopoly.add(justvisiting);
		monopoly.add(STCHARLESPLACE);
		monopoly.add(STATESAVENUE);
		monopoly.add(VIRGINIAAVENUE);
		monopoly.add(STJAMESPLACE);
		monopoly.add(chance2);
		monopoly.add(TENNESSEEAVENUE);
		monopoly.add(NEWYORKAVENUE);
		monopoly.add(freeparking);
		monopoly.add(KENTUCKYAVENUE);
		monopoly.add(chance3);
		monopoly.add(INDIANAAVENUE);
		monopoly.add(ILLINOISAVENUE);
		monopoly.add(ATLANTICAVENUE);
		monopoly.add(VENTNORAVENUE);
		monopoly.add(MARVINGARDENS);
		monopoly.add(jail);
		monopoly.add(PACIFICAVENUE);
		monopoly.add(NORTHCAROLINAAVENUE);
		monopoly.add(chance4);
		monopoly.add(PENNSYLVANIAAVENUE);
		monopoly.add(chance5);
		monopoly.add(PARKPLACE);
		monopoly.add(luxurytax);
		monopoly.add(BOARDWALK);
	}

	public class stats implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (mover.getname().equals(player1.getname()))
				label7.setText("Name: " + monopoly.get(player1.getplace()).getname() + " Cost:"
						+ monopoly.get(player1.getplace()).getprice() + " Rent: "
						+ monopoly.get(player1.getplace()).getrent() + " House Cost:"
						+ monopoly.get(player1.getplace()).gethouseprice() + " Rent With House: "
						+ monopoly.get(player1.getplace()).gethouserent() + " Hotel Rent: "
						+ monopoly.get(player1.getplace()).gethotelrent());
			if (mover.getname().equals(player2.getname()))
				label7.setText("Name: " + monopoly.get(player2.getplace()).getname() + " Cost:"
						+ monopoly.get(player2.getplace()).getprice() + " Rent: "
						+ monopoly.get(player2.getplace()).getrent() + " House Cost:"
						+ monopoly.get(player2.getplace()).gethouseprice() + " Rent With House:"
						+ monopoly.get(player2.getplace()).gethouserent() + " Hotel Rent:"
						+ monopoly.get(player2.getplace()).gethotelrent());

		}

	}


	public class cardCheck implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String result = "";
			for (properties a : mover.getcards())
				result = result + " " + a.getname() + " " + a.getcolor();
			label8.setText(result);
		}
	}

	public class housebuyer1 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String result = menuitem1.getText();

			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());
				}
			}
		}
	}

	public class housebuyer2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String result = menuitem2.getText();
			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());
				}
			}
		}
	}

	public class housebuyer3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String result = menuitem3.getText();
			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());
				}
			}
		}
	}

	public class housebuyer4 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String result = menuitem4.getText();

			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());
				}
			}
		}
	}

	public class housebuyer5 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String result = menuitem5.getText();
			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());
				}
			}
		}
	}

	public class housebuyer6 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String result = menuitem6.getText();

			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());

				}
			}
		}
	}

	public class housebuyer7 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String result = menuitem7.getText();

			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());

				}
			}
		}
	}

	public class housebuyer8 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String result = menuitem8.getText();

			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());

				}
			}
		}
	}

	public class housebuyer9 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String result = menuitem9.getText();

			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());

				}
			}
		}
	}

	public class housebuyer10 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String result = menuitem10.getText();

			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());

				}
			}
		}
	}

	public class housebuyer11 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String result = menuitem11.getText();

			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());

				}
			}
		}
	}

	public class housebuyer12 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String result = menuitem12.getText();

			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());

				}
			}
		}
	}

	public class housebuyer13 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String result = menuitem13.getText();

			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());

				}
			}
		}
	}

	public class housebuyer14 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String result = menuitem14.getText();

			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());

				}
			}
		}
	}

	public class housebuyer15 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String result = menuitem15.getText();

			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());

				}
			}
		}
	}

	public class housebuyer16 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String result = menuitem16.getText();

			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());

				}
			}
		}
	}

	public class housebuyer17 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String result = menuitem17.getText();

			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());

				}
			}
		}
	}

	public class housebuyer18 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String result = menuitem18.getText();

			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());

				}
			}
		}
	}

	public class housebuyer19 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String result = menuitem19.getText();

			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());

				}
			}
		}
	}

	public class housebuyer20 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String result = menuitem20.getText();

			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());

				}
			}
		}
	}

	public class housebuyer21 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String result = menuitem21.getText();

			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());

				}
			}
		}
	}

	public class housebuyer22 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String result = menuitem22.getText();

			for (properties a : monopoly) {
				if (result.equals(a.getname())) {
					if (a.getrent() != a.gethouserent())
						a.setrent(a.gethouserent());
					else
						a.setrent(a.gethotelrent());
					if (mover.getname().equals(player1.getname()))
						player1.setbalance(player1.getbalance() - a.gethouseprice());
					else
						player2.setbalance(player2.getbalance() - a.gethouseprice());

				}
			}
		}
	}

	public class Roll implements ActionListener {


		public void actionPerformed(ActionEvent e) {
			label6.setText("");
			label7.setText("");
			label8.setText("");
			if (mover.getname().equals(player1.getname())) {
				int newplace = player1.getplace() + diceroller();
				if (newplace >= monopoly.size()) {

					newplace = newplace - monopoly.size();
					player1.setbalance(player1.getbalance() + 200);

				}
				player1.setplace(newplace);
				if(monopoly.get(newplace).lookatbalancechanger()!=0)
					player1.setbalance(player1.getbalance()+monopoly.get(newplace).lookatbalancechanger());

				label6.setText(player1.getname() + " (balance: " + player1.getbalance() + ") lands on "
						+ monopoly.get(player1.getplace()).getname());
				if (monopoly.get(player1.getplace()).getownership() == 1
						&& player2.containscard(monopoly.get(player1.getplace())) == true) {
					player1.setbalance(player1.getbalance() - monopoly.get(player1.getplace()).getrent());
					player2.setbalance(player2.getbalance() + monopoly.get(player1.getplace()).getrent());
					label7.setText("You Paid");
				} else if (monopoly.get(player1.getplace()).getownership() == 1
						&& player1.containscard(monopoly.get(player1.getplace())) == true) {
					label7.setText("You already own it");
				}

			} else if (mover.getname().equals(player2.getname())) {
				int newplace = player2.getplace() + diceroller();
				if (newplace >= monopoly.size()) {

					newplace = newplace - monopoly.size();
					player2.setbalance(player2.getbalance() + 200);

				}
				player2.setplace(newplace);
				if(monopoly.get(newplace).lookatbalancechanger()!=0)
					player2.setbalance(player2.getbalance()+monopoly.get(newplace).lookatbalancechanger());
				label6.setText(player2.getname() + " (balance:" + player2.getbalance() + ") lands on "
						+ monopoly.get(player2.getplace()).getname());
				if (monopoly.get(player2.getplace()).getownership() == 1
						&& player1.containscard(monopoly.get(player1.getplace())) == true) {
					player2.setbalance(player2.getbalance() - monopoly.get(player2.getplace()).getrent());
					player1.setbalance(player1.getbalance() + monopoly.get(player2.getplace()).getrent());
					label7.setText("You Paid");
				} else if (monopoly.get(player2.getplace()).getownership() == 1
						&& player2.containscard(monopoly.get(player2.getplace())) == true) {
					label7.setText("You already own it");
				}

			}
		}
	}

	public class Endturn implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (mover.getname().equals(player1.getname())) {
				mover.playerCopier(player2);
				label6.setText(player2.getname() + ":");
			} else if (mover.getname().equals(player2.getname())) {
				mover.playerCopier(player1);
				label6.setText(player1.getname() + ":");
			}
			if(player1.getbalance()<=0) {

				label6.setText("");
				label7.setText("");
				label8.setText("");

				label6.setText("PLAYER B WINS");
			}
			else if(player2.getbalance()<=0) {
				label6.setText("");
				label7.setText("");
				label8.setText("");
				label6.setText("PLAYER A WINS");
			}

			label7.setText("");
			label8.setText("");
		}
	}

	public class buy implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (mover.getname().equals(player1.getname())) {

				if (monopoly.get(player1.getplace()).getownership() == 0) {
					monopoly.get(player1.getplace()).setownership(1);
					player1.cardadder(monopoly.get(player1.getplace()));
					player1.setbalance(player1.getbalance() - monopoly.get(player1.getplace()).getprice());


				}

			} else if (mover.getname().equals(player2.getname())) {

				if (monopoly.get(player2.getplace()).getownership() == 0) {
					monopoly.get(player2.getplace()).setownership(1);
					player2.cardadder(monopoly.get(player2.getplace()));
					player2.setbalance(player2.getbalance() - monopoly.get(player2.getplace()).getprice());


				}

			}

		}
	}

	public void initializeplayers() {
		player1 = new Player();

		player2 = new Player();
		player1.setname("A");
		player2.setname("B");
		mover = new Player();
		mover.playerCopier(player1);
	}

	public static void main(String args[]) {

		Menu gui = new Menu();
		gui.initializeplayers();
		gui.initializeMonopoly();
		gui.setVisible(true);

		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		gui.setSize(1600, 2400);
		gui.setTitle("Monopoly");


	}

	public static int diceroller() {
		Random roll = new Random();
		int roll1 = roll.nextInt(6) + 1;
		int roll2 = roll.nextInt(6) + 1;

		return roll1 + roll2;
	}


	public static void buyinghouse(ArrayList<properties> monopoly, Player player) {
		if (player.monopolychecker("Brown") == true) {

		}
		if (player.monopolychecker("Brown") == true) {
			System.out.println("You Have a brown monopoly. Do you want to buy a house?");
			for (properties b : monopoly) {
				if (b.getcolor().compareTo("Brown") == 0) {
					int sum = 1;
					System.out.println("Option " + sum + ": " + b.getname() + "\nHouse rent: " + b.gethouserent()
					+ "\nHouse price: " + b.gethouseprice());
					sum++;
				}
			}
		}

		if (player.monopolychecker("Light Blue") == true) {
			System.out.println("You Have a light blue monopoly. Do you want to buy a house?");
			for (properties b : monopoly) {
				if (b.getcolor().compareTo("Light Blue") == 0) {
					int sum = 1;
					System.out.println("Option " + sum + ": " + b.getname() + "\nHouse rent: " + b.gethouserent()
					+ "\nHouse price: " + b.gethouseprice());
					sum++;
				}
			}
		}
		if (player.monopolychecker("Pink") == true) {
			System.out.println("You Have a pink monopoly. Do you want to buy a house?");
			for (properties b : monopoly) {
				if (b.getcolor().compareTo("Pink") == 0) {
					int sum = 1;
					System.out.println("Option " + sum + ": " + b.getname() + "\nHouse rent: " + b.gethouserent()
					+ "\nHouse price: " + b.gethouseprice());
					sum++;
				}
			}
		}
		if (player.monopolychecker("Orange") == true) {
			System.out.println("You Have a orange monopoly. Do you want to buy a house?");
			for (properties b : monopoly) {
				if (b.getcolor().compareTo("Orange") == 0) {
					int sum = 1;
					System.out.println("Option " + sum + ": " + b.getname() + "\nHouse rent: " + b.gethouserent()
					+ "\nHouse price: " + b.gethouseprice());
					sum++;
				}
			}
		}
		if (player.monopolychecker("Red") == true) {
			System.out.println("You Have a red monopoly. Do you want to buy a house?");
			for (properties b : monopoly) {
				if (b.getcolor().compareTo("Red") == 0) {
					int sum = 1;
					System.out.println("Option " + sum + ": " + b.getname() + "\nHouse rent: " + b.gethouserent()
					+ "\nHouse price: " + b.gethouseprice());
					sum++;
				}
			}
		}
		if (player.monopolychecker("Yellow") == true) {
			System.out.println("You Have a yellow monopoly. Do you want to buy a house?");
			for (properties b : monopoly) {
				if (b.getcolor().compareTo("Yellow") == 0) {
					int sum = 1;
					System.out.println("Option " + sum + ": " + b.getname() + "\nHouse rent: " + b.gethouserent()
					+ "\nHouse price: " + b.gethouseprice());
					sum++;
				}
			}
		}
		if (player.monopolychecker("Green") == true) {
			System.out.println("You Have a green monopoly. Do you want to buy a house?");
			for (properties b : monopoly) {
				if (b.getcolor().compareTo("Green") == 0) {
					int sum = 1;
					System.out.println("Option " + sum + ": " + b.getname() + "\nHouse rent: " + b.gethouserent()
					+ "\nHouse price: " + b.gethouseprice());
					sum++;
				}
			}
		}
		if (player.monopolychecker("Blue") == true) {
			System.out.println("You Have a blue monopoly. Do you want to buy a house?");
			for (properties b : monopoly) {
				if (b.getcolor().compareTo("Blue") == 0) {
					int sum = 1;
					System.out.println("Option " + sum + ": " + b.getname() + "\nHouse rent: " + b.gethouserent()
					+ "\nHouse price: " + b.gethouseprice());
					sum++;
				}
			}
		}

	}

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.WHITE);
		g.fillRect(50, 100, 50, 50);
		g.setColor(Color.RED);
		g.fillRect(100, 100, 50, 50);
		g.setColor(Color.WHITE);
		g.fillRect(150, 100, 50, 50);
		g.setColor(Color.RED);
		g.fillRect(200, 100, 50, 50);
		g.setColor(Color.RED);
		g.fillRect(250, 100, 50, 50);
		g.setColor(Color.GRAY);
		g.fillRect(300, 100, 50, 50);
		g.setColor(Color.YELLOW);
		g.fillRect(350, 100, 50, 50);
		g.setColor(Color.YELLOW);
		g.fillRect(400, 100, 50, 50);
		g.setColor(Color.WHITE);
		g.fillRect(450, 100, 50, 50);
		g.setColor(Color.YELLOW);
		g.fillRect(500, 100, 50, 50);
		g.setColor(Color.WHITE);
		g.fillRect(550, 100, 50, 50);
		g.setColor(Color.GREEN);
		g.fillRect(550, 150, 50, 50);
		g.setColor(Color.GREEN);
		g.fillRect(550, 200, 50, 50);
		g.setColor(Color.WHITE);
		g.fillRect(550, 250, 50, 50);
		g.setColor(Color.GREEN);
		g.fillRect(550, 300, 50, 50);
		g.setColor(Color.GRAY);
		g.fillRect(550, 350, 50, 50);
		g.setColor(Color.WHITE);
		g.fillRect(550, 400, 50, 50);
		g.setColor(Color.BLUE);
		g.fillRect(550, 450, 50, 50);
		g.setColor(Color.WHITE);
		g.fillRect(550, 500, 50, 50);
		g.setColor(Color.BLUE);
		g.fillRect(550, 550, 50, 50);
		g.setColor(Color.WHITE);
		g.fillRect(550, 600, 50, 50);
		Color brown = new Color(101, 67, 33);
		g.setColor(brown);
		g.fillRect(500, 600, 50, 50);
		g.setColor(Color.WHITE);
		g.fillRect(450, 600, 50, 50);
		g.setColor(brown);
		g.fillRect(400, 600, 50, 50);
		g.setColor(Color.WHITE);
		g.fillRect(350, 600, 50, 50);
		g.setColor(Color.GRAY);
		g.fillRect(300, 600, 50, 50);
		g.setColor(Color.CYAN);
		g.fillRect(250, 600, 50, 50);
		g.setColor(Color.WHITE);
		g.fillRect(200, 600, 50, 50);
		g.setColor(Color.CYAN);
		g.fillRect(150, 600, 50, 50);
		g.setColor(Color.CYAN);
		g.fillRect(100, 600, 50, 50);
		g.setColor(Color.WHITE);
		g.fillRect(50, 600, 50, 50);
		g.setColor(Color.MAGENTA);
		g.fillRect(50, 550, 50, 50);
		g.setColor(Color.WHITE);
		g.fillRect(50, 500, 50, 50);
		g.setColor(Color.MAGENTA);
		g.fillRect(50, 450, 50, 50);
		g.setColor(Color.MAGENTA);
		g.fillRect(50, 400, 50, 50);
		g.setColor(Color.GRAY);
		g.fillRect(50, 350, 50, 50);
		g.setColor(Color.ORANGE);
		g.fillRect(50, 300, 50, 50);
		g.setColor(Color.WHITE);
		g.fillRect(50, 250, 50, 50);
		g.setColor(Color.ORANGE);
		g.fillRect(50, 200, 50, 50);
		g.setColor(Color.ORANGE);
		g.fillRect(50, 150, 50, 50);
	}
}






