package com.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JList;
import javax.swing.JTree;

import java.awt.Choice;

public class Patient extends JFrame {
	
	public static enum Mode{New,Discharge,Deatil};

	public static Mode mode;
	protected static final JFrame Patient = null;
	private JPanel contentPane;
	private JTextField patientID;
	private JTextField patientSex;
	private JTextField patientName;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField DOB;
	private JTextField DOA;
	private JTextField DOD;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
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
	*/
	/**
	 * Create the frame.
	 */
	public Patient() {
		setTitle("Patient");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 0, 500, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Patient ID:");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(10, 42, 177, 14);
		contentPane.add(lblName);
		
		JLabel lblSex = new JLabel("Gender:");
		lblSex.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSex.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSex.setBounds(10, 67, 177, 14);
		contentPane.add(lblSex);
		
		JLabel label_1 = new JLabel("Name:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(10, 92, 177, 14);
		contentPane.add(label_1);
		
		JLabel lblBirthDate = new JLabel("Birth Date:");
		lblBirthDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBirthDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBirthDate.setBounds(10, 116, 177, 14);
		contentPane.add(lblBirthDate);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAge.setBounds(10, 141, 177, 14);
		contentPane.add(lblAge);
		
		JLabel lblAdmitDate = new JLabel("Admit Date:");
		lblAdmitDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdmitDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdmitDate.setBounds(10, 166, 177, 14);
		contentPane.add(lblAdmitDate);
		
		JLabel lblDischargeDate = new JLabel("Discharge Date:");
		lblDischargeDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDischargeDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDischargeDate.setBounds(10, 191, 177, 14);
		contentPane.add(lblDischargeDate);
		
		JLabel lblDiease = new JLabel("Doctor Name:");
		lblDiease.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiease.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDiease.setBounds(10, 216, 177, 14);
		contentPane.add(lblDiease);
		
		JLabel lblRemark = new JLabel("Remark:");
		lblRemark.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRemark.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRemark.setBounds(10, 430, 177, 14);
		contentPane.add(lblRemark);
		
		JLabel label = new JLabel("Diease:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(10, 241, 177, 14);
		contentPane.add(label);
		
		patientID = new JTextField();
		patientID.setBounds(199, 36, 268, 26);
		contentPane.add(patientID);
		patientID.setColumns(10);
		
		patientSex = new JTextField();
		patientSex.setColumns(10);
		patientSex.setBounds(199, 61, 268, 26);
		contentPane.add(patientSex);
		
		patientName = new JTextField();
		patientName.setColumns(10);
		patientName.setBounds(199, 86, 268, 26);
		contentPane.add(patientName);
		
		JLabel patientAge = new JLabel("CaluculateByDoB");
		patientAge.setBounds(209, 140, 228, 16);
		contentPane.add(patientAge);
		
		textField = new JTextField();
		textField.setBounds(199, 241, 274, 168);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(199, 430, 274, 168);
		contentPane.add(textField_1);
		
		JButton btnPatientCommit = new JButton("Commit");
		btnPatientCommit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				mode = Mode.Deatil;
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
		btnPatientCommit.setBounds(113, 625, 117, 29);
		contentPane.add(btnPatientCommit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(300, 625, 117, 29);
		contentPane.add(btnCancel);
		
		DOB = new JTextField();
		DOB.setColumns(10);
		DOB.setBounds(199, 110, 218, 26);
		contentPane.add(DOB);
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DOB.setText(new DatePicker(Patient).setPickedDate());
			}
		});
		btnNewButton.setBounds(419, 110, 56, 29);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("...");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DOA.setText(new DatePicker(Patient).setPickedDate());
			}
		});
		button.setBounds(417, 160, 56, 29);
		contentPane.add(button);
		
		DOA = new JTextField();
		DOA.setColumns(10);
		DOA.setBounds(199, 160, 218, 26);
		contentPane.add(DOA);
		
		JButton btn_dod = new JButton("...");
		btn_dod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DOD.setText(new DatePicker(Patient).setPickedDate());
			}
		});
		btn_dod.setBounds(417, 185, 56, 29);
		contentPane.add(btn_dod);
		
		DOD = new JTextField();
		DOD.setColumns(10);
		DOD.setBounds(199, 185, 218, 26);
		contentPane.add(DOD);
		
		Choice choice = new Choice();
		choice.setBounds(199, 216, 142, 27);
		choice.add("Test1");
		choice.add("Test2");
		contentPane.add(choice);
		
		
		//set mode detail
		switch(mode)
		{
		case New:
			//disable discharge date
			DOD.setText("Not avaible");
			DOD.setEditable(false);
			btn_dod.setEnabled(false);
			break;
		case Discharge:
			//disable everything but discharge date
			patientID.setEditable(false);
			patientSex.setEditable(false);
			patientName.setEditable(false);
			textField.setEditable(false);
			textField_1.setEditable(false);
			DOB.setEditable(false);
			DOA.setEditable(false);
			break;
		case Deatil:
			//disable everything
			patientID.setEditable(false);
			patientSex.setEditable(false);
			patientName.setEditable(false);
			textField.setEditable(false);
			textField_1.setEditable(false);
			DOB.setEditable(false);
			DOA.setEditable(false);
			DOD.setEditable(false);
			break;
			
		}

	}
}
