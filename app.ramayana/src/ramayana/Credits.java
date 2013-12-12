package ramayana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Credits extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new GraphiteLookAndFeel());
					Credits frame = new Credits();
					frame.setVisible(true);
					//frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Credits() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("/home/newbieilmu/workspace/app.newbieilmu/src/image/view-process-system.png"));
		setBackground(Color.WHITE);
		setTitle("::Credits::");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 241);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 12, 347, 153);
		contentPane.add(tabbedPane);
		tabbedPane.setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Idea By", null, panel, null);
		panel.setLayout(null);
		
		JTextArea txtrAnugrahBagusSusilo = new JTextArea();
		txtrAnugrahBagusSusilo.setEditable(false);
		txtrAnugrahBagusSusilo.setText("Anugrah Bagus Susilo <newbieilmu@gmail.com>");
		txtrAnugrahBagusSusilo.setBounds(0, 0, 345, 119);
		panel.add(txtrAnugrahBagusSusilo);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Code By", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTextArea txtrAnugrahBagusSusilo_1 = new JTextArea();
		txtrAnugrahBagusSusilo_1.setEditable(false);
		txtrAnugrahBagusSusilo_1.setText("Anugrah Bagus Susilo <newbieilmu@gmail.com>");
		txtrAnugrahBagusSusilo_1.setBounds(0, 0, 345, 119);
		panel_1.add(txtrAnugrahBagusSusilo_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Design By", null, panel_2, null);
		panel_2.setLayout(null);
		
		JTextArea txtrAnugrahBagusSusilo_2 = new JTextArea();
		txtrAnugrahBagusSusilo_2.setEditable(false);
		txtrAnugrahBagusSusilo_2.setText("Anugrah Bagus Susilo <newbieilmu@gmail.com>");
		txtrAnugrahBagusSusilo_2.setBounds(0, 0, 345, 119);
		panel_2.add(txtrAnugrahBagusSusilo_2);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Develop By", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTextArea txtrAnugrahBagusSusilo_3 = new JTextArea();
		txtrAnugrahBagusSusilo_3.setEditable(false);
		txtrAnugrahBagusSusilo_3.setText("Anugrah Bagus Susilo <newbieilmu@gmail.com>");
		txtrAnugrahBagusSusilo_3.setBounds(0, 0, 345, 119);
		panel_3.add(txtrAnugrahBagusSusilo_3);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setBounds(267, 172, 94, 24);
		btnClose.setForeground(Color.BLACK);
		btnClose.setBackground(Color.WHITE);
		contentPane.add(btnClose);
	}
	
}
