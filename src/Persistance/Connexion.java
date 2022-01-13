package Persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
	final static String driverClassName="com.mysql.jdbc.Driver";
	 final static String connectionUrl="jdbc:mysql://localhost:8889/TPFC";
	 final static String dbUser="root";
	 final static String dbPwd="root";
	 
	 public Connexion(){
		
	 }
	 public static Connection getConnexion(){
		 Connection conn=null;
		  try {
			conn=DriverManager.getConnection(connectionUrl,dbUser,dbPwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return conn;
	 }
}
