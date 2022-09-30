import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class StokKartıBringController implements KeyListener {

	
	StokKartıFrameView frameview;
	public StokKartıBringController() {
	
	this.frameview=StokKartıFrameController.getFrameView();

	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		StokKartıModel.getir();	
	}

	@Override
	public void keyTyped(KeyEvent e) {
			
	}

}
