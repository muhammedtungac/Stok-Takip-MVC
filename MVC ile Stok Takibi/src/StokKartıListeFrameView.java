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

public class StokKart�ListeFrameView extends JInternalFrame {
	public DefaultTableModel tableModel;
	public JTable StokKart�ListeTable;
	public JScrollPane scrollPane;
	public JButton btnListele;

	public StokKart�ListeFrameView() {
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
		StokKart�ListeTable = new JTable(tableModel);
		StokKart�ListeTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		StokKart�ListeTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Stok Kodu", "Stok Ad\u0131", "Stok Tipi", "Birimi", "Barkodu", "KDV Tipi", "A\u00E7\u0131klama", "Olu\u015Fturma Tarihi"
			}
		));
		StokKart�ListeTable.getColumnModel().getColumn(1).setPreferredWidth(99);
		StokKart�ListeTable.getColumnModel().getColumn(5).setPreferredWidth(86);
		StokKart�ListeTable.getColumnModel().getColumn(6).setPreferredWidth(122);
		StokKart�ListeTable.getColumnModel().getColumn(7).setPreferredWidth(119);
		StokKart�ListeTable.setBounds(285, 327, 263, -142);
		tableModel=(DefaultTableModel) StokKart�ListeTable.getModel();
		scrollPane.setViewportView(StokKart�ListeTable);
		StokKart�ListeTable.getFillsViewportHeight();
		StokKart�ListeTable.setColumnSelectionAllowed(true);		
		//StokKart�ListeTable.isCellEditable(0, 0);
		//tableModel.isCellEditable(0, 0);	
		btnListele = new JButton("Listele");
		btnListele.setFont(new Font("Arial", Font.BOLD, 14));
		btnListele.setBounds(751, 15, 126, 36);
		getContentPane().add(btnListele);

	}	
}
