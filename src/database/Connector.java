package database;

import java.sql.*;

public class Connector {
    public final static String connectString = "jdbc:mysql://localhost:3306/t2009m";
    public final static String username = "root";
    public final static String password = "";//dung sampp thi bo root di

    Statement statement;

    //b2.define static vartiable
    private static Connector instance;

    //b1.private contructor
    private Connector(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectString,username,password);
            Statement stt = conn.createStatement();
            statement = stt;
        }catch (ClassNotFoundException Nf){
            System.out.println("class not found");
        }catch (SQLException se){
            System.out.println("connect error");
        }
    }
    //b3 define static function
    public static Connector getInstance(){
        if(instance == null)
            instance = new Connector();
        return instance;
    }


    public Statement getStatement(){
        return statement;
    }

    public class getInstance extends Connector {
    }
}
