package com.jarroba.ejemplo.primeraMaven;

import javax.swing.JToggleButton;

public class Cartas extends JToggleButton {

	private int pocision;

	public Cartas(int pocision) {
		super();
		this.pocision = pocision;
	}

	public int getPocision() {
		return pocision;
	}

	public void setPocision(int pocision) {
		this.pocision = pocision;
	}
	
	
	
	
	
}
