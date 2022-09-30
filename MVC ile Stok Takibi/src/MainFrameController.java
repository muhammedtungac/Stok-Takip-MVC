import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import javax.swing.JMenuItem;
import com.sun.org.apache.xpath.internal.SourceTree;

public class MainFrameController{
	static MainFrameView mainview;
	static MainFrameController controller;
	
	public static void main(String[] args) {
		
				try {					
					mainview= new MainFrameView();
					mainview.setVisible(true);					
					controller=new MainFrameController();
				} catch (Exception e) {
					e.printStackTrace();
				}	
		}	
		public MainFrameController() {
		
			mainview.StokKartýMenuItem.addActionListener(new StokKartýFrameController());			
			mainview.StokKartýListesiMenuItem.addActionListener(new StokKartýListeFrameController());
			mainview.MusteriEkleItem.addActionListener(new MusteriFrameController());
			mainview.MusteriListesiItem.addActionListener(new MusteriListesiFrameController());
			mainview.SatisYapItem.addActionListener(new SatisYapFrameController());	
			mainview.SatisListesiItem.addActionListener(new SatisListesiFrameController());
		}
	
		public static MainFrameView getFrameView() {
			return mainview;
		}		
}
