package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class UserDAO {

		private Connection conn;
		private PreparedStatement pstmt;
		private ResultSet rs;
		
		
		public UserDAO() {
			try {
				String dbURL= "jdbc:oracle:thin:@localhost:1521:xe";
				String dbID ="gnswjd";
				String dbPassword = "gnswjd";
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public ArrayList<User> search(String userName){
			
				String SQL = "SELECT * FROM USER2 WHERE userName LIKE ?";
				ArrayList<User> userList = new ArrayList<User>();
				try {
					pstmt = conn.prepareStatement(SQL);
					pstmt.setString(1,"%" + userName + "%");
					rs = pstmt.executeQuery();
					
				while(rs.next()) {
						User user = new User();
						user.setUserName(rs.getString(1));
						user.setUserAge(rs.getInt(2));
						user.setUserGender(rs.getString(3));
						user.setUserEmail(rs.getString(4));
						userList.add(user);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				return userList;
		}
		public int register(User user){
			String SQL = "insert into user2 values (?,?,?,?)";
			try {
				pstmt= conn.prepareStatement(SQL);
				pstmt.setString(1, user.getUserName());
				pstmt.setInt(2, user.getUserAge());
				pstmt.setString(3, user.getUserGender());
				pstmt.setString(4, user.getUserEmail());
				return pstmt.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
				
			}
			return -1; //데이터베이스 오류
		}
		
}
