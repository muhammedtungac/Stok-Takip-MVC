import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StokKartęCopyFrameController implements ActionListener {

	static StokKartęCopyFrameView copyFrameView; 
	MainFrameView mainFrameView;
	public StokKartęCopyFrameController() {
		copyFrameView=new StokKartęCopyFrameView();
		mainFrameView=MainFrameController.getFrameView();
		
		copyFrameView.btnKaydet.addActionListener(new StokKartęNewCopyController());
		
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

	public static StokKartęCopyFrameView getCopyFrameView() {
		return copyFrameView;
	}
}
