package ramayana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;

public class TerimaKasih extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new GraphiteLookAndFeel());
					TerimaKasih frame = new TerimaKasih();
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
	public TerimaKasih() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("/home/newbieilmu/Pictures/wayang.jpeg"));
		setTitle("::Terima Kasih::");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTerimaKasihTelah = new JLabel("telah mau meluangkan waktu untuk\nmengetahui tentang wayang.\n\n");
		lblTerimaKasihTelah.setBounds(12, 69, 416, 21);
		contentPane.add(lblTerimaKasihTelah);
		
		JLabel lblTerimaKasih = new JLabel("Terima Kasih ");
		lblTerimaKasih.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTerimaKasih.setBounds(12, 39, 158, 18);
		contentPane.add(lblTerimaKasih);
		
		JLabel lblKamiMengetahuiMasih = new JLabel("kami mengetahui masih banyak sekali kekurangan dalam");
		lblKamiMengetahuiMasih.setBounds(12, 92, 416, 21);
		contentPane.add(lblKamiMengetahuiMasih);
		
		JLabel lblDalamMembangunSoftware = new JLabel("membangun software ini.\n\n");
		lblDalamMembangunSoftware.setBounds(12, 113, 416, 21);
		contentPane.add(lblDalamMembangunSoftware);
		
		JLabel lblBilaAdaSaran = new JLabel("Bila ada saran dan kritik sampaikan saya langsung ke \n");
		lblBilaAdaSaran.setBounds(12, 147, 416, 21);
		contentPane.add(lblBilaAdaSaran);
		
		JLabel label = new JLabel("<newbieilmu@gmail.com>");
		label.setBounds(12, 169, 416, 21);
		contentPane.add(label);
		
		JLabel lblSampaiJumpa = new JLabel("Sampai Jumpa !");
		lblSampaiJumpa.setFont(new Font("Dialog", Font.BOLD, 15));
		lblSampaiJumpa.setBounds(149, 202, 123, 18);
		contentPane.add(lblSampaiJumpa);
	}

}
