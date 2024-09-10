package org.example;

import java.sql.*;

public class App {
    public static void main(String[] args) {

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "eidiko schema", "sarasu10");
//            Statement st = con.createStatement();
//            String createtable = "create table eidiko(id number , name varchar2(20), address varchar2(20))";
//            st.executeUpdate(createtable);
//            System.out.println("table created successfully");

//            String insertval = "insert into eidiko values(?,?,?)";
//            PreparedStatement ps = con.prepareStatement(insertval);
//            ps.setInt(1,3);
//            ps.setString(2,"adesh");
//            ps.setString(3,"nagar");
//            ps.executeUpdate();
//            System.out.println("rows inserted");

//            String update = "update eidiko SET address = ? where id = ?";
//            PreparedStatement ps = con.prepareStatement(update);
//            ps.setString(1,"ahmednagar");
//            ps.setInt(2,3);
//            ps.executeUpdate();
//            System.out.println("update succesfully");


//            String del = "delete from eidiko where id = ?";
//            PreparedStatement ps = con.prepareStatement(del);
//            ps.setInt(1,2);
//            ps.executeUpdate();
//            System.out.println("deleted successfully");

            String sel = "select * from eidiko";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sel);
            while(rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("address"));
            }

        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
