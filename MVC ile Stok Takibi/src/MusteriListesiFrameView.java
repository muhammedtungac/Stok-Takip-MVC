import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;

public class MusteriListesiFrameView extends JInternalFrame {
	JTable table;
	DefaultTableModel model;

	public MusteriListesiFrameView() {
		setClosable(true);
		setIconifiable(true);
		setBounds(100, 100, 915, 600);
		getContentPane().setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		scrollPane.setVisible(true);
		getContentPane().add(scrollPane);
		scrollPane.setBounds(25, 70, 843, 460);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Firma \u0130smi", "Yetkili \u0130smi", "M\u00FC\u015Fteri Kod", "M\u00FC\u015Fteri Kargo", "Telefon", "\u00DClke", "Olu\u015Fturma Tarihi"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(96);
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setPreferredWidth(95);
		table.getColumnModel().getColumn(3).setPreferredWidth(93);
		table.getColumnModel().getColumn(4).setPreferredWidth(93);
		table.getColumnModel().getColumn(6).setPreferredWidth(111);
		scrollPane.setViewportView(table);
		table.setCellSelectionEnabled(false);
		
		JButton btnNewButton = new JButton("Listele");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(747, 23, 118, 34);
		getContentPane().add(btnNewButton);

	}
}
