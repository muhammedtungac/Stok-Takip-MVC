import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class StokKart�NewCopyController implements ActionListener {

	StokKart�Model model;
	StokKart�CopyFrameView copyFrameView;
	StokKart�FrameView frameView;
	public StokKart�NewCopyController() {
		// TODO Auto-generated constructor stub
		copyFrameView=StokKart�CopyFrameController.getCopyFrameView();
		frameView=StokKart�FrameController.getFrameView();
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		model=new StokKart�Model();
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
