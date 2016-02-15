package Main;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menue extends JPanel {

	/**
	 * Create the panel.
	 */
	public menue() {
		setLayout(null);
		
		JButton btn_Rezepte = new JButton("Rezepte");
		btn_Rezepte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frm_main main = new frm_main();
				main.setVisible(true);			
			}
		});
		btn_Rezepte.setBounds(10, 11, 132, 32);
		add(btn_Rezepte);
		
		JButton btn_Wochenliste = new JButton("Wochenliste");
		btn_Wochenliste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frm_Wochenliste Wochenliste = new frm_Wochenliste();
				Wochenliste.setVisible(true);
			}
		});
		btn_Wochenliste.setBounds(10, 54, 132, 32);
		add(btn_Wochenliste);
		
		JButton btn_Einkaufsliste = new JButton("Einkaufsliste");
		btn_Einkaufsliste.setBounds(10, 97, 132, 32);
		add(btn_Einkaufsliste);
		
		JButton btn_Zutaten = new JButton("Zutaten");
		btn_Zutaten.setBounds(10, 140, 132, 32);
		add(btn_Zutaten);

	}

}
