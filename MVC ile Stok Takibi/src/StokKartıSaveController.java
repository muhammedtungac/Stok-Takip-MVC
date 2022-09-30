import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StokKartýSaveController implements ActionListener {

	StokKartýModel model;
	StokKartýFrameView frameview;
	
	public StokKartýSaveController() {
		
		this.frameview=StokKartýFrameController.getFrameView();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		/*
		model.setStokKodu(frameview.getStokKodu());
		model.setStokAdý(frameview.getStokAdý());
		model.setStokTipi(frameview.getStokTipi());
		model.setBirimi(frameview.getBirimi());
		model.setKDVTipi(frameview.getKDVTipi());
		model.setBarkodNo(frameview.getBarkodNo());
		model.setAçýklama(frameview.getAçýklama());
		model.setOluþturmaTarihi(frameview.getOluþturmaTarihi()); */
		this.model=new StokKartýModel();
		boolean saveControl=model.kontrol();
		if (saveControl==false) {
			model.insert();
		}
		else {
			model.update();
		}
	}

}
