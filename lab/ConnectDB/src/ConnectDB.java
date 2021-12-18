import java.sql.*;

public class ConnectDB {
    static final String driver = "com.mysql.cj.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/school";
    static final String uname = "root";
    static final String pw = "12345";


    public static void main(String []args){
        Connection con = null;
        Statement stmt = null;
        try {
            //Register JDBC Driver
            Class.forName(driver);

            //Open a Connection
            System.out.println("Connecting to DataBase....");
            con = DriverManager.getConnection(url,uname,pw);

            //Execute a Query with Statement object
            System.out.println("Creating Statement...");
            stmt = con.createStatement();
            String  sql = "select name from student where district='kathmandu'";
            ResultSet rs= stmt.executeQuery(sql);

            //Process the result
            System.out.println("---------------------------");
            System.out.println("|\t\tname\t\t|");
            System.out.println("---------------------------");

            while(rs.next()) {
                String
                        name = rs.getString("name");
//                Time time = rs.getTime("last_update");

                //Display Values
                System.out.println("| "+name+"\t|");
                System.out.println("---------------------------");
            }
            //Clean up- close up
            rs.close();
            stmt.close();
            con.close();

        }
        catch(SQLException se){
            se.printStackTrace();
        }
        catch (Exception e){
            System.out.println("this is in catch");
            e.printStackTrace();
        }
    }
}
