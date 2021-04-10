package session.s3;


import java.sql.*;

public class Main {
    public final static String connectString = "jdbc:mysql://localhost:3306/t2009m";
    public final static String username = "root";
    public final static String password = "";//dung sampp thi bo root di
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectString,username,password);
            Statement stt = conn.createStatement();
            String txt_sql = "select * from sinhvien";
            ResultSet rs = stt.executeQuery(txt_sql);
            while (rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getInt("age"));
                System.out.println(rs.getInt("mark"));
                System.out.println("------");
            }
        }catch (ClassNotFoundException Nf){
            System.out.println("class not found");
        }catch (SQLException se){
            System.out.println("connect error");
        }
    }
}