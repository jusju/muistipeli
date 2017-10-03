package com.juslin.tyokalut;

import javax.swing.JButton;

public class MuistiPainike extends JButton {
	private int x;
	private int y;

	public MuistiPainike(String x) {
		super(x);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
