package views;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameMain extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanelMain panelMain;

	public JFrameMain(ArrayList<String> notifications) {
		init(notifications);
	}

	private void init(ArrayList<String> notifications) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(new Dimension(400, 500));
		setLocationRelativeTo(null);
		setTitle("Employees DB");
		// setIconImage(new
		// ImageIcon(getClass().getResource("/images/notification.png")).getImage());
		panelMain = new JPanelMain();
		add(panelMain);
		setVisible(true);
	}

}
