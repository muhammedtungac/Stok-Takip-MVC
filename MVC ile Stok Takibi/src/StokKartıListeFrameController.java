import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;

public class StokKartıListeFrameController implements ActionListener {
	MainFrameView mainview;
	static StokKartıListeFrameView listeframeview;
	StokKartıModel model;
	StokKartıFrameView frameview;
	
	public StokKartıListeFrameController() {
		
		this.mainview=MainFrameController.getFrameView();
		this.listeframeview=new StokKartıListeFrameView();
		this.frameview=StokKartıFrameController.getFrameView();
		
		listeframeview.btnListele.addActionListener(new StokKartıListeleButtonController());
		
		listeframeview.StokKartıListeTable.addMouseListener(new StokKartıListeVeriCekmeController());
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
public static StokKartıListeFrameView getListeFrameView() {
	return listeframeview; 
}
}
