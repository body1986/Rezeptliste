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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm_Zutaten extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Zutaten frame = new frm_Zutaten();
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
	public frm_Zutaten() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 921, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(222, 184, 135));
		panel.setBounds(10, 11, 885, 48);
		contentPane.add(panel);
		
		JLabel lblZutatenListe = new JLabel("Zutaten Liste");
		lblZutatenListe.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblZutatenListe);
		
		table = new JTable();
		table.setBackground(new Color(238, 232, 170));
		table.setBounds(202, 81, 496, 354);
		contentPane.add(table);
		
		JButton btnZutatAnlegen = new JButton("Zutat anlegen");
		btnZutatAnlegen.setBounds(719, 87, 176, 34);
		contentPane.add(btnZutatAnlegen);
		
		JButton btnZutatBearbeiten = new JButton("Zutat bearbeiten");
		btnZutatBearbeiten.setBounds(719, 132, 176, 34);
		contentPane.add(btnZutatBearbeiten);
		
		JButton btnZutatLschen = new JButton("Zutat l\u00F6schen");
		btnZutatLschen.setBounds(719, 177, 176, 34);
		contentPane.add(btnZutatLschen);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 81, 159, 205);
		contentPane.add(panel_1);
		
		JButton button = new JButton("Rezepte");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frm_main rezepte = new frm_main();
				rezepte.setVisible(true);
				frm_Zutaten.this.dispose();	
			}
		});
		button.setBounds(10, 11, 135, 34);
		panel_1.add(button);
		
		JButton button_1 = new JButton("Wochenliste");
		button_1.setBounds(13, 52, 132, 34);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("Einkaufsliste");
		button_2.setBounds(13, 97, 132, 34);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("Zutaten");
		button_3.setBackground(new Color(154, 205, 50));
		button_3.setBounds(13, 142, 132, 34);
		panel_1.add(button_3);
	}

}
