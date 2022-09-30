import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StokKartıDeleteController implements ActionListener{

	StokKartıFrameView frameview;
	StokKartıModel model=new StokKartıModel();
	
	public StokKartıDeleteController() {
		this.frameview=StokKartıFrameController.getFrameView();	
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		model.setStokKodu(frameview.getStokKodu());
		model.delete();
	}

}
