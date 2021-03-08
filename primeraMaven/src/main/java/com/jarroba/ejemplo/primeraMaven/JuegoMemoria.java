package com.jarroba.ejemplo.primeraMaven;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.GridLayout;

public class JuegoMemoria extends JFrame {

	private JPanel contentPane;
	static Cartas Button_0 = new Cartas(1);
	static Cartas Button_1 = new Cartas(1);
	static Cartas Button_2 = new Cartas(2);
	static Cartas Button_3 = new Cartas(2);
	static Cartas Button_4 = new Cartas(3);
	static Cartas Button_5 = new Cartas(3);
	static Cartas Button_6 = new Cartas(4);
	static Cartas Button_7 = new Cartas(4);
	static Cartas Button_8 = new Cartas(5);
	static Cartas Button_9 = new Cartas(5);
	static Cartas Button_10 = new Cartas(6);
	static Cartas Button_11 = new Cartas(6);
	
	int botonSelect1;
    int botonSelect2;
	int click=0;
	Cartas boton1;
	Cartas boton2;
	int puntaje=0;
	
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuegoMemoria frame = new JuegoMemoria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		IniciarJuego();
	}


	/**
	 * Create the frame.
	 */
	public JuegoMemoria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//Grid layout
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		contentPane.add(Button_0);
		contentPane.add(Button_5);
		contentPane.add(Button_4);
		contentPane.add(Button_1);
		contentPane.add(Button_7);
		contentPane.add(Button_6);
		contentPane.add(Button_2);
		contentPane.add(Button_8);
		contentPane.add(Button_10);
		contentPane.add(Button_3);
		contentPane.add(Button_9);
		contentPane.add(Button_11);
		
		
		MouseListener clickButton =new MouseListener() {
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
				if(click==1) {
					
				}else if(click==2) {
					seleccionado();
					click=0;
				}else {
					click=0;
					seleccionado();
				}
		
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				click++;
				if(click==1) {
					boton1 = ((Cartas)e.getComponent());
					boton1.setEnabled(true);
					botonSelect1=((Cartas)e.getComponent()).getPocision();
					System.out.println(botonSelect1);
				}else if(click==2) {
					
					boton2 = ((Cartas)e.getComponent());
					botonSelect2=((Cartas)e.getComponent()).getPocision();
					System.out.println(botonSelect2);
					if(!(boton1==boton2)) {
						if(botonSelect1==botonSelect2) {
							boton1.setVisible(false);
							boton2.setVisible(false);
							puntaje++;
							if(puntaje==6) {
								JOptionPane.showMessageDialog(null, "En hora Buena");
							}
						}
					}
				}
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
			

		Button_0.addMouseListener(clickButton);
		Button_1.addMouseListener(clickButton);
		Button_2.addMouseListener(clickButton);
		Button_3.addMouseListener(clickButton);
		Button_4.addMouseListener(clickButton);
		Button_6.addMouseListener(clickButton);
		Button_9.addMouseListener(clickButton);
		Button_5.addMouseListener(clickButton);
		Button_7.addMouseListener(clickButton);
		Button_8.addMouseListener(clickButton);
		Button_10.addMouseListener(clickButton);
		Button_11.addMouseListener(clickButton);

		colores();
		seleccionado();
		
		
	}

		
	
	public static void colores() {
		Button_0.setBackground(Color.green);
		Button_1.setBackground(Color.green);
		Button_2.setBackground(Color.pink);
		Button_3.setBackground(Color.pink);
		Button_4.setBackground(Color.red);
		Button_5.setBackground(Color.red);
		Button_6.setBackground(Color.black);
		Button_7.setBackground(Color.black);
		Button_8.setBackground(Color.orange);
		Button_9.setBackground(Color.orange);
		Button_10.setBackground(Color.white);
		Button_11.setBackground(Color.white);
	}
	
	public void seleccionado() {
		Button_0.setSelected(true);
		Button_1.setSelected(true);
		Button_2.setSelected(true);
		Button_3.setSelected(true);
		Button_4.setSelected(true);
		Button_5.setSelected(true);
		Button_6.setSelected(true);
		Button_7.setSelected(true);
		Button_8.setSelected(true);
		Button_9.setSelected(true);
		Button_10.setSelected(true);
		Button_11.setSelected(true);
	}
	
	public static void IniciarJuego() {
	
	}
}
