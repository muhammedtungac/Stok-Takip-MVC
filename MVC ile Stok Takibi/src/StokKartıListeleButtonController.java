import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StokKart�ListeleButtonController implements ActionListener {

	StokKart�ListeFrameView listeframeview;
	public StokKart�ListeleButtonController() {
		
		this.listeframeview=StokKart�ListeFrameController.getListeFrameView();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		listeframeview.tableModel.setRowCount(0);
		StokKart�Model.tabloGoster();
		//listeframeview.btnListele.setVisible(false);

	}

}
