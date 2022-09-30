import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class MusteriModel {
private static Baglanti baglanti;
private static ResultSet rs;
private static Statement statement;
private static PreparedStatement pstatement;
static MusteriFrameView musteriFrameView;
private static Object olusturmaTarihi;
private static String musteriId;	 
private static String firmaIsim;
private static String yetkiliIsim;
private static String musteriKod;
private static String musteriKargo;
private static String musteriTel;
private static String musteriUlke;

public MusteriModel() {
	//setMusteriId(musteriFrameView.getMusteriId());
	setFirmaIsim(musteriFrameView.getFirmaIsim());
	setYetkiliIsim(musteriFrameView.getYetkiliIsim());
	setMusteriKod(musteriFrameView.getMusteriKod());
	setMusteriKargo(musteriFrameView.getMusteriKargo());
	setMusteriTel(musteriFrameView.getMusteriTel());
	setMusteriUlke(musteriFrameView.getMusteriUlke());
	setOlusturmaTarihi(musteriFrameView.getOlusturmaTarihi());
	
}

public void insert() {

		try {			
			pstatement=(PreparedStatement)baglanti.con.prepareStatement("insert into musteri (firmaIsim,yetkiliIsim,musteriKod,musteriKargo,musteriTel,musteriUlke,olusturmaTarihi) values (?,?,?,?,?,?,?)");
			//pstatement.setString(1,getMusteriId());
			pstatement.setString(1,getFirmaIsim());
			pstatement.setString(2,getYetkiliIsim());
			pstatement.setString(3,getMusteriKod());
			pstatement.setString(4,getMusteriKargo());
			pstatement.setString(5,getMusteriTel());
			pstatement.setString(6,getMusteriUlke());
			pstatement.setObject(7,getOlusturmaTarihi());
			pstatement.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Ýþlem Baþarýlý");
		} catch (Exception e9) {
			JOptionPane.showMessageDialog(null, "Ýþlem Baþarýsýz");		
		}
	
	}
	
public void setMusteriId(String musteriId) {
	this.musteriId=musteriId;
}
public String getMusteriId() {
	return musteriId;
}	
public void setFirmaIsim(String firmaIsim) {
	this.firmaIsim=firmaIsim;
}
public String getFirmaIsim() {
	return firmaIsim;
}
public void setYetkiliIsim(String yetkiliIsim) {
	this.yetkiliIsim=yetkiliIsim;
}
public String getYetkiliIsim() {
	return yetkiliIsim;
}
public void setMusteriKod(String musteriKod) {
	this.musteriKod=musteriKod;
}
public String getMusteriKod() {
	return musteriKod;
}
public void setMusteriKargo(String musteriKargo) {
	this.musteriKargo=musteriKargo;
}
public String getMusteriKargo() {
	return musteriKargo;
}
public void setMusteriTel(String musteriTel) {
	this.musteriTel=musteriTel;
}
public String getMusteriTel() {
	return musteriTel;
}
public void setMusteriUlke(String musteriUlke) {
	this.musteriUlke=musteriUlke;
}
public String getMusteriUlke() {
	return musteriUlke;
}
public void setOlusturmaTarihi(Object olusturmaTarihi) {
	this.olusturmaTarihi=olusturmaTarihi;
}
public Object getOlusturmaTarihi() {
	return olusturmaTarihi;
}
}
