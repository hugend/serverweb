package fw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	
	public static void main(String[] args) {
		System.out.println(getConnect());
	}		
	
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnect(){
		Connection con= null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		try {
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	//Ä¿³Ø¼ÇÀ» ¹Ý³³
	public static void Close(Connection con){
		try {
			if(con!=null)con.close();
		} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	//statement ¹Ý³³
	public static void Close(Statement ptmt){
		try {
			if(ptmt!=null)ptmt.close();
		} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	//ResultSet ¹Ý³³
	public static void Close(ResultSet rs){
		try {
			if(rs!=null)rs.close();
		} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
}
