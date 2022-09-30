import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class StokKartıListeVeriCekmeController implements MouseListener {
	StokKartıModel model;
	static StokKartıListeFrameView listeFrameview;
	StokKartıFrameView frameview;
	public StokKartıListeVeriCekmeController() {
		
		this.listeFrameview=StokKartıListeFrameController.getListeFrameView();
		this.frameview=StokKartıFrameController.getFrameView();
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//listeframeview.StokKartıListeTable.setEnabled(true);
		int secili=listeFrameview.StokKartıListeTable.getSelectedRow();
		
		if (secili!=-1) {
			
			frameview.setStokKodu(listeFrameview.StokKartıListeTable.getValueAt(secili, 0).toString());
			frameview.setStokAdı(listeFrameview.StokKartıListeTable.getValueAt(secili, 1).toString());
			frameview.setStokTipi((int)listeFrameview.StokKartıListeTable.getValueAt(secili, 2));
			frameview.setBirimi(listeFrameview.StokKartıListeTable.getValueAt(secili, 3).toString());
			frameview.setBarkodNo(listeFrameview.StokKartıListeTable.getValueAt(secili, 4).toString());
			frameview.setKDVTipi(listeFrameview.StokKartıListeTable.getValueAt(secili, 5).toString());
			frameview.setAçıklama(listeFrameview.StokKartıListeTable.getValueAt(secili, 6).toString());
			frameview.setOluşturmaTarihi(listeFrameview.StokKartıListeTable.getValueAt(secili, 7).toString());
			//listeframeview.StokKartıListeTable.setCellSelectionEnabled(false);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		/*boolean a=listeframeview.StokKartıListeTable.isEditing();
		if (a==false) {
			JOptionPane.showMessageDialog(null,null);
		}*/
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
