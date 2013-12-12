package ramayana;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Cerita1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new GraphiteLookAndFeel());
					Cerita1 frame = new Cerita1();
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
	public Cerita1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("/home/newbieilmu/Pictures/wayang.jpeg"));
		setTitle("::Pengenalan Wayang::");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 374);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new TitledBorder(null, "Mulai Cerita", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 12, 462, 268);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnApaItuWayang = new JButton("Sejarah Wayang");
		btnApaItuWayang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SejarahWayang sw = new SejarahWayang();
				sw.show();
				setVisible(false);
			}
		});
		btnApaItuWayang.setBounds(268, 29, 172, 61);
		panel.add(btnApaItuWayang);
		
		JButton btnSiapaTokohtokohDalam = new JButton("Tokoh Pewayangan");
		btnSiapaTokohtokohDalam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TokohWayang tokohwayang = new TokohWayang();
				tokohwayang.show();
				setVisible(false);
			}
		});
		btnSiapaTokohtokohDalam.setBounds(268, 99, 172, 61);
		panel.add(btnSiapaTokohtokohDalam);
		
		JButton btnJenisWayang = new JButton("Jenis Wayang");
		btnJenisWayang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JenisWayang jnswayang = new JenisWayang();
				jnswayang.show();
				setVisible(false);
			}
		});
		btnJenisWayang.setBounds(268, 171, 172, 61);
		panel.add(btnJenisWayang);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/home/newbieilmu/Pictures/wayang.jpeg"));
		label.setBounds(12, 29, 214, 210);
		panel.add(label);
		
		JButton btnBack = new JButton("<<Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Main main = new Main();
					main.show();
					setVisible(false);
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setBackground(Color.GRAY);
		btnBack.setBounds(386, 291, 88, 33);
		contentPane.add(btnBack);
	}
}
