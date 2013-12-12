package ramayana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JenisWayang extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new GraphiteLookAndFeel());
					JenisWayang frame = new JenisWayang();
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
	public JenisWayang() {
		setBackground(Color.WHITE);
		setTitle("Jenis-Jenis Wayang");
		setIconImage(Toolkit.getDefaultToolkit().getImage("/home/newbieilmu/Pictures/wayang.jpeg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 364);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 51, 429, 226);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Wayang Purwa", "Wayang Golek", "Wayang Gung", "Wayang Suket"},
				{"Wayang Madya", "Wayang Menak", "Wayang Topeng", null},
				{"Wayang Gedog", "Wayang Cepak", null, null},
				{"Wayang Dupara", "Wayang Klithik", null, null},
				{"Wayang Wahyu", "Wayang Timplong", null, null},
				{"Wayang Suluh", "Wayang Potehi", null, null},
				{"Wayang Kancil", null, null, null},
				{"Wayang Calonarang", null, null, null},
				{"Wayang Krucil", null, null, null},
				{"Wayang Ajen", null, null, null},
				{"Wayang Sasak", null, null, null},
				{"Wayang Sadat", null, null, null},
				{"Wayang Parwa", null, null, null},
				{"Wayang Arja", null, null, null},
				{"Wayang Gambuh", null, null, null},
				{"Wayang Cupak", null, null, null},
				{"Wayang Beber", null, null, null},
			},
			new String[] {
				"Wayang Kulit", "Wayang Kayu", "Wayang Orang", "Wayang Rumput"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblJenisWayangMenurut = new JLabel("Jenis Wayang menurut bahan pembuatan :");
		lblJenisWayangMenurut.setBounds(12, 21, 355, 18);
		contentPane.add(lblJenisWayangMenurut);
		
		JButton button = new JButton("<<Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TokohWayang tkohwayang = new TokohWayang();
				tkohwayang.show();
				setVisible(false);
				
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(Color.GRAY);
		button.setBounds(264, 286, 88, 33);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Next>>");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TerimaKasih terimakasih = new TerimaKasih();
				terimakasih.show();
				setVisible(false);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(Color.GRAY);
		button_1.setBounds(353, 286, 88, 33);
		contentPane.add(button_1);
	}
}
