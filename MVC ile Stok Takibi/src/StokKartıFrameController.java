import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class StokKart�FrameController implements ActionListener {
	
	static StokKart�FrameView frameview;
	MainFrameView mainview;
	public StokKart�FrameController() {		
		this.frameview=new StokKart�FrameView();		
		this.mainview=MainFrameController.getFrameView();
		
			frameview.txtStokKodu.addKeyListener(new StokKart�BringController());	 
		
			frameview.btnKaydet.addActionListener(new StokKart�SaveController());

			frameview.btnSil.addActionListener(new StokKart�DeleteController());
			
			frameview.btnKopyalaY�nlendir.addActionListener(new StokKart�CopyFrameController());
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//frameview=new StokKart�FrameView();
			try {
				if(!frameview.isVisible()) {
					StokKart�FrameView.temizle();
					mainview.desktopPane.add(frameview);	
					frameview.setVisible(true);					
				}
			} catch (Exception e1) {				
				e1.getStackTrace();
			}									
	}
	public static StokKart�FrameView getFrameView() {
		return frameview;
	}
}