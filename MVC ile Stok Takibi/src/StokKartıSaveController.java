import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StokKart�SaveController implements ActionListener {

	StokKart�Model model;
	StokKart�FrameView frameview;
	
	public StokKart�SaveController() {
		
		this.frameview=StokKart�FrameController.getFrameView();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		/*
		model.setStokKodu(frameview.getStokKodu());
		model.setStokAd�(frameview.getStokAd�());
		model.setStokTipi(frameview.getStokTipi());
		model.setBirimi(frameview.getBirimi());
		model.setKDVTipi(frameview.getKDVTipi());
		model.setBarkodNo(frameview.getBarkodNo());
		model.setA��klama(frameview.getA��klama());
		model.setOlu�turmaTarihi(frameview.getOlu�turmaTarihi()); */
		this.model=new StokKart�Model();
		boolean saveControl=model.kontrol();
		if (saveControl==false) {
			model.insert();
		}
		else {
			model.update();
		}
	}

}
