package com.jarroba.ejemplo.primeraMaven;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class ConversionEuros extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private int conversion=1;
	private int cantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversionEuros frame = new ConversionEuros();
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
	public ConversionEuros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		final JLabel lblNewLabel = new JLabel("Cantidad a Convertir:");
		lblNewLabel.setBounds(10, 33, 109, 14);
		contentPane.add(lblNewLabel);
		
		final JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setBounds(225, 33, 52, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(129, 30, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_1.setEnabled(false);
		textField_1.setBounds(287, 30, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnNewButton = new JButton("Euros a Pesetas");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
				cantidad=Integer.parseInt(textField.getText());
				}catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR: "+ e2 +"\n Ingresa un valor numerico");
				}
				
				switch (conversion) {
				case 0:
					textField_1.setText(String.valueOf(cantidad/166386));
					break;
				case 1:
					textField_1.setText(String.valueOf(cantidad*166386));
					break;
				default:
					break;
				}
				
			}
		});
		btnNewButton.setBounds(91, 70, 149, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cambiar");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				switch (conversion) {
				case 0:
					btnNewButton.setText("Euros a Pesetas");
					conversion=1;
					break;
				
				case 1:
					btnNewButton.setText("Pesetas a Euros");
					conversion=0;
					break;
				default:
					break;
				}
				
			}
		});
		btnNewButton_1.setBounds(284, 70, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		btnNewButton_2.setBounds(284, 106, 89, 23);
		contentPane.add(btnNewButton_2);
	}

}
