package com.juslin.tyokalut;

import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

import javax.jws.soap.SOAPBinding.Style;
import javax.swing.JButton;

public class GenericRoundedButton extends JButton implements FocusListener {

	public GenericRoundedButton(String text) {
		super(text);
		addFocusListener(this);
	}

	public GenericRoundedButton() {
		super();
	}

	public void paint(Graphics g) {
		// Set background same as parent.
		setBackground(getParent().getBackground());
		//setBorder(Styles.BORDER_NONE);

		// I don't need this -- calls to above methods will
		// invoke repaint as needed.
		// super.paint(g);

		// Take advantage of Graphics2D to position string
		Graphics2D g2d = (Graphics2D) g;

		// Make it grey #DDDDDD, and make it round with
		// 1px black border.
		// Use an HTML color guide to find a desired color.
		// Last color is alpha, with max 0xFF to make
		// completely opaque.
		g2d.setColor(new Color(0xDD, 0xDD, 0xDD, 0xFF));

		// Draw rectangle with rounded corners on top of
		// button
		g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 18, 18);

		// I'm just drawing a border
		g2d.setColor(Color.BLACK);
		g2d.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 18, 18);

		// Finding size of text so can position in center.
		FontRenderContext frc = new FontRenderContext(null, false, false);
		Rectangle2D r = getFont().getStringBounds(getText(), frc);

		float xMargin = (float) (getWidth() - r.getWidth()) / 2;
		float yMargin = (float) (getHeight() - getFont().getSize()) / 2;

		// Draw the text in the center
		g2d.drawString(getText(), xMargin, (float) getFont().getSize() + yMargin);
		addFocusListener(this);
	}
	
	
	@Override
	public boolean lostFocus(Event evt, Object what) {
		// TODO Auto-generated method stub
		return super.lostFocus(evt, what);
	}

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("Nyt tuli fokus!!!");
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("Nyt meni fokus!!!");
		
	}
	
	
}
