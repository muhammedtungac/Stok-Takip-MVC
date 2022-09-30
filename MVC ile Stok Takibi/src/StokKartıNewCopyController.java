import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class StokKartýNewCopyController implements ActionListener {

	StokKartýModel model;
	StokKartýCopyFrameView copyFrameView;
	StokKartýFrameView frameView;
	public StokKartýNewCopyController() {
		// TODO Auto-generated constructor stub
		copyFrameView=StokKartýCopyFrameController.getCopyFrameView();
		frameView=StokKartýFrameController.getFrameView();
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		model=new StokKartýModel();
		model.setStokKodu(copyFrameView.getYeniStokKodu());
		boolean saveControl=model.kontrol();
		if (saveControl==false) {
			model.insert();
		}
		else {
			model.update();
		}		
	}
}
