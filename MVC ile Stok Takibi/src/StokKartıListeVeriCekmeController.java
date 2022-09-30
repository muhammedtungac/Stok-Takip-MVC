import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class StokKart�ListeVeriCekmeController implements MouseListener {
	StokKart�Model model;
	static StokKart�ListeFrameView listeFrameview;
	StokKart�FrameView frameview;
	public StokKart�ListeVeriCekmeController() {
		
		this.listeFrameview=StokKart�ListeFrameController.getListeFrameView();
		this.frameview=StokKart�FrameController.getFrameView();
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//listeframeview.StokKart�ListeTable.setEnabled(true);
		int secili=listeFrameview.StokKart�ListeTable.getSelectedRow();
		
		if (secili!=-1) {
			
			frameview.setStokKodu(listeFrameview.StokKart�ListeTable.getValueAt(secili, 0).toString());
			frameview.setStokAd�(listeFrameview.StokKart�ListeTable.getValueAt(secili, 1).toString());
			frameview.setStokTipi((int)listeFrameview.StokKart�ListeTable.getValueAt(secili, 2));
			frameview.setBirimi(listeFrameview.StokKart�ListeTable.getValueAt(secili, 3).toString());
			frameview.setBarkodNo(listeFrameview.StokKart�ListeTable.getValueAt(secili, 4).toString());
			frameview.setKDVTipi(listeFrameview.StokKart�ListeTable.getValueAt(secili, 5).toString());
			frameview.setA��klama(listeFrameview.StokKart�ListeTable.getValueAt(secili, 6).toString());
			frameview.setOlu�turmaTarihi(listeFrameview.StokKart�ListeTable.getValueAt(secili, 7).toString());
			//listeframeview.StokKart�ListeTable.setCellSelectionEnabled(false);
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
		/*boolean a=listeframeview.StokKart�ListeTable.isEditing();
		if (a==false) {
			JOptionPane.showMessageDialog(null,null);
		}*/
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
