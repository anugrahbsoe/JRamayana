package ramayana;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import com.jtattoo.plaf.acryl.*;

//@Anugrah Bagus S

	public class PGbar extends JWindow
{
		private Dimension Layar = Toolkit.getDefaultToolkit().getScreenSize();
		private JLabel lblLogo = new JLabel(new ImageIcon("src/Image/wayang1.jpg"));
		private JProgressBar barisProgres = new JProgressBar();
		private int time = 0;
		private Timer timer;

		public PGbar()
	{
		//Menyiapkan Warna
		Color Warna = Color.black;

		//mengatur baris progress
		barisProgres.setValue(0);
		barisProgres.setPreferredSize(new Dimension(100,15));
		barisProgres.setBackground(Color.black);
		barisProgres.setForeground(Color.gray);
		barisProgres.setStringPainted(true);

		//Mengatur warna garis pinggir
		barisProgres.setBorder(new LineBorder(Warna,1));
		lblLogo.setBorder(new LineBorder(Warna,1));

		//Menempatkan objek ke container
		getContentPane().add(lblLogo,BorderLayout.NORTH);
		getContentPane().add(barisProgres,BorderLayout.CENTER);

		//Mengatur lama window tampil di layar
		timer = new Timer(50,new ActionListener()
			{
				public void actionPerformed(ActionEvent act)
				{
					time++;
					barisProgres.setValue(time);
					if(barisProgres.getPercentComplete()==1.0)
					{
						timer.stop();
						setVisible(false);
						//Menjalankan menu master
						Main main = new Main();
						main.show();
					}
				}
			}

			);

		timer.start();
		//Menempatkan objek ke memori sblom di tampilkan
		pack();

		//Mengatur lokasi window di tengah monitor
		setLocation(Layar.width/2-getWidth()/2,Layar.height/2-getHeight()/2);
		//Menampilkan windows
		show();
	}

		//Deklarasi method utama
		public static void main(String[]args) throws UnsupportedLookAndFeelException
		{	
			UIManager.setLookAndFeel(new AcrylLookAndFeel());
			new PGbar();
		}
}

