package ramayana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import javax.swing.JTextArea;
import javax.swing.JButton;

import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TokohWayang extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new GraphiteLookAndFeel());
					TokohWayang frame = new TokohWayang();
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
	public TokohWayang() {
		setTitle("::Tokoh Wayang::");
		setIconImage(Toolkit.getDefaultToolkit().getImage("/home/newbieilmu/Pictures/wayang.jpeg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 12, 455, 241);
		contentPane.add(scrollPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		scrollPane.setViewportView(tabbedPane);
		
		JPanel panelRamayana = new JPanel();
		tabbedPane.addTab("Tokoh Ramayana", null, panelRamayana, null);
		panelRamayana.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 449, 203);
		panelRamayana.add(scrollPane_1);
		
		JTextArea txtrAnggada = new JTextArea();
		txtrAnggada.setText("1. Anggada\n2. Anila\n3. Anjani\n4. Dasarata\n5. Hanoman\n6. Indrajit (Megananda)\n7. Jatayu\n8. Jembawan\n9. Kosalya\n10. Kumbakarna\n11. Aswanikumba\n12. Laksmana\n13. Parasurama\n14. Prahasta\n15. Rama Wijaya\n16. Rawana\n17. Satrugna\n18. Sita\n19. Subali\n20. Sugriwa\n21. Sumali\n22. Sumitra\n23. Surpanaka (Sarpakenaka)\n24. Trikaya\n25. Trijata\n26. Trinetra\n27. Trisirah\n28. Wibisana\n29. Wilkataksini\n30. Dewi Windradi");
		txtrAnggada.setEditable(false);
		scrollPane_1.setViewportView(txtrAnggada);
		
		JPanel panelMaha = new JPanel();
		tabbedPane.addTab("Tokoh Mahabaratha", null, panelMaha, null);
		panelMaha.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 449, 203);
		panelMaha.add(scrollPane_2);
		
		JTextArea txtrAbimanyu = new JTextArea();
		txtrAbimanyu.setText("1. Abimanyu\n2. Resi Abyasa\n3. Amba\n4. Ambalika\n5. Ambika\n6. Antareja\n7. Antasena\n8. Arjuna\n9. Aswatama\n10. Baladewa\n11. Banowati\n12. Basupati\n13. Basudewa\n14. Bima\n15. Bisma\n16. Burisrawa\n17. Bayu\n18. Cakil\n19. Citraksa\n20. Citraksi\n21. Citrayuda\n22. Damayanti\n23. Dewayani\n24. Drona (Dorna)\n25. Drestadyumna\n26. Dretarastra\n27. Dropadi\n28. Durgandini\n29. Durmagati\n30. Dursala (Dursilawati)\n31. Dursasana\n32. Duryodana (Suyodana)\n33. Drupada\n34. Ekalawya\n35. Gatotkaca\n36. Gandabayu\n37. Gandamana\n38. Gandawati\nI39. Indra\n40. Janamejaya\n41. Jayadrata\n42. Karna\n43. Kencakarupa\n44. Kertawarma\n45. Krepa\n46. Kresna\n47. Kunti\n48. Madri\n49. Manumanasa\n50. Matswapati\n51. Nakula\n52. Nala\n53. Niwatakawaca\n54. Pandu\n55. Parasara\n56. Parikesit\n57. Puru\n58. Rukma\n59. Rupakenca\n60. Sadewa\n61. Sakri\n62. Sakutrem\n63. Salya\n64. Sangkuni\n65. Samba\n66. Sanjaya\n67. Santanu\n68. Sarmista\n69. Satyabama\n70. Satyajit\n71. Satyaki\n72. Satyawati\n73. Srikandi\n74. Subadra\n75. Sweta\n76. Udawa\n77. Utara\n78. Utari\n79. Wesampayana\n80. Wicitrawirya\n81. Widura\n82. Wirata\n83. Wisanggeni\n84. Wratsangka\n85. Yayati\n86. Yudistira\n87. Yuyutsu");
		txtrAbimanyu.setEditable(false);
		scrollPane_2.setViewportView(txtrAbimanyu);
		
		JButton button = new JButton("Next>>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JenisWayang jnswayang = new JenisWayang();
				jnswayang.show();
				setVisible(false);
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(Color.GRAY);
		button.setBounds(379, 262, 88, 33);
		contentPane.add(button);
		
		JButton button_1 = new JButton("<<Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SejarahWayang sjrhwayang = new SejarahWayang();
				sjrhwayang.show();
				setVisible(false);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(Color.GRAY);
		button_1.setBounds(289, 262, 88, 33);
		contentPane.add(button_1);
	}
}
