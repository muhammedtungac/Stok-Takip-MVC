import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StokKartýListeleButtonController implements ActionListener {

	StokKartýListeFrameView listeframeview;
	public StokKartýListeleButtonController() {
		
		this.listeframeview=StokKartýListeFrameController.getListeFrameView();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		listeframeview.tableModel.setRowCount(0);
		StokKartýModel.tabloGoster();
		//listeframeview.btnListele.setVisible(false);

	}

}
