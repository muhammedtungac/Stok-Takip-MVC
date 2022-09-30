import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class StokKartýModel {
private static String StokKodu;
private static String StokAdý;
private static int StokTipi;
private static String Birimi;
private static String BarkodNo;
private static double KDVTipi;
private static String Açýklama;
private static Object OluþturmaTarihi;
private static Baglanti baglanti;
private static ResultSet rs;
private static Statement statement;
private static PreparedStatement pstatement;
boolean yön;
static StokKartýFrameView frameview;
static StokKartýListeFrameView listeframeview;
public StokKartýModel() {
	setStokKodu(StokKartýFrameView.getStokKodu());
	setStokAdý(StokKartýFrameView.getStokAdý());
	setStokTipi(StokKartýFrameView.getStokTipi());
	setBarkodNo(StokKartýFrameView.getBarkodNo());
	setBirimi(StokKartýFrameView.getBirimi());
	setAçýklama(StokKartýFrameView.getAçýklama());
	setKDVTipi(StokKartýFrameView.getKDVTipi());
	setOluþturmaTarihi(StokKartýFrameView.getOluþturmaTarihi());
}
public static void tabloGoster() {
	listeframeview=StokKartýListeFrameController.getListeFrameView();
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
	frameview=StokKartýFrameController.getFrameView();
	StokKodu=StokKartýFrameView.getStokKodu();
	try {
		statement=baglanti.con.createStatement();
		rs=statement.executeQuery("select * from stokkarti where StokKodu like '"+getStokKodu()+"'");
		if(!getStokKodu().equals("")) {
			while(rs.next()) {
					frameview.setStokAdý(rs.getString("StokAdi"));
					frameview.setStokTipi(rs.getInt("StokTipi"));
					frameview.setBirimi(rs.getString("Birimi"));
					frameview.setBarkodNo(rs.getString("Barkodu"));
					frameview.setKDVTipi(rs.getString("KDVTipi"));
					frameview.setAçýklama(rs.getString("Aciklama"));
					frameview.setOluþturmaTarihi(rs.getString("OlusturmaTarihi"));			
				}
			}		
		else if(!getStokKodu().equals(rs.toString())) {
			frameview.setStokAdý("");
			frameview.setStokTipi(0);
			frameview.setBirimi("");
			frameview.setBarkodNo("");
			frameview.setKDVTipi("");
			frameview.setAçýklama("");
			frameview.setOluþturmaTarihi("");	
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
			JOptionPane.showMessageDialog(null, "Baþarýyla Silindi");		 
	}
	catch (SQLException e) {
	
		JOptionPane.showMessageDialog(null, "Hata Tekrar Deneyin");
	}
}
	else {
		JOptionPane.showMessageDialog(null, "Geçerli bir StokKodu girin");
	}
}
public boolean kontrol() {
	
	this.yön=true;
	try {
		statement=(Statement)baglanti.con.createStatement();
		rs=statement.executeQuery("select StokKodu from stokkarti where StokKodu='"+getStokKodu()+"'");
		
			if (!rs.toString().equals(getStokKodu())) {
				this.yön=false;					
			}			
	} catch (Exception e) {
		e.printStackTrace();		
	}
return this.yön;
}

public void insert() {
	if(!getStokKodu().equals("")) {
		try {			
			pstatement=(PreparedStatement)baglanti.con.prepareStatement("insert into stokkarti (StokKodu,StokAdi,StokTipi,Birimi,Barkodu,KDVTipi,Aciklama,OlusturmaTarihi) values (?,?,?,?,?,?,?,?)");
			pstatement.setString(1,getStokKodu());
			pstatement.setString(2,getStokAdý());
			pstatement.setInt(3,getStokTipi());
			pstatement.setString(4,getBirimi());
			pstatement.setString(5,getBarkodNo().toString());
			pstatement.setDouble(6,getKDVTipi());
			pstatement.setString(7,getAçýklama());
			pstatement.setObject(8,getOluþturmaTarihi());
			pstatement.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Ýþlem Baþarýlý");
		} catch (Exception e8) {
			JOptionPane.showMessageDialog(null, "Ýþlem Baþarýsýz");		
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
			pstatement.setString(1,getStokAdý());
			pstatement.setInt(2,getStokTipi());
			pstatement.setString(3,getBirimi());
			pstatement.setString(4,getBarkodNo());
			pstatement.setDouble(5,getKDVTipi());
			pstatement.setString(6,getAçýklama());
			pstatement.setObject(7,getOluþturmaTarihi());
			pstatement.setString(8,getStokKodu());
			pstatement.executeUpdate();
			JOptionPane.showMessageDialog(null, "Güncelleme Ýþlemi Baþarýlý");
		}
		catch (SQLException e) {
		
			JOptionPane.showMessageDialog(null, "Güncelleme Ýþlemi Baþarýsýz");
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


public void setStokAdý(String StokAdý) {
this.StokAdý=StokAdý;	
}
public String getStokAdý() {
	
return this.StokAdý;
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


public void setAçýklama(String Açýklama) {
this.Açýklama=Açýklama;	
}
public String getAçýklama() {
	
return this.Açýklama;
}


public void setOluþturmaTarihi(Object OluþturmaTarihi) {
	this.OluþturmaTarihi=OluþturmaTarihi;
}

public Object getOluþturmaTarihi() {
	return this.OluþturmaTarihi;
}
}
