import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StokKartıListeleButtonController implements ActionListener {

	StokKartıListeFrameView listeframeview;
	public StokKartıListeleButtonController() {
		
		this.listeframeview=StokKartıListeFrameController.getListeFrameView();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		listeframeview.tableModel.setRowCount(0);
		StokKartıModel.tabloGoster();
		//listeframeview.btnListele.setVisible(false);

	}

}
