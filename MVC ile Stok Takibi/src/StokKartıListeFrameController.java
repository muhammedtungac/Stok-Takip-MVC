import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;

public class StokKart�ListeFrameController implements ActionListener {
	MainFrameView mainview;
	static StokKart�ListeFrameView listeframeview;
	StokKart�Model model;
	StokKart�FrameView frameview;
	
	public StokKart�ListeFrameController() {
		
		this.mainview=MainFrameController.getFrameView();
		this.listeframeview=new StokKart�ListeFrameView();
		this.frameview=StokKart�FrameController.getFrameView();
		
		listeframeview.btnListele.addActionListener(new StokKart�ListeleButtonController());
		
		listeframeview.StokKart�ListeTable.addMouseListener(new StokKart�ListeVeriCekmeController());
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
public static StokKart�ListeFrameView getListeFrameView() {
	return listeframeview; 
}
}
