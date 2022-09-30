import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class StokKartýCopyFrameView extends JInternalFrame {
	static JTextField txtYeniStokKodu;
	static JButton btnKaydet;

	public StokKartýCopyFrameView() {
		setAutoscrolls(true);
		setTitle("Kopyalama");
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 350, 210);
		getContentPane().setLayout(null);
		
		txtYeniStokKodu = new JTextField();
		txtYeniStokKodu.setBounds(137, 51, 128, 22);
		getContentPane().add(txtYeniStokKodu);
		txtYeniStokKodu.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Stok Kodu :");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(50, 54, 87, 16);
		getContentPane().add(lblNewLabel);
		
		btnKaydet = new JButton("Kaydet");
		btnKaydet.setFont(new Font("Arial", Font.BOLD, 14));
		btnKaydet.setBounds(108, 103, 116, 33);
		getContentPane().add(btnKaydet);

	}
	public static String getYeniStokKodu() {
		return txtYeniStokKodu.getText();		
	}	
}
