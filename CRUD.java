/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.votingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author kashi
 */
public class CRUD {
    public static void main(String[] args) throws Exception
    {
        //Driver class Loading and Registering
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //Connection Establish
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","root");
        
        //CREATE A TABLE
        PreparedStatement cr=con.prepareStatement("create table Student(Roll int,Name varchar(20),Class varchar(10),Fees double(5,2))");
        cr.executeUpdate();
        
        //INSERTION INTO TABLE
        PreparedStatement ins=con.prepareStatement("insert into Student values(?,?,?,?)");
        //1st Record
        ins.setInt(1, 101);
        ins.setString(2,"Akash");
        ins.setString(3, "MCA(tyc)");
        ins.setDouble(4,750.34);
        ins.executeUpdate();
        //2nd Record
        ins.setInt(1, 102);
        ins.setString(2,"Charan");
        ins.setString(3, "MCA(tyc)");
        ins.setDouble(4,750.34);
        ins.executeUpdate();
        //3rd Record
        ins.setInt(1, 103);
        ins.setString(2,"Nisha");
        ins.setString(3, "MCA(tyc)");
        ins.setDouble(4,750.34);
        ins.executeUpdate();
                
        
        
        //UPDATAION IN TABLE
        PreparedStatement up=con.prepareStatement("update Student set Name='Pallvi' where Name='charan'");
        up.executeUpdate();
        
        //DELETION IN TABLE
        PreparedStatement del=con.prepareStatement("delete from Student where Name='Pallvi'");
        del.executeUpdate();
        
        //RETREIVE FROM TABLE
        PreparedStatement r=con.prepareStatement("Select * from Student");
        ResultSet rs= r.executeQuery();
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getDouble(4));
    
        }
        
        //CONNECTION CLOSE
        con.close();
    }    
}
