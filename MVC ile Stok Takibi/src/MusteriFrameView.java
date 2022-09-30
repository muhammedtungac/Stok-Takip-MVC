import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.time.LocalDateTime;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.JFormattedTextField;

public class MusteriFrameView extends JInternalFrame {
	JButton btnKaydet;
	static JTextField txtMusteriId;
	static JTextField txtFirmaIsim;
	static JTextField txtYetkiliIsim;
	static JTextField txtMusteriKod;
	static JTextField txtMusteriKargo;
	static JTextField txtMusteriTel;
	static JTextField txtMusteriUlke;
    JLabel lblFirmaNo;
	JLabel lblOlusturmaTarihi;
	static JFormattedTextField formatOlusturmaTarihi;
	static LocalDateTime date=LocalDateTime.now();
	JLabel lblMteriId;
	
	public MusteriFrameView() {
		setClosable(true);
		setIconifiable(true);
		setTitle("Yabanc\u0131 M\u00FC\u015Fteri Ekle");
		setBounds(100, 100, 700, 450);
		getContentPane().setLayout(null);
		
		txtFirmaIsim = new JTextField();
		txtFirmaIsim.setBounds(303, 71, 150, 22);
		getContentPane().add(txtFirmaIsim);
		txtFirmaIsim.setColumns(10);
		
		txtYetkiliIsim = new JTextField();
		txtYetkiliIsim.setBounds(303, 106, 150, 22);
		getContentPane().add(txtYetkiliIsim);
		txtYetkiliIsim.setColumns(10);
		
		txtMusteriKod = new JTextField();
		txtMusteriKod.setBounds(303, 141, 150, 22);
		getContentPane().add(txtMusteriKod);
		txtMusteriKod.setColumns(10);
		
		txtMusteriKargo = new JTextField();
		txtMusteriKargo.setBounds(303, 176, 150, 22);
		getContentPane().add(txtMusteriKargo);
		txtMusteriKargo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Firma \u0130sim : ");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(164, 74, 94, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblYetkiliIsim = new JLabel("Yetkili \u0130sim :");
		lblYetkiliIsim.setFont(new Font("Arial", Font.BOLD, 14));
		lblYetkiliIsim.setBounds(164, 109, 94, 16);
		getContentPane().add(lblYetkiliIsim);
		
		JLabel lblMteriKod = new JLabel("M\u00FC\u015Fteri Kod :");
		lblMteriKod.setFont(new Font("Arial", Font.BOLD, 14));
		lblMteriKod.setBounds(164, 144, 94, 16);
		getContentPane().add(lblMteriKod);
		
		JLabel lblMteriKargo = new JLabel("M\u00FC\u015Fteri Kargo :");
		lblMteriKargo.setFont(new Font("Arial", Font.BOLD, 14));
		lblMteriKargo.setBounds(164, 179, 111, 16);
		getContentPane().add(lblMteriKargo);
		
		lblFirmaNo = new JLabel("M\u00FC\u015Fteri Tel :");
		lblFirmaNo.setFont(new Font("Arial", Font.BOLD, 14));
		lblFirmaNo.setBounds(164, 214, 100, 16);
		getContentPane().add(lblFirmaNo);
		
		txtMusteriTel = new JTextField();
		txtMusteriTel.setColumns(10);
		txtMusteriTel.setBounds(303, 211, 150, 22);
		getContentPane().add(txtMusteriTel);
		
		btnKaydet = new JButton("Kaydet");
		btnKaydet.setBorder(null);
		btnKaydet.setFont(new Font("Arial", Font.BOLD, 14));
		btnKaydet.setBounds(450, 337, 123, 32);
		getContentPane().add(btnKaydet);
		
		JLabel lblMterilke = new JLabel("M\u00FC\u015Fteri \u00DClke :");
		lblMterilke.setFont(new Font("Arial", Font.BOLD, 14));
		lblMterilke.setBounds(164, 249, 100, 16);
		getContentPane().add(lblMterilke);
		
		txtMusteriUlke = new JTextField();
		txtMusteriUlke.setColumns(10);
		txtMusteriUlke.setBounds(303, 246, 150, 22);
		getContentPane().add(txtMusteriUlke);
		
		lblOlusturmaTarihi = new JLabel("Olu\u015Fturma Tarihi :");
		lblOlusturmaTarihi.setFont(new Font("Arial", Font.BOLD, 14));
		lblOlusturmaTarihi.setBounds(163, 282, 129, 16);
		getContentPane().add(lblOlusturmaTarihi);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setEditable(false);
		formattedTextField.setBounds(303, 281, 150, 22);
		getContentPane().add(formattedTextField);
		
		lblMteriId = new JLabel("M\u00FC\u015Fteri ID :");
		lblMteriId.setVisible(false);
		lblMteriId.setFont(new Font("Arial", Font.BOLD, 14));
		lblMteriId.setBounds(164, 42, 94, 16);
		getContentPane().add(lblMteriId);
		
		txtMusteriId = new JTextField();
		txtMusteriId.setVisible(false);
		txtMusteriId.setColumns(10);
		txtMusteriId.setBounds(303, 39, 150, 22);
		getContentPane().add(txtMusteriId);

	}
	public static String getMusteriId() {	
		return txtMusteriId.getText();
	}
	public static void setMusteriId(String musteriId) {
		txtMusteriId.setText(musteriId);
	}
	
	public static String getFirmaIsim() {	
		return txtFirmaIsim.getText();
	}
	public static void setFirmaIsim(String firmaIsim) {
		txtFirmaIsim.setText(firmaIsim);
	}
	
	public static String getYetkiliIsim() {	
		return txtYetkiliIsim.getText();
	}
	public static void setYetkiliIsim(String yetkiliIsim) {
		txtYetkiliIsim.setText(yetkiliIsim);
	}
	
	public static String getMusteriKod() {	
		return txtMusteriKod.getText();
	}
	public static void setMusteriKod(String musteriKod) {
		txtMusteriKod.setText(musteriKod);
	}
	
	public static String getMusteriKargo() {		
		return txtMusteriKargo.getText();
	}
	public static void setMusteriKargo(String musteriKargo) {
		txtMusteriKargo.setText(musteriKargo);
	}
	
	public static String getMusteriTel() {		
		return txtMusteriTel.getText();
	}
	public static void setMusteriTel(String musteriTel) {
		txtMusteriTel.setText(musteriTel);
	}
	
	public static String getMusteriUlke() {		
		return txtMusteriUlke.getText();
	}
	public static void setMusteriUlke(String musteriUlke) {
		txtMusteriUlke.setText(musteriUlke);
	}
	
	public static Object getOlusturmaTarihi() {
		return date.now();
	}
	public void setOlusturmaTarihi(Object olusturmaTarihi) {
		this.formatOlusturmaTarihi.setText(olusturmaTarihi.toString());
	}
}
