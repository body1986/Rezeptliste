package Main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.UUID;
import java.awt.event.ActionEvent;

public class frm_DLNewZutat extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txt_Name;
	private JTextField txt_Preis;
	private JTextField txt_Geschaeft;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			frm_DLNewZutat dialog = new frm_DLNewZutat();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public frm_DLNewZutat() {
		setBounds(100, 100, 531, 242);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		
		txt_Name = new JTextField();
		txt_Name.setBounds(30, 26, 329, 20);
		contentPanel.add(txt_Name);
		txt_Name.setColumns(10);
		
		JLabel lblZutatenName = new JLabel("Zutaten Name:");
		lblZutatenName.setBounds(30, 6, 151, 14);
		contentPanel.add(lblZutatenName);
		
		JLabel lblPreis = new JLabel("Preis:");
		lblPreis.setBounds(30, 57, 46, 14);
		contentPanel.add(lblPreis);
		
		JLabel lblGeschft = new JLabel("Gesch\u00E4ft:");
		lblGeschft.setBounds(107, 57, 74, 14);
		contentPanel.add(lblGeschft);
		
		txt_Preis = new JTextField();
		txt_Preis.setText("00,00");
		txt_Preis.setBounds(30, 82, 46, 20);
		contentPanel.add(txt_Preis);
		txt_Preis.setColumns(10);
		
		txt_Geschaeft = new JTextField();
		txt_Geschaeft.setBounds(107, 82, 151, 20);
		contentPanel.add(txt_Geschaeft);
		txt_Geschaeft.setColumns(10);
		
		JLabel label = new JLabel("\u20AC");
		label.setBounds(77, 85, 13, 14);
		contentPanel.add(label);
		
		JLabel lblKategorie = new JLabel("Kategorie");
		lblKategorie.setBounds(286, 57, 46, 14);
		contentPanel.add(lblKategorie);
		
		final JComboBox cb_Kategorie = new JComboBox();
		cb_Kategorie.setModel(new DefaultComboBoxModel(new String[] {"Essen", "Getr\u00E4nke", "K\u00FChlschrank", "Nonfood", "Tiere"}));
		cb_Kategorie.setBounds(286, 82, 151, 20);
		contentPanel.add(cb_Kategorie);
		
		final JComboBox cb_Einheit = new JComboBox();
		cb_Einheit.setModel(new DefaultComboBoxModel(new String[] {"St", "g", "Kg", "L", "ml"}));
		cb_Einheit.setBounds(30, 139, 151, 20);
		contentPanel.add(cb_Einheit);
		
		JLabel lblEinheit = new JLabel("Einheit");
		lblEinheit.setBounds(30, 114, 46, 14);
		contentPanel.add(lblEinheit);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						SQLDB MySQL = new SQLDB();
						
						String ID = UUID.randomUUID().toString();
						String Name = txt_Name.getText();
						String SPreis = txt_Preis.getText();
						 //DecimalFormat DCformat = new DecimalFormat(SPreis);
						 //System.out.println("big double: " + DCformat.format(new Double(SPreis))); 
						
						String Laden = txt_Geschaeft.getText();
						String Kategorie =(String)cb_Kategorie.getSelectedItem().toString();
						String Einheit =(String)cb_Einheit.getSelectedItem().toString();						
						
						//MySQL.Insert_Zutat(ID, Name, DCformat, Laden, Kategorie, Einheit);	
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
