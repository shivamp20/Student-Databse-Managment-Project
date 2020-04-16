
import  java.sql.*;


public class DemoClass 
        
{
    

    public static void main(String args[]) throws Exception
	{	String url = "jdbc:mysql://localhost:3306/shivam";
		String uname = "root";
		String pass = "root";
		String query="select sname from student where sid=2";  
				
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs= st.executeQuery(query);
		rs.next();
		
		String name = rs.getString("sname");
		System.out.println(name);
		st.close();
		con.close();
        }      
    
    
    
}
