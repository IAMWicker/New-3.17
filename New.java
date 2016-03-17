import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;


//VS4E -- DO NOT REMOVE THIS LINE!
public class New extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton jButton0;
	private JButton jButton1;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public New() {
		initComponents();
	}

	private void initComponents() {
		setTitle("��������");
		setLayout(new GroupLayout());
		add(getJButton0(), new Constraints(new Leading(20, 516, 10, 10), new Leading(32, 203, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(20, 516, 12, 12), new Leading(260, 203, 10, 10)));
		setSize(558, 489);
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setBackground(Color.white);
			jButton1.setText("���ڶ���Ͷ��");
			jButton1.setMnemonic('B');
			jButton1.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton1MouseMouseClicked(event);
				}
			});
		}
		return jButton1;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setBackground(Color.white);
			//jButton0.setIcon(new ImageIcon(getClass().getResource("/5655917120150328193002057_640.jpg")));
			jButton0.setText("һ��Ͷ��");
			jButton0.setMnemonic('B');
			jButton0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton0MouseMouseClicked(event);
				}
			});
		}
		return jButton0;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
					+ " on this platform:" + e.getMessage());
		}
	}

	/**
	 * Main entry of the class.
	 * Note: This class is only created so that you can easily preview the result at runtime.
	 * It is not expected to be managed by the designer.
	 * You can modify it as you like.
	 */
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				New frame = new New();
				frame.setDefaultCloseOperation(New.EXIT_ON_CLOSE);
				frame.setTitle("New");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	private void jButton0MouseMouseClicked(MouseEvent event) {
		mainFrame mf=new mainFrame();
		mf.show();
	}

	private void jButton1MouseMouseClicked(MouseEvent event) {
		AIP aip=new AIP();
		aip.show();
	}

}
