package ramayana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.UIManager;

import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Licence extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new GraphiteLookAndFeel());
					Licence frame = new Licence();
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
	public Licence() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("/home/newbieilmu/workspace/app.newbieilmu/src/image/halfencrypted.png"));
		setTitle("::Licence::");
		//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 412, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 12, 378, 148);
		contentPane.add(scrollPane);
		
		JTextArea txtrWaktuSholatMinbar = new JTextArea();
		txtrWaktuSholatMinbar.setEditable(false);
		txtrWaktuSholatMinbar.setText("JRamayana adalah perangkat lunak bebas anda \ndapat menyebar ulang dan/atau mengubahnya dibawah \npersyaratan GNU General Public License\nsebagaimana dipublikasikan oleh Free Software Foundation\nversi 2 dari Lisensi,atau (sesuai pilihan anda) \nserta versi selanjutnya.");
		scrollPane.setViewportView(txtrWaktuSholatMinbar);
		
		JButton button = new JButton("Close");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setForeground(Color.BLACK);
		button.setBackground(Color.WHITE);
		button.setBounds(297, 171, 94, 24);
		contentPane.add(button);
	}
	
}
