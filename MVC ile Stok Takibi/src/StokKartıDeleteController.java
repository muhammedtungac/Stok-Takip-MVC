import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StokKart�DeleteController implements ActionListener{

	StokKart�FrameView frameview;
	StokKart�Model model=new StokKart�Model();
	
	public StokKart�DeleteController() {
		this.frameview=StokKart�FrameController.getFrameView();	
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		model.setStokKodu(frameview.getStokKodu());
		model.delete();
	}

}
