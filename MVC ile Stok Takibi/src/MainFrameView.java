import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Cursor;
import javax.swing.border.SoftBevelBorder;

import com.sun.glass.ui.Window;

import javax.swing.border.BevelBorder;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;
import java.util.Locale;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;

public class MainFrameView extends JFrame {

	JMenuBar MainMenuBar = new JMenuBar();
	JMenu StokMenu = new JMenu("Stok");
	JDesktopPane desktopPane = new JDesktopPane();
	JPanel contentPane = new JPanel();
	public JMenuItem StokKartýMenuItem = new JMenuItem("Stok Kart\u0131");
	Baglanti baglanti= new Baglanti();
	public JMenuItem StokKartýListesiMenuItem = new JMenuItem("Stok Kart\u0131 Listesi");
	public JMenu MusteriMenu = new JMenu("M\u00FC\u015Fteri");
	public JMenuItem MusteriEkleItem = new JMenuItem("M\u00FC\u015Fteri Ekle");
	public JMenuItem MusteriListesiItem = new JMenuItem("M\u00FC\u015Fteri Listesi");
	public JMenu mnSatis = new JMenu("Sat\u0131\u015F");
	public JMenuItem SatisYapItem = new JMenuItem("Sat\u0131\u015F Yap");
	public JMenuItem SatisListesiItem = new JMenuItem("Sat\u0131\u015F Listesi");
	public MainFrameView() {
		setState(Frame.ICONIFIED);
		setTitle("Ana Sayfa");
		setLocale(new Locale("tr", "TR"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(0, 0, 1920, 1035);
					
		setJMenuBar(MainMenuBar);
		
		MainMenuBar.add(StokMenu);
			
		StokMenu.add(StokKartýMenuItem);
		
		StokMenu.add(StokKartýListesiMenuItem);
		
		MainMenuBar.add(MusteriMenu);
		
		
		MusteriMenu.add(MusteriEkleItem);
		
		MusteriMenu.add(MusteriListesiItem);
		
		MainMenuBar.add(mnSatis);
		
		mnSatis.add(SatisYapItem);
		
		mnSatis.add(SatisListesiItem);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
						
		desktopPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		desktopPane.setBounds(getX(), getY(), WIDTH, HEIGHT);
		desktopPane.setLayout(null);
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
