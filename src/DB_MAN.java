/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author 김수지
 */
public class DB_MAN {
    //String strDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
    //String strURL = "jdbc:odbc:Automobile64";
    String strDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String strURL = "jdbc:sqlserver://localhost:1433;DatabaseName=CardPair_SJ";
    //String strURL = "jdbc:sqlserver://10.40.41.50:1433;DatabaseName=Automobile";//교수님꺼
    String strUser = "sa";
    String strPWD = "inha1958";
    
    Connection DB_con;
    Statement DB_stmt;
    ResultSet DB_rs;
    
     public void dbOpen() throws IOException{
        try{
            Class.forName(strDriver);
            DB_con = DriverManager.getConnection(strURL,strUser,strPWD);
            DB_stmt = DB_con.createStatement();
        }catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }
    
    
    public void dbClose() throws IOException{
        try{
            DB_stmt.close();
            DB_con.close();
        }catch(Exception e){
            System.out.println("SQLException : "+e.getMessage());
        }
    }

}
