package com.jarroba.ejemplo.primeraMaven;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoBoton implements ActionListener {

	String botonSelect1;
	String botonSelect2;
	int click=0;
	
	public void actionPerformed(ActionEvent e) {
		click++;
		
		if(click==1) {
			System.out.println(1);
		}else if(click==2) {
			System.out.println(2);
			click=0;
		}
		
		//System.out.println(e.getActionCommand());
	}

}
