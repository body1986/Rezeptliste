package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm_Wochenliste extends JFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Wochenliste frame = new frm_Wochenliste();
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
	public frm_Wochenliste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 863, 555);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(152, 251, 152));
		panel.setBounds(34, 11, 787, 50);
		getContentPane().add(panel);
		
		JLabel lblWochenliste = new JLabel("Wochenliste");
		lblWochenliste.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblWochenliste);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Rezept", "Status"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBackground(new Color(255, 222, 173));
		table.setBounds(196, 108, 415, 248);
		getContentPane().add(table);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(625, 72, 196, 25);
		getContentPane().add(comboBox);
		
		JButton btnRezeptZuteilen = new JButton("Rezept zuteilen");
		btnRezeptZuteilen.setBounds(646, 108, 175, 34);
		getContentPane().add(btnRezeptZuteilen);
		
		JButton btnStatusBearbeiten = new JButton("Status bearbeiten");
		btnStatusBearbeiten.setBounds(646, 153, 175, 34);
		getContentPane().add(btnStatusBearbeiten);
		
		JButton btnRezeptEntfernen = new JButton("Rezept entfernen");
		btnRezeptEntfernen.setBounds(646, 198, 175, 34);
		getContentPane().add(btnRezeptEntfernen);
		
		JButton btnListeLschen = new JButton("Liste l\u00F6schen");
		btnListeLschen.setBounds(646, 243, 175, 34);
		getContentPane().add(btnListeLschen);
		
		JLabel lblWochenlisteVonBis = new JLabel("Wochenliste von:01.02.2016 bis 07.02.2016");
		lblWochenlisteVonBis.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWochenlisteVonBis.setBounds(199, 72, 403, 14);
		getContentPane().add(lblWochenlisteVonBis);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(27, 108, 159, 205);
		getContentPane().add(panel_1);
		
		JButton button = new JButton("Rezepte");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frm_main Main = new frm_main();
				Main.setVisible(true);
			frm_Wochenliste.this.dispose();
			}
		});
		button.setBounds(10, 11, 135, 34);
		panel_1.add(button);
		
		JButton button_1 = new JButton("Wochenliste");
		button_1.setBackground(new Color(154, 205, 50));
		button_1.setBounds(13, 52, 132, 34);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("Einkaufsliste");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frm_Einkaufsliste einkaufsliste = new frm_Einkaufsliste();
				einkaufsliste.setVisible(true);
				frm_Wochenliste.this.dispose();	
			}
		});
		button_2.setBounds(13, 97, 132, 34);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("Zutaten");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frm_Zutaten Zutaten = new frm_Zutaten();
				Zutaten.setVisible(true);
				frm_Wochenliste.this.dispose();	
			}
		});
		button_3.setBounds(13, 142, 132, 34);
		panel_1.add(button_3);
	}
}
