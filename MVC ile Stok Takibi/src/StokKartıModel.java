import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class StokKart�Model {
private static String StokKodu;
private static String StokAd�;
private static int StokTipi;
private static String Birimi;
private static String BarkodNo;
private static double KDVTipi;
private static String A��klama;
private static Object Olu�turmaTarihi;
private static Baglanti baglanti;
private static ResultSet rs;
private static Statement statement;
private static PreparedStatement pstatement;
boolean y�n;
static StokKart�FrameView frameview;
static StokKart�ListeFrameView listeframeview;
public StokKart�Model() {
	setStokKodu(StokKart�FrameView.getStokKodu());
	setStokAd�(StokKart�FrameView.getStokAd�());
	setStokTipi(StokKart�FrameView.getStokTipi());
	setBarkodNo(StokKart�FrameView.getBarkodNo());
	setBirimi(StokKart�FrameView.getBirimi());
	setA��klama(StokKart�FrameView.getA��klama());
	setKDVTipi(StokKart�FrameView.getKDVTipi());
	setOlu�turmaTarihi(StokKart�FrameView.getOlu�turmaTarihi());
}
public static void tabloGoster() {
	listeframeview=StokKart�ListeFrameController.getListeFrameView();
	try {
		statement=baglanti.con.createStatement();
		rs=statement.executeQuery("select * from stokkarti");
		while (rs.next()) {
			Object [] o= {rs.getString("StokKodu"),rs.getString("StokAdi"),rs.getInt("StokTipi"),rs.getString("Birimi"),rs.getString("Barkodu"),rs.getString("KDVTipi"),rs.getString("Aciklama"),rs.getString("OlusturmaTarihi")};
			listeframeview.tableModel.addRow(o);
		}	
	} catch (Exception e) {
		e.getStackTrace();	
	}
}
public static void getir(){
	frameview=StokKart�FrameController.getFrameView();
	StokKodu=StokKart�FrameView.getStokKodu();
	try {
		statement=baglanti.con.createStatement();
		rs=statement.executeQuery("select * from stokkarti where StokKodu like '"+getStokKodu()+"'");
		if(!getStokKodu().equals("")) {
			while(rs.next()) {
					frameview.setStokAd�(rs.getString("StokAdi"));
					frameview.setStokTipi(rs.getInt("StokTipi"));
					frameview.setBirimi(rs.getString("Birimi"));
					frameview.setBarkodNo(rs.getString("Barkodu"));
					frameview.setKDVTipi(rs.getString("KDVTipi"));
					frameview.setA��klama(rs.getString("Aciklama"));
					frameview.setOlu�turmaTarihi(rs.getString("OlusturmaTarihi"));			
				}
			}		
		else if(!getStokKodu().equals(rs.toString())) {
			frameview.setStokAd�("");
			frameview.setStokTipi(0);
			frameview.setBirimi("");
			frameview.setBarkodNo("");
			frameview.setKDVTipi("");
			frameview.setA��klama("");
			frameview.setOlu�turmaTarihi("");	
		}
		
	} catch (Exception e) {
	
		e.printStackTrace();
	}
}

public void delete(){	
	if(!StokKodu.equals("")){
		try {		
			statement=(Statement)baglanti.con.createStatement();
			statement.executeUpdate("delete from stokkarti where StokKodu='"+getStokKodu()+"'");
			JOptionPane.showMessageDialog(null, "Ba�ar�yla Silindi");		 
	}
	catch (SQLException e) {
	
		JOptionPane.showMessageDialog(null, "Hata Tekrar Deneyin");
	}
}
	else {
		JOptionPane.showMessageDialog(null, "Ge�erli bir StokKodu girin");
	}
}
public boolean kontrol() {
	
	this.y�n=true;
	try {
		statement=(Statement)baglanti.con.createStatement();
		rs=statement.executeQuery("select StokKodu from stokkarti where StokKodu='"+getStokKodu()+"'");
		
			if (!rs.toString().equals(getStokKodu())) {
				this.y�n=false;					
			}			
	} catch (Exception e) {
		e.printStackTrace();		
	}
return this.y�n;
}

public void insert() {
	if(!getStokKodu().equals("")) {
		try {			
			pstatement=(PreparedStatement)baglanti.con.prepareStatement("insert into stokkarti (StokKodu,StokAdi,StokTipi,Birimi,Barkodu,KDVTipi,Aciklama,OlusturmaTarihi) values (?,?,?,?,?,?,?,?)");
			pstatement.setString(1,getStokKodu());
			pstatement.setString(2,getStokAd�());
			pstatement.setInt(3,getStokTipi());
			pstatement.setString(4,getBirimi());
			pstatement.setString(5,getBarkodNo().toString());
			pstatement.setDouble(6,getKDVTipi());
			pstatement.setString(7,getA��klama());
			pstatement.setObject(8,getOlu�turmaTarihi());
			pstatement.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "��lem Ba�ar�l�");
		} catch (Exception e8) {
			JOptionPane.showMessageDialog(null, "��lem Ba�ar�s�z");		
		}
	}
	else {
		JOptionPane.showMessageDialog(null,"Bir Stok Kodu Girin" );
	}	
}

public void update() {
	if(!getStokKodu().equals("")) {
		try{
			pstatement=(PreparedStatement)baglanti.con.prepareStatement("update stokkarti set StokAdi=?,StokTipi=?,Birimi=?,Barkodu=?,KDVTipi=?,Aciklama=?,OlusturmaTarihi=? where StokKodu=?");		
			pstatement.setString(1,getStokAd�());
			pstatement.setInt(2,getStokTipi());
			pstatement.setString(3,getBirimi());
			pstatement.setString(4,getBarkodNo());
			pstatement.setDouble(5,getKDVTipi());
			pstatement.setString(6,getA��klama());
			pstatement.setObject(7,getOlu�turmaTarihi());
			pstatement.setString(8,getStokKodu());
			pstatement.executeUpdate();
			JOptionPane.showMessageDialog(null, "G�ncelleme ��lemi Ba�ar�l�");
		}
		catch (SQLException e) {
		
			JOptionPane.showMessageDialog(null, "G�ncelleme ��lemi Ba�ar�s�z");
		}
	}
	else {
		JOptionPane.showMessageDialog(null, "Bir Stok Kodu Girin");
	}		
}

public void setStokKodu(String StokKodu) {
this.StokKodu=StokKodu;	
}
public static String getStokKodu() {
	
return StokKodu;
}


public void setStokAd�(String StokAd�) {
this.StokAd�=StokAd�;	
}
public String getStokAd�() {
	
return this.StokAd�;
}


public void setStokTipi(int StokTipi) {
this.StokTipi=StokTipi;	
}
public int getStokTipi() {
	
return this.StokTipi;
}


public void setBirimi(String Birimi) {
this.Birimi=Birimi;	
}
public String getBirimi() {
	
return this.Birimi;
}


public void setBarkodNo(String BarkodNo) {
this.BarkodNo=BarkodNo;	
}
public String getBarkodNo() {
	
return this.BarkodNo;
}


public void setKDVTipi(Double KDVTipi) {
this.KDVTipi=KDVTipi;	
}
public double getKDVTipi() {
return this.KDVTipi;
}


public void setA��klama(String A��klama) {
this.A��klama=A��klama;	
}
public String getA��klama() {
	
return this.A��klama;
}


public void setOlu�turmaTarihi(Object Olu�turmaTarihi) {
	this.Olu�turmaTarihi=Olu�turmaTarihi;
}

public Object getOlu�turmaTarihi() {
	return this.Olu�turmaTarihi;
}
}
