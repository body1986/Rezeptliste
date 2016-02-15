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
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm_Einkaufsliste extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Einkaufsliste frame = new frm_Einkaufsliste();
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
	public frm_Einkaufsliste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 881, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(210, 180, 140));
		panel.setBounds(10, 11, 845, 41);
		contentPane.add(panel);
		
		JLabel lblEinkaufsliste = new JLabel("Einkaufsliste");
		lblEinkaufsliste.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblEinkaufsliste);
		
		table = new JTable();
		table.setBackground(new Color(176, 224, 230));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Anzahl", "Zutat", "Preis", "Preis"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(177, 79, 486, 330);
		contentPane.add(table);
		
		JButton btnRezeptHinzuggen = new JButton("Rezept hinzuf\u00FCgen");
		btnRezeptHinzuggen.setBounds(689, 130, 166, 34);
		contentPane.add(btnRezeptHinzuggen);
		
		JButton btnZutatHinzufgen = new JButton("Zutat hinzuf\u00FCgen");
		btnZutatHinzufgen.setBounds(689, 175, 166, 34);
		contentPane.add(btnZutatHinzufgen);
		
		JButton btnZutatEntfernen = new JButton("Zutat entfernen");
		btnZutatEntfernen.setBounds(689, 220, 166, 34);
		contentPane.add(btnZutatEntfernen);
		
		JButton btnDrucken = new JButton("Drucken");
		btnDrucken.setBounds(689, 265, 166, 34);
		contentPane.add(btnDrucken);
		
		JButton btnListeLschen = new JButton("Liste L\u00F6schen");
		btnListeLschen.setBounds(689, 310, 166, 34);
		contentPane.add(btnListeLschen);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(689, 79, 166, 27);
		contentPane.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 79, 159, 205);
		contentPane.add(panel_1);
		
		JButton button = new JButton("Rezepte");
		button.setBounds(10, 11, 135, 34);
		panel_1.add(button);
		
		JButton button_1 = new JButton("Wochenliste");
		button_1.setBounds(13, 52, 132, 34);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("Einkaufsliste");
		button_2.setBackground(new Color(154, 205, 50));
		button_2.setBounds(13, 97, 132, 34);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("Zutaten");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frm_Zutaten zutaten = new frm_Zutaten();
				zutaten.setVisible(true);
				frm_Einkaufsliste.this.dispose();	
			}
		});
		button_3.setBounds(13, 142, 132, 34);
		panel_1.add(button_3);
	}

}
