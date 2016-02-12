package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class frm_head extends JFrame {

	private JPanel contentPane;
	private JTextField txt_name;
	private ArrayList Listarray = new ArrayList<String>();
	private JList lt_Namen;
	private JButton btn_save;
	private DefaultListModel Listmodel = new DefaultListModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_head frame = new frm_head();
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
	public frm_head() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_save = new JButton("hinzug\u00FCgen");
		btn_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Listmodel.clear();
				Listarray.add(txt_name.getText());
				for (int i = 0; i < Listarray.size(); i++) {
					Listmodel.add(i,Listarray.get(i));					
				}
				txt_name.getText();
			}
		});
		btn_save.setBounds(310, 29, 103, 35);
		contentPane.add(btn_save);
		
		txt_name = new JTextField();
		txt_name.setBounds(10, 30, 290, 34);
		contentPane.add(txt_name);
		txt_name.setColumns(10);
		
		lt_Namen = new JList(Listmodel);
		lt_Namen.setBounds(10, 94, 403, 125);
		contentPane.add(lt_Namen);
	}

}
