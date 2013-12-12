package ramayana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import java.awt.Toolkit;

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new GraphiteLookAndFeel());
					About frame = new About();
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
	public About() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("/home/newbieilmu/workspace/app.newbieilmu/src/image/info.png"));
		setTitle("::About::");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 426, 282);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/home/newbieilmu/Pictures/wiki.png"));
		label.setBounds(127, 12, 148, 112);
		contentPane.add(label);
		
		JLabel lblsoftwarePengetahuanTentang = new JLabel("::Software Pengetahuan Tentang Wayang::");
		lblsoftwarePengetahuanTentang.setFont(new Font("Dialog", Font.BOLD, 16));
		lblsoftwarePengetahuanTentang.setBounds(54, 136, 338, 29);
		contentPane.add(lblsoftwarePengetahuanTentang);
		
		JLabel lblCopyleftAnugrahBagus = new JLabel("Copyleft \n");
		lblCopyleftAnugrahBagus.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopyleftAnugrahBagus.setBounds(105, 162, 206, 18);
		contentPane.add(lblCopyleftAnugrahBagus);
		
		JLabel lblAnugrahBagusSusilo = new JLabel("Anugrah Bagus Susilo");
		lblAnugrahBagusSusilo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnugrahBagusSusilo.setBounds(105, 181, 206, 18);
		contentPane.add(lblAnugrahBagusSusilo);
		
		JLabel label_1 = new JLabel("2013");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(105, 197, 206, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("<newbieilmu@gmail.com>");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(105, 211, 206, 18);
		contentPane.add(label_2);
	}

}
