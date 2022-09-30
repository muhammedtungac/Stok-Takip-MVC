import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusteriListesiFrameController implements ActionListener {
	
	MusteriListesiFrameView musteriListeFrameView;
	MainFrameView mainFrameView;
	public MusteriListesiFrameController() {
		// TODO Auto-generated constructor stub
		musteriListeFrameView=new MusteriListesiFrameView();
		mainFrameView=MainFrameController.getFrameView();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(!musteriListeFrameView.isVisible()) {
			mainFrameView.desktopPane.add(musteriListeFrameView);
			musteriListeFrameView.setVisible(true);
		}
		
	}

	public MusteriListesiFrameView getMusteriListeFrameView() {
		return musteriListeFrameView;
	}
}
