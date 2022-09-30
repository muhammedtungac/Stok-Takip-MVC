import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StokKart�CopyFrameController implements ActionListener {

	static StokKart�CopyFrameView copyFrameView; 
	MainFrameView mainFrameView;
	public StokKart�CopyFrameController() {
		copyFrameView=new StokKart�CopyFrameView();
		mainFrameView=MainFrameController.getFrameView();
		
		copyFrameView.btnKaydet.addActionListener(new StokKart�NewCopyController());
		
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

	public static StokKart�CopyFrameView getCopyFrameView() {
		return copyFrameView;
	}
}
