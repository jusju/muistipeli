package com.juslin.muistipeli.kayttoliittyma;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrPaaNaytto extends JFrame implements ActionListener{

	private ArrayList<JButton> kortit = new ArrayList<JButton>();
	private JButton btKortti = null;
	private JPanel paKortit = new JPanel(new GridLayout(6,6));
	
	public FrPaaNaytto() {
		setSize(600, 600);
		setLocation(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon("kuvat/icon.png");
		setIconImage(img.getImage());
		setTitle("Muistipeli");
		for (int i = 0; i < 36; i++) {
			btKortti = new JButton();
			btKortti.addActionListener(this);
			kortit.add(btKortti);
		}
		
		setResizable(false);
		setVisible(true);
		asetteleKomponentit();
	}
	
	public void asetteleKomponentit() {
		Container sisalto = this.getContentPane();
		sisalto.setLayout(new BorderLayout());
		
		for (int i = 0; i < kortit.size(); i++) {
			paKortit.add(kortit.get(i));
		}
		sisalto.add(paKortit);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
				
	}
	
	public static void main(String[] args) {
		FrPaaNaytto naytto = new FrPaaNaytto();
	}

}
