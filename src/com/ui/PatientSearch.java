package com.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PatientSearch extends JFrame {

	private JPanel contentPane;
	private JButton btnPatientSelect = new JButton("Select");
	private JList patientList = new JList();

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
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
	*/

	/**
	 * Create the frame.
	 */
	public PatientSearch() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(320, 220, 510, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		contentPane.add(patientList, BorderLayout.CENTER);
		contentPane.add(btnPatientSelect, BorderLayout.SOUTH);
		

		btnPatientSelect.addActionListener(new ActionListener() {
			//get current mode(Patient.mode)
			//do detail/discharge
			public void actionPerformed(ActionEvent e) {
				//detail/discharge
				
				//hide select button
				btnPatientSelect.hide();
				btnPatientSelect.setVisible(false);

				//refresh list again
				

			}
		});
	}

}
