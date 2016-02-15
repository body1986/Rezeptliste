package Main;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Menue2 extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menue2 frame = new Menue2();
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
	public Menue2() {
		setBounds(100, 100, 450, 300);

	}

}
