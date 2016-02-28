package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Vector;
import java.sql.Date;

public class SQLDB {
	Connection connection;
	
	public SQLDB(){
		connectToMysql();
	}	
	
	public boolean connectToMysql(){
		try{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String connectionCommand = "jdbc:mysql://"+"localhost"+"/"+"Einkaufsplaner"+"?user="+"root"+"&password="+"";
		connection = DriverManager.getConnection(connectionCommand);
		return true;
		 
		}catch (Exception ex){
		System.out.println("false");
		return false;
		}}
	
	public boolean Insert_Zutat(String ID,String Name, DecimalFormat Preis,String Laden,String Kategorie,String Einheit){
		
		
		Statement stmt = null;
		try {
		stmt = connection.createStatement();
		String query = "INSERT INTO Zutaten (ID, Name, Laden, Kategorie, Einheit, Status)"+"VALUES( '" + ID + "','" + Name + "','" + Laden +"','" + Kategorie +"','" + Einheit +"','" + "1" + "')";
		//query = query
		stmt.executeUpdate(query);
		return true;
		} catch (Exception ex) {
			return false;
		}	
	}
	
	
	
	
}

