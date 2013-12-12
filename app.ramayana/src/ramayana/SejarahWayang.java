package ramayana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.UIManager;

import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SejarahWayang extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new GraphiteLookAndFeel());
					SejarahWayang frame = new SejarahWayang();
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
	public SejarahWayang() {
		setTitle("::Sejarah Wayang::");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 12, 455, 254);
		contentPane.add(scrollPane);
		
		JTextArea txtrWayangAdalahSeni = new JTextArea();
		txtrWayangAdalahSeni.setEditable(false);
		txtrWayangAdalahSeni.setText("Wayang adalah seni pertunjukkan asli Indonesia yang berkembang \npesat di Pulau Jawa dan Bali. Selain itu beberapa daerah seperti \nSumatera dan Semenanjung Malaya juga memiliki beberapa budaya \nwayang yang terpengaruh oleh kebudayaan Jawa dan Hindu.\n\nUNESCO, lembaga yang membawahi kebudayaan dari PBB,\npada 7 November 2003 menetapkan wayang sebagai \npertunjukkan bayangan boneka tersohor dari Indonesia, sebuah \nwarisan mahakarya dunia yang tak ternilai dalam seni bertutur \n(Masterpiece of Oral and Intangible Heritage of Humanity).\n\nSebenarnya, pertunjukan boneka tak hanya ada di Indonesia \nkarena banyak pula negara lain yang memiliki pertunjukan boneka. \nNamun pertunjukan bayangan boneka (Wayang) di Indonesia \nmemiliki gaya tutur dan keunikan tersendiri, yang merupakan \nmahakarya asli dari Indonesia. Untuk itulah UNESCO \nmemasukannya ke dalam Daftar Representatif Budaya Takbenda \nWarisan Manusia pada tahun 2003.\n\nTak ada bukti yang menunjukkan wayang telah ada sebelum agama\nHindu menyebar di Asia Selatan. Diperkirakan seni pertunjukan \ndibawa masuk oleh pedagang India. Namun demikian, kejeniusan \nlokal dan kebudayaan yang ada sebelum masuknya Hindu menyatu \ndengan perkembangan seni pertunjukan yang masuk memberi warna\ntersendiri pada seni pertunjukan di Indonesia. Sampai saat ini, \ncatatan awal yang bisa didapat tentang pertunjukan wayang berasal\ndari Prasasti Balitung di Abad ke4 yang berbunyi si Galigi mawayang\n\nKetika agama Hindu masuk ke Indonesia dan menyesuaikan \nkebudayaan yang sudah ada, seni pertunjukan ini menjadi media \nefektif menyebarkan agama Hindu. Pertunjukan wayang \nmenggunakan cerita Ramayana dan Mahabharata.\n\nDemikian juga saat masuknya Islam, ketika pertunjukan yang \nmenampilkan “Tuhan” atau “Dewa” dalam wujud manusia dilarang, \nmunculah boneka wayang yang terbuat dari kulit sapi, dimana saat \npertunjukan yang ditonton hanyalah bayangannya saja. \nWayang inilah yang sekarang kita kenal sebagai wayang kulit. \nUntuk menyebarkan Islam, berkembang juga wayang Sadat yang\n memperkenalkan nilai-nilai Islam.");
		scrollPane.setViewportView(txtrWayangAdalahSeni);
		
		JButton button_1 = new JButton("<<Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cerita1 cerita1 = new Cerita1();
				cerita1.show();
				setVisible(false);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(Color.GRAY);
		button_1.setBounds(290, 277, 88, 33);
		contentPane.add(button_1);
		
		JButton button = new JButton("Next>>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				TokohWayang tkhwayang = new TokohWayang();
				tkhwayang.show();
				setVisible(false);
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(Color.GRAY);
		button.setBounds(379, 277, 88, 33);
		contentPane.add(button);
	}
}
