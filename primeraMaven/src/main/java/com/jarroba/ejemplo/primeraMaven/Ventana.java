 package com.jarroba.ejemplo.primeraMaven;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import java.awt.event.MouseMotionAdapter;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Dimension;

public class Ventana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setTitle("Mi primera ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		final JLabel lblNewLabel = new JLabel("Cambia mi tamaño");
		lblNewLabel.setMaximumSize(new Dimension(87, 100));
		lblNewLabel.setBorder(new LineBorder(Color.RED, 2, true));
		lblNewLabel.setLocation(42, 143);
		lblNewLabel.setSize(100, 30);
		contentPane.add(lblNewLabel, BorderLayout.WEST);
		
		//lblNewLabel.setSize(slider.getValue(), lblNewLabel.getHeight());
		
		final JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblNewLabel.setSize(slider.getValue(), lblNewLabel.getHeight());
			}
		});
		slider.setMaximum(400);
		slider.setBounds(56, 34, 200, 26);
		contentPane.add(slider);
		
		//	lblNewLabel.setSize(lblNewLabel.getWidth(), slider.getValue());
		JSlider slider_1 = new JSlider();
		slider_1.setMaximum(200);
		slider_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblNewLabel.setSize(lblNewLabel.getWidth(), slider.getValue());
			}
		});
		slider_1.setOrientation(SwingConstants.VERTICAL);
		slider_1.setBounds(10, 50, 26, 200);
		contentPane.add(slider_1);
	}
}
