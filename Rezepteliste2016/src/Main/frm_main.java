package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm_main extends JFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_main frame = new frm_main();
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
	public frm_main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 548);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		Panel panel = new Panel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(43, 10, 815, 50);
		getContentPane().add(panel);
		
		JLabel lblRezeptListe = new JLabel("Rezept Liste");
		lblRezeptListe.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel.add(lblRezeptListe);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Rezeptname", "Preis", "Status"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBackground(new Color(152, 251, 152));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBounds(179, 86, 517, 412);
		getContentPane().add(table);
		
		JButton btn_newrezept = new JButton("Rezept anlagen");
		btn_newrezept.setBounds(726, 86, 132, 34);
		getContentPane().add(btn_newrezept);
		
		JButton btn_editrezept = new JButton("Rezept bearbeiten");
		btn_editrezept.setBounds(726, 133, 132, 34);
		getContentPane().add(btn_editrezept);
		
		JButton btn_dellrezept = new JButton("Rezept l\u00F6schen");
		btn_dellrezept.setBounds(726, 178, 132, 34);
		getContentPane().add(btn_dellrezept);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 86, 159, 205);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btn_Rezepte = new JButton("Rezepte");
		btn_Rezepte.setBackground(new Color(154, 205, 50));
		btn_Rezepte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Rezepte.setBounds(10, 11, 135, 34);
		panel_1.add(btn_Rezepte);
		
		JButton btn_Wochenliste = new JButton("Wochenliste");
		btn_Wochenliste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frm_Wochenliste wochenliste = new frm_Wochenliste();
				wochenliste.setVisible(true);
			frm_main.this.dispose();			
			}
		});
		btn_Wochenliste.setBounds(13, 52, 132, 34);
		panel_1.add(btn_Wochenliste);
		
		JButton btn_Einkaufsliste = new JButton("Einkaufsliste");
		btn_Einkaufsliste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frm_Einkaufsliste Einkaufsliste = new frm_Einkaufsliste();
				Einkaufsliste.setVisible(true);
			frm_main.this.dispose();			
			}
		});
		btn_Einkaufsliste.setBounds(13, 97, 132, 34);
		panel_1.add(btn_Einkaufsliste);
		
		JButton btn_Zutaten = new JButton("Zutaten");
		btn_Zutaten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frm_Zutaten Zutaten = new frm_Zutaten();
				Zutaten.setVisible(true);
			frm_main.this.dispose();	
			}
		});
		btn_Zutaten.setBounds(13, 142, 132, 34);
		panel_1.add(btn_Zutaten);
	}
}
