package com.kh;

import com.kh.util.Common;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMain {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM MEMBER";
            rs = stmt.executeQuery(sql);

            System.out.println(rs);
            while(rs.next()) {
                System.out.print(rs.getInt("MEMBER_NUM") + " ");
                System.out.print(rs.getString("ID") + " ");
                System.out.print(rs.getString("PASSWORD") + " ");
                System.out.print(rs.getString("NAME") + " ");
                System.out.print(rs.getDate("BIRTH") + " ");
                System.out.print(rs.getString("GENDER") + " ");
                System.out.print(rs.getString("EMAIL") + " ");
                System.out.print(rs.getString("PHONE") + " ");
                System.out.print(rs.getString("RECOMMENDER_ID") + " ");
                System.out.print(rs.getDate("REG_DATE") + " ");
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
