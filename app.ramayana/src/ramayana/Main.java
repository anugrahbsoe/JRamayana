package ramayana;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JButton;
import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JSeparator;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new GraphiteLookAndFeel());
					Main frame = new Main();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("/home/newbieilmu/Pictures/wiki.png"));
		setTitle("::Software Pecinta Wayang::");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 319);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblJramayanaV = new JLabel("JRamayana v.01");
		lblJramayanaV.setFont(new Font("Bitstream Vera Serif", Font.PLAIN, 21));
		lblJramayanaV.setForeground(Color.WHITE);
		lblJramayanaV.setBounds(233, 59, 169, 33);
		contentPane.add(lblJramayanaV);
		
		JLabel lblJramayana = new JLabel("");
		lblJramayana.setIcon(new ImageIcon("/home/newbieilmu/Pictures/wayang1.jpeg"));
		lblJramayana.setBackground(Color.BLACK);
		lblJramayana.setForeground(Color.WHITE);
		lblJramayana.setFont(new Font("Dialog", Font.PLAIN, 42));
		lblJramayana.setHorizontalAlignment(SwingConstants.CENTER);
		lblJramayana.setBounds(0, 0, 419, 92);
		contentPane.add(lblJramayana);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new TitledBorder(null, "Pengenalan", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(24, 104, 378, 133);
		contentPane.add(panel);
		panel.setLayout(null);
		
		final JButton btnApaItuJramayana = new JButton("Apa Itu JRamayana");
		btnApaItuJramayana.setBounds(26, 32, 138, 37);
		panel.add(btnApaItuJramayana);
		btnApaItuJramayana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				About about = new About();
				about.show();
			}
		});
		btnApaItuJramayana.setForeground(Color.WHITE);
		btnApaItuJramayana.setBackground(Color.GRAY);
		
		final JButton btnMulaiCerita = new JButton("Mulai Cerita");
		btnMulaiCerita.setBounds(212, 31, 138, 37);
		panel.add(btnMulaiCerita);
		btnMulaiCerita.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cerita1 cerita1 = new Cerita1();
				cerita1.show();
				setVisible(false);
			}
		});
		
		btnMulaiCerita.setForeground(Color.WHITE);
		btnMulaiCerita.setBackground(Color.GRAY);
		
		JButton btnCredit = new JButton("Credit");
		btnCredit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Credits credit = new Credits();
			credit.show();
			}
		});
		btnCredit.setBounds(24, 248, 86, 26);
		contentPane.add(btnCredit);
		
		JButton btnLicence = new JButton("Licence");
		btnLicence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Licence licence = new Licence();
				licence.show();
			}
		});
		btnLicence.setBounds(121, 248, 86, 26);
		contentPane.add(btnLicence);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Keluar();
			}
		});
		btnClose.setBounds(317, 248, 86, 26);
		contentPane.add(btnClose);
	}
	void Keluar(){
		try {
	    	int reply = JOptionPane.showConfirmDialog (this,
					"Yakin Mau Keluar?",
					"Sistem - Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (reply == JOptionPane.YES_OPTION) {
				setVisible (false);		//Menyembunyikan Frame.
				dispose();            	//Membersihkan Resource dari system memori
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Membebaskan aplikasi dari memori
				//System.exit (0);        //Keluar dari Aplikasi.
			}
		} 
		catch (Exception ex) {
			}
		}
}
