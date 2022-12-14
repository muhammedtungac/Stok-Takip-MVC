import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StokKartıSaveController implements ActionListener {

	StokKartıModel model;
	StokKartıFrameView frameview;
	
	public StokKartıSaveController() {
		
		this.frameview=StokKartıFrameController.getFrameView();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		/*
		model.setStokKodu(frameview.getStokKodu());
		model.setStokAdı(frameview.getStokAdı());
		model.setStokTipi(frameview.getStokTipi());
		model.setBirimi(frameview.getBirimi());
		model.setKDVTipi(frameview.getKDVTipi());
		model.setBarkodNo(frameview.getBarkodNo());
		model.setAçıklama(frameview.getAçıklama());
		model.setOluşturmaTarihi(frameview.getOluşturmaTarihi()); */
		this.model=new StokKartıModel();
		boolean saveControl=model.kontrol();
		if (saveControl==false) {
			model.insert();
		}
		else {
			model.update();
		}
	}

}
