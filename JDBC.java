//JDBC： java database connectivity 可以看作一种适配器，把不同的数据库的接口统一起来，供java程序调用。
import java.sql.*;
public class Main {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/mysql?useSSL=false";
    static final String USER = "root";
    static final String PASS = "mypassword";
    public static void main(String[] args){
        Connection connection = null;
        Statement statement = null;
        try{
//            加载引擎
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            statement = connection.createStatement();
            String sql = "SELECT User FROM user";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                String name = resultSet.getString("User");
                System.out.println(name);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

