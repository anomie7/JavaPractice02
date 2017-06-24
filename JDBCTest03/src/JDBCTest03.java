import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCTest03 {
	final static String sql =
			"insert into employee(name, jobGrade, department, email) values(?,?,?,?)";
	public static void main(String[] args){
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc?useSSL=false";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String sname, sjobGrade, semail, stemp;
		int department = 0;
		
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("��� ���� �Է��ϱ�");
			System.out.print("�̸� �Է� >>>");
			sname = sc.nextLine();
			System.out.print("��å �Է� >>");
			sjobGrade = sc.nextLine();
			System.out.print("�μ���ȣ �Է�(10, 20, 30..)>>");
			stemp = sc.nextLine();
			department = Integer.parseInt(stemp);
			System.out.print("�̸��� �Է�>>");
			semail = sc.nextLine();
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, "root", "1234");
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sname);
			pstmt.setString(2, sjobGrade);
			pstmt.setInt(3, department);
			pstmt.setString(4, semail);
			int rowCount = pstmt.executeUpdate();
			
			System.out.println(rowCount);
			if(rowCount == 1){
				System.out.println(sname + "��(��) �߰��Ǿ����ϴ�.");
			}else{
				System.out.println("������ �߰��� �����Ͽ����ϴ�.");
			}
			sc.close();
		}catch(Exception e){
			System.out.println(e);
		}finally {
			try{
				if(pstmt != null){
					pstmt.close();
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
