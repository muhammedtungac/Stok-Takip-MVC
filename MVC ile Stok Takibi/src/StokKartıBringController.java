import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class StokKart�BringController implements KeyListener {

	
	StokKart�FrameView frameview;
	public StokKart�BringController() {
	
	this.frameview=StokKart�FrameController.getFrameView();

	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		StokKart�Model.getir();	
	}

	@Override
	public void keyTyped(KeyEvent e) {
			
	}

}
