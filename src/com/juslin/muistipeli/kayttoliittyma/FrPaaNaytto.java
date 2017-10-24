package com.juslin.muistipeli.kayttoliittyma;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.juslin.tyokalut.GenericRoundedButton;
import com.juslin.tyokalut.MuistiPainike;

public class FrPaaNaytto extends JFrame implements ActionListener{

	private ArrayList<JButton> painikkeet = new ArrayList<JButton>();
	private JButton[][] painikeTaulukko = new JButton[8][8];
	
	public FrPaaNaytto() {
		setSize(400, 400);
		setLocation(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon("kuvat/icon.png");
		setIconImage(img.getImage());
		setTitle("Muistipeli");
		asetteleKomponentit();
	}
	
	public void asetteleKomponentit() {
		Container sisalto = this.getContentPane();
		sisalto.setLayout(new FlowLayout());
		int xKoordinaatit = 0;
		int yKoordinaatit = 0;
		for (int i = 0; i < 64; i++) {
			GenericRoundedButton btUusiPainike = new GenericRoundedButton("X");
			painikeTaulukko[xKoordinaatit][yKoordinaatit] =  btUusiPainike;
			xKoordinaatit++;
			if(xKoordinaatit == 7) {
				yKoordinaatit++;
				if(yKoordinaatit == 8) {
					sisalto.add(btUusiPainike);
					painikeTaulukko[7][7] = btUusiPainike;
					break;
				}
				xKoordinaatit = 0;
			}
			sisalto.add(btUusiPainike);
		}
	}
	
	public static void main(String[] args) {
		FrPaaNaytto naytto = new FrPaaNaytto();
		naytto.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
