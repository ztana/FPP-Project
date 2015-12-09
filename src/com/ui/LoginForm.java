package com.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField userName;
	private JPasswordField password;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUser = new JLabel("User:");
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUser.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUser.setBounds(6, 65, 119, 28);
		contentPane.add(lblUser);
		
		JLabel lblPas = new JLabel("Password:");
		lblPas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPas.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPas.setBounds(6, 105, 119, 28);
		contentPane.add(lblPas);
		
		JLabel lblImA = new JLabel("I'm a:");
		lblImA.setHorizontalAlignment(SwingConstants.RIGHT);
		lblImA.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblImA.setBounds(57, 144, 68, 28);
		contentPane.add(lblImA);
		
		userName = new JTextField();
		userName.setBounds(175, 70, 155, 20);
		contentPane.add(userName);
		userName.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(175, 110, 155, 20);
		contentPane.add(password);
		
		final JRadioButton rdDoc = new JRadioButton("Doctor");
		buttonGroup.add(rdDoc);
		rdDoc.setBounds(175, 148, 109, 23);
		contentPane.add(rdDoc);
		
		final JRadioButton rdbtnReception = new JRadioButton("Reception");
		buttonGroup.add(rdbtnReception);
		rdbtnReception.setBounds(175, 175, 109, 23);
		contentPane.add(rdbtnReception);
		
		
		JButton btnRLogin = new JButton("Login");
		btnRLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(buttonGroup.getSelection() == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Please select if you are a doctor or a reception.");
					//return;
				}
				else if(rdbtnReception.isSelected())
				{
					Selection.isDoctor = false;

				}
				else
				{
					Selection.isDoctor = true;
				}

				dispose();
				Patient.mode = Patient.Mode.New;
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Selection frame = new Selection();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});	
			}
		});
		btnRLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRLogin.setBounds(175, 228, 89, 23);
		contentPane.add(btnRLogin);
	}
}
