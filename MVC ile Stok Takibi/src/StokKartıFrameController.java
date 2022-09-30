import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class StokKartýFrameController implements ActionListener {
	
	static StokKartýFrameView frameview;
	MainFrameView mainview;
	public StokKartýFrameController() {		
		this.frameview=new StokKartýFrameView();		
		this.mainview=MainFrameController.getFrameView();
		
			frameview.txtStokKodu.addKeyListener(new StokKartýBringController());	 
		
			frameview.btnKaydet.addActionListener(new StokKartýSaveController());

			frameview.btnSil.addActionListener(new StokKartýDeleteController());
			
			frameview.btnKopyalaYönlendir.addActionListener(new StokKartýCopyFrameController());
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//frameview=new StokKartýFrameView();
			try {
				if(!frameview.isVisible()) {
					StokKartýFrameView.temizle();
					mainview.desktopPane.add(frameview);	
					frameview.setVisible(true);					
				}
			} catch (Exception e1) {				
				e1.getStackTrace();
			}									
	}
	public static StokKartýFrameView getFrameView() {
		return frameview;
	}
}