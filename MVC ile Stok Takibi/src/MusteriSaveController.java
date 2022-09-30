import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusteriSaveController implements ActionListener {
	 MusteriModel model;
	 MusteriFrameView musteriFrameView;
	
	
	public MusteriSaveController() {
		this.musteriFrameView=MusteriFrameController.getMusteriFrameView();
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	this.model=new MusteriModel();
	model.insert();

	}

}
