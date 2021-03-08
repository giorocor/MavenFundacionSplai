package com.jarroba.ejemplo.primeraMaven;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AreaTexto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaTexto frame = new AreaTexto();
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
	public AreaTexto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		

		
		final JTextArea textArea = new JTextArea();
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.setText(textArea.getText()+"Dio click\n ");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				textArea.setText(textArea.getText()+"El mouse dentro al area del TextArea\n ");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				textArea.setText(textArea.getText()+"El mouse salio del area del TextArea\n ");
			}
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.setText(textArea.getText()+"El boton del mouse se esta manteniendo presionado\n ");
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				textArea.setText(textArea.getText()+"El boton del mouse dejo de estar presionado\n ");
			}
		});
		textArea.setBounds(10, 45, 414, 182);
		contentPane.add(textArea);
		
		
		final JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.setText("");
			}
		});
		btnNewButton.setBounds(175, 11, 89, 23);
		contentPane.add(btnNewButton);
	}
}
