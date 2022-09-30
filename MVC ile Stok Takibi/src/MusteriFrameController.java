import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusteriFrameController implements ActionListener {
	public static MusteriFrameView musteriFrameView;
	MainFrameView mainFrameView;
	public MusteriFrameController() {
		musteriFrameView=new MusteriFrameView();
		this.mainFrameView=MainFrameController.getFrameView();
		
		musteriFrameView.btnKaydet.addActionListener(new MusteriSaveController());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			if(!musteriFrameView.isVisible()) {
				mainFrameView.desktopPane.add(musteriFrameView);	
				musteriFrameView.setVisible(true);					
			}
		} catch (Exception e1) {				
			e1.getStackTrace();
		}				
		
	}
public static MusteriFrameView getMusteriFrameView() {
	return musteriFrameView;
}
}
