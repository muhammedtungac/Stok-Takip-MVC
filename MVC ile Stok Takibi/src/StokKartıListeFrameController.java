import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;

public class StokKartýListeFrameController implements ActionListener {
	MainFrameView mainview;
	static StokKartýListeFrameView listeframeview;
	StokKartýModel model;
	StokKartýFrameView frameview;
	
	public StokKartýListeFrameController() {
		
		this.mainview=MainFrameController.getFrameView();
		this.listeframeview=new StokKartýListeFrameView();
		this.frameview=StokKartýFrameController.getFrameView();
		
		listeframeview.btnListele.addActionListener(new StokKartýListeleButtonController());
		
		listeframeview.StokKartýListeTable.addMouseListener(new StokKartýListeVeriCekmeController());
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			if(!listeframeview.isVisible()) {
				
				//listeframeview.btnListele.setVisible(true);
				mainview.desktopPane.add(listeframeview);
				listeframeview.setVisible(true);
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		
	}
public static StokKartýListeFrameView getListeFrameView() {
	return listeframeview; 
}
}
