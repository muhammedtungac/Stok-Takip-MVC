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

public class StokKartıListeFrameView extends JInternalFrame {
	public DefaultTableModel tableModel;
	public JTable StokKartıListeTable;
	public JScrollPane scrollPane;
	public JButton btnListele;

	public StokKartıListeFrameView() {
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
		StokKartıListeTable = new JTable(tableModel);
		StokKartıListeTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		StokKartıListeTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Stok Kodu", "Stok Ad\u0131", "Stok Tipi", "Birimi", "Barkodu", "KDV Tipi", "A\u00E7\u0131klama", "Olu\u015Fturma Tarihi"
			}
		));
		StokKartıListeTable.getColumnModel().getColumn(1).setPreferredWidth(99);
		StokKartıListeTable.getColumnModel().getColumn(5).setPreferredWidth(86);
		StokKartıListeTable.getColumnModel().getColumn(6).setPreferredWidth(122);
		StokKartıListeTable.getColumnModel().getColumn(7).setPreferredWidth(119);
		StokKartıListeTable.setBounds(285, 327, 263, -142);
		tableModel=(DefaultTableModel) StokKartıListeTable.getModel();
		scrollPane.setViewportView(StokKartıListeTable);
		StokKartıListeTable.getFillsViewportHeight();
		StokKartıListeTable.setColumnSelectionAllowed(true);		
		//StokKartıListeTable.isCellEditable(0, 0);
		//tableModel.isCellEditable(0, 0);	
		btnListele = new JButton("Listele");
		btnListele.setFont(new Font("Arial", Font.BOLD, 14));
		btnListele.setBounds(751, 15, 126, 36);
		getContentPane().add(btnListele);

	}	
}
