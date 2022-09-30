import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ListSelectionModel;
import javax.swing.DropMode;
import javax.swing.JScrollBar;

public class StokKartýListeFrameView extends JInternalFrame {
	public DefaultTableModel tableModel;
	public JTable StokKartýListeTable;
	public JScrollPane scrollPane;
	public JButton btnListele;

	public StokKartýListeFrameView() {
		setClosable(true);
		setIconifiable(true);
		setMaximizable(true);
		setResizable(true);
		setTitle("Stok Kart\u0131 Listesi");
		setBounds(100, 100, 903, 626);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 62, 715, 523);
		getContentPane().add(scrollPane);
		;
		StokKartýListeTable = new JTable(tableModel);
		StokKartýListeTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		StokKartýListeTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Stok Kodu", "Stok Ad\u0131", "Stok Tipi", "Birimi", "Barkodu", "KDV Tipi", "A\u00E7\u0131klama", "Olu\u015Fturma Tarihi"
			}
		));
		StokKartýListeTable.getColumnModel().getColumn(1).setPreferredWidth(99);
		StokKartýListeTable.getColumnModel().getColumn(5).setPreferredWidth(86);
		StokKartýListeTable.getColumnModel().getColumn(6).setPreferredWidth(122);
		StokKartýListeTable.getColumnModel().getColumn(7).setPreferredWidth(119);
		StokKartýListeTable.setBounds(285, 327, 263, -142);
		tableModel=(DefaultTableModel) StokKartýListeTable.getModel();
		scrollPane.setViewportView(StokKartýListeTable);
		StokKartýListeTable.getFillsViewportHeight();
		StokKartýListeTable.setColumnSelectionAllowed(true);		
		//StokKartýListeTable.isCellEditable(0, 0);
		//tableModel.isCellEditable(0, 0);	
		btnListele = new JButton("Listele");
		btnListele.setFont(new Font("Arial", Font.BOLD, 14));
		btnListele.setBounds(751, 15, 126, 36);
		getContentPane().add(btnListele);

	}	
}
