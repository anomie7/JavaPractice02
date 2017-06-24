import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JDBCTest02 {
	final static String sql = "select * from employee";
	public static void main(String[] args){
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc?useSSL=false";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			Class.forName(driver);
			con = DriverManager.getConnection(url, "root", "1234");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			System.out.println("��ȣ \t �̸� \t ��å \t �μ� \t �̸���");
			System.out.println("--------------------------------------------");
			
			while(rs.next()){
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getInt(4) + "\t");
				System.out.print(rs.getString(5) + "\n");
			}
		}catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				if(rs != null){
					rs.close();
				}
				if(stmt != null){
					stmt.close();
				}
				if(con != null){
					con.close();
				}
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}

}
