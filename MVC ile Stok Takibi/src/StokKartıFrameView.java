import java.awt.EventQueue;
import java.beans.PropertyVetoException;
import java.time.LocalDateTime;

import javax.swing.JInternalFrame;
import javax.swing.JList;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Rectangle;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class StokKart�FrameView extends JInternalFrame {
	static JTextField txtStokKodu;
	static JTextField txtStokAd�;
	static JTextField txtBarkodNo;
	static JTextArea areaA��klama;
	static JComboBox comboKDVTipi;
	static JComboBox comboStokTipi;
	static JComboBox comboBirimi;
	JButton btnKaydet;
	JButton btnSil;
	static JFormattedTextField formatOlu�turmaTarihi;
	static LocalDateTime date=LocalDateTime.now();
	JButton btnKopyalaY�nlendir;
	//MainFrameView mainview= new MainFrameView();

	public StokKart�FrameView() {
		setOpaque(true);
		setAutoscrolls(true);
		areaA��klama = new JTextArea();
		areaA��klama.setAutoscrolls(false);
		comboKDVTipi = new JComboBox();
		comboStokTipi = new JComboBox();
		comboBirimi = new JComboBox();
		formatOlu�turmaTarihi = new JFormattedTextField();
		formatOlu�turmaTarihi.setAutoscrolls(false);
		setTitle("Stok Kart\u0131");
		setClosable(true);	
		setIconifiable(true);
		//setResizable(true);
		setBounds(0, 0, 675, 500);
		
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Stok Kodu :");
		lblNewLabel.setInheritsPopupMenu(false);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(169, 16, 86, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblStokAd = new JLabel("Stok Ad\u0131 :");
		lblStokAd.setInheritsPopupMenu(false);
		lblStokAd.setFont(new Font("Arial", Font.BOLD, 14));
		lblStokAd.setBounds(169, 49, 86, 16);
		getContentPane().add(lblStokAd);
		
		JLabel lblStokTipi = new JLabel("Stok Tipi :");
		lblStokTipi.setInheritsPopupMenu(false);
		lblStokTipi.setFont(new Font("Arial", Font.BOLD, 14));
		lblStokTipi.setBounds(169, 78, 86, 16);
		getContentPane().add(lblStokTipi);
		
		JLabel lblBirimi = new JLabel("Birimi :");
		lblBirimi.setInheritsPopupMenu(false);
		lblBirimi.setFont(new Font("Arial", Font.BOLD, 14));
		lblBirimi.setBounds(169, 107, 86, 16);
		getContentPane().add(lblBirimi);
		
		JLabel lblKdvTipi = new JLabel("KDV Tipi :");
		lblKdvTipi.setInheritsPopupMenu(false);
		lblKdvTipi.setFont(new Font("Arial", Font.BOLD, 14));
		lblKdvTipi.setBounds(169, 165, 86, 16);
		getContentPane().add(lblKdvTipi);
		
		JLabel lblBarkodNo = new JLabel("Barkod No :");
		lblBarkodNo.setInheritsPopupMenu(false);
		lblBarkodNo.setFont(new Font("Arial", Font.BOLD, 14));
		lblBarkodNo.setBounds(169, 136, 86, 16);
		getContentPane().add(lblBarkodNo);
		
		JLabel lblAklama = new JLabel("A\u00E7\u0131klama :");
		lblAklama.setInheritsPopupMenu(false);
		lblAklama.setFont(new Font("Arial", Font.BOLD, 14));
		lblAklama.setBounds(169, 194, 86, 16);
		getContentPane().add(lblAklama);
		
		JLabel lblOluturmaTarihi = new JLabel("Olu\u015Fturma Tarihi :");
		lblOluturmaTarihi.setInheritsPopupMenu(false);
		lblOluturmaTarihi.setFont(new Font("Arial", Font.BOLD, 14));
		lblOluturmaTarihi.setBounds(169, 286, 131, 16);
		getContentPane().add(lblOluturmaTarihi);
		
		btnKaydet = new JButton("Kaydet");
		
		btnKaydet.setFont(new Font("Arial", Font.BOLD, 14));
		btnKaydet.setBounds(78, 340, 145, 40);
		getContentPane().add(btnKaydet);
		
		txtStokKodu = new JTextField();
		txtStokKodu.setAutoscrolls(false);
		
		txtStokKodu.setBounds(267, 13, 146, 22);
		getContentPane().add(txtStokKodu);
		txtStokKodu.setColumns(10);
		
		txtStokAd� = new JTextField();
		txtStokAd�.setAutoscrolls(false);
		txtStokAd�.setBounds(267, 46, 146, 22);
		getContentPane().add(txtStokAd�);
		txtStokAd�.setColumns(10);
			
		areaA��klama.setBounds(267, 196, 145, 77);
		getContentPane().add(areaA��klama);
		comboKDVTipi.setModel(new DefaultComboBoxModel(new String[] {"", "0.18"}));
				
		comboKDVTipi.setBounds(267, 162, 146, 22);
		getContentPane().add(comboKDVTipi);
		comboStokTipi.setModel(new DefaultComboBoxModel(new String[] {"", "Kuma\u015F", "Aksesuar", "\u0130plik"}));
		comboStokTipi.setBounds(267, 75, 146, 22);
		getContentPane().add(comboStokTipi);
		comboBirimi.setModel(new DefaultComboBoxModel(new String[] {"", "Kg", "Top", "Adet"}));
				
		comboBirimi.setBounds(267, 104, 146, 22);
		getContentPane().add(comboBirimi);
		
		txtBarkodNo = new JTextField();
		txtBarkodNo.setAutoscrolls(false);
		txtBarkodNo.setColumns(10);
		txtBarkodNo.setBounds(267, 133, 146, 22);
		getContentPane().add(txtBarkodNo);
			
		formatOlu�turmaTarihi.setEditable(false);
		formatOlu�turmaTarihi.setBounds(312, 283, 145, 31);
		getContentPane().add(formatOlu�turmaTarihi);
		
		btnSil = new JButton("Sil");
		btnSil.setFont(new Font("Arial", Font.BOLD, 14));
		btnSil.setBounds(235, 340, 145, 40);
		getContentPane().add(btnSil);
		
		btnKopyalaY�nlendir = new JButton("Kopyalama");
		btnKopyalaY�nlendir.setFont(new Font("Arial", Font.BOLD, 14));
		btnKopyalaY�nlendir.setBounds(392, 340, 138, 40);
		getContentPane().add(btnKopyalaY�nlendir);
		
	}
	
public static String getStokKodu() {
		
return txtStokKodu.getText();
}
public void setStokKodu(String StokKodu) {
	
this.txtStokKodu.setText(StokKodu);
}


public static String getStokAd�() {
	
return txtStokAd�.getText();
}
public void setStokAd�(String StokAd�) {
	
this.txtStokAd�.setText(StokAd�);
}


public static int getStokTipi() {
	
return comboStokTipi.getSelectedIndex();
}
public void setStokTipi(int StokTipi) {
	
this.comboStokTipi.setSelectedIndex(StokTipi);
}


public static String getBirimi() {
	
return comboBirimi.getSelectedItem().toString();
}
public void setBirimi(String Birimi) {
	
this.comboBirimi.setSelectedItem(Birimi);
}


public static String getBarkodNo() {
	
return txtBarkodNo.getText();
}
public void setBarkodNo(String BarkodNo) {
	
this.txtBarkodNo.setText(BarkodNo);
}


public static double getKDVTipi() {
	if(comboKDVTipi.getSelectedItem().toString().equals("")) {
		return 0.0;
	}
	else {
		String kdv=comboKDVTipi.getSelectedItem().toString();
		return Double.parseDouble(kdv);
	}

}
public void setKDVTipi(String KDVTipi) {
	this.comboKDVTipi.setSelectedItem(KDVTipi);
}


public static String getA��klama() {
	
return areaA��klama.getText();
}
public void setA��klama(String A��klama) {
	
this.areaA��klama.setText(A��klama);
}


public static Object getOlu�turmaTarihi() {
	return date.now();
}
public void setOlu�turmaTarihi(Object Olu�turmaTarihi) {
	this.formatOlu�turmaTarihi.setText(Olu�turmaTarihi.toString());
}
public static void temizle() {
	areaA��klama.setText("");
	txtStokKodu.setText("");
	txtStokAd�.setText("");
	txtBarkodNo.setText("");
	areaA��klama.setText("");
	comboBirimi.setSelectedIndex(0);
	comboKDVTipi.setSelectedIndex(0);
	comboStokTipi.setSelectedIndex(0);
	formatOlu�turmaTarihi.setText("");	
}
}
