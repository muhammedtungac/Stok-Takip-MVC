import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StokKartýDeleteController implements ActionListener{

	StokKartýFrameView frameview;
	StokKartýModel model=new StokKartýModel();
	
	public StokKartýDeleteController() {
		this.frameview=StokKartýFrameController.getFrameView();	
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		model.setStokKodu(frameview.getStokKodu());
		model.delete();
	}

}
