package com.schoolsystem.model;

import com.schoolsystem.util.SqliteHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {

    Connection connection ;

    public LoginModel(){

        try {
            this.connection = SqliteHelper.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(this.connection == null){
            System.exit(1);
        }
    }

    public boolean isDbConnected(){
        return null != this.connection;

    }

    public  boolean isLogin(String user,String pass, String opt) {

        PreparedStatement pr = null;
        ResultSet rs = null;

        String sql ="SELECT * FROM login where username=? and password=? and role=?";

        try {
            pr = this.connection.prepareStatement(sql);
            pr.setString(1, user);
            pr.setString(2, pass);
            pr.setString(3,opt);


            rs = pr.executeQuery();

            boolean boll1;

            return rs.next();

        }catch (SQLException e){
            return false;
        }finally {
            assert pr != null;
            assert rs != null;

        }
    }
}
