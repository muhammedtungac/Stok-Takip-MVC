import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StokKartýCopyFrameController implements ActionListener {

	static StokKartýCopyFrameView copyFrameView; 
	MainFrameView mainFrameView;
	public StokKartýCopyFrameController() {
		copyFrameView=new StokKartýCopyFrameView();
		mainFrameView=MainFrameController.getFrameView();
		
		copyFrameView.btnKaydet.addActionListener(new StokKartýNewCopyController());
		
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			if(!copyFrameView.isVisible()) {
				mainFrameView.desktopPane.add(copyFrameView);	
				copyFrameView.setVisible(true);					
			}
		} catch (Exception e1) {				
			e1.getStackTrace();
		}
	}

	public static StokKartýCopyFrameView getCopyFrameView() {
		return copyFrameView;
	}
}
