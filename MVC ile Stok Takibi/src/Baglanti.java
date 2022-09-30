import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Baglanti {
public static Connection con;

public Baglanti() {
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=(Connection)DriverManager.getConnection("jdbc:mysql://Muhammed:3306/stokkartýcasestudy","root","571632");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Baglantý Kurulamadý");
	}	
}

}
