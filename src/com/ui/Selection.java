package com.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.lang.*;

import javax.swing.JLabel;

import com.sun.glass.events.WindowEvent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Selection extends JFrame {

	private JPanel contentPane;
	public static boolean isDoctor;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
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
*/
	/**
	 * Create the frame.
	 */
	public Selection() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(320, 220, 300, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewPatient = new JButton("New Patient");
		btnNewPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Patient.mode = Patient.Mode.New;
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Patient frame = new Patient();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewPatient.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewPatient.setBounds(33, 60, 230, 59);
		contentPane.add(btnNewPatient);
		
		JButton btnDischargePatient = new JButton("Discharge Patient");
		btnDischargePatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Patient.mode = Patient.Mode.Discharge;
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							PatientSearch frame = new PatientSearch();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnDischargePatient.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDischargePatient.setBounds(33, 129, 230, 59);
		contentPane.add(btnDischargePatient);
		
		JButton btnPatientSituation = new JButton("Patient Situation");
		btnPatientSituation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Patient.mode = Patient.Mode.Deatil;
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							PatientSearch frame = new PatientSearch();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnPatientSituation.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPatientSituation.setBounds(33, 199, 230, 59);
		contentPane.add(btnPatientSituation);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogOut.setBounds(33, 269, 230, 59);
		contentPane.add(btnLogOut);
		
		JLabel lblNewLabel = new JLabel("Hello: "+(isDoctor?"Doctor ":"Reception ")+"Guest(Need read from database)");
		lblNewLabel.setBounds(24, 23, 270, 16);
		contentPane.add(lblNewLabel);
	}
}
