import java.sql.*;

/**
 * File: DatabaseManager.java
 * Author: weizhenhuan 
 * Time: 2021/11/2 13:17
 **/
public class DatabaseManager {
    static Connection conn;

    public DatabaseManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            long start = System.currentTimeMillis();

            conn = DriverManager.getConnection("jdbc:mysql://101.42.109.18:3306/19069100063",
                    "19069100063", "123456");
            long end = System.currentTimeMillis();
            System.out.println(conn);
            System.out.println("建立连接耗时： " + (end - start) + " 毫秒");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void addDianjiData(int data1, int data2, int data3, int data4) {
        try {
            String word = "INSERT INTO dianji VALUES(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(word);
            ps.setInt(1, data1);
            ps.setInt(2, data2);
            ps.setInt(3, data3);
            ps.setInt(4, data4);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void addFengjidianjiData(int data) {
        try {
            String word = "INSERT INTO fengjidianji VALUES(?)";
            PreparedStatement ps = conn.prepareStatement(word);
            ps.setInt(1, data);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void addFengjishanyeData(int data) {
        try {
            String word = "INSERT INTO fengjishanye VALUES(?)";
            PreparedStatement ps = conn.prepareStatement(word);
            ps.setInt(1, data);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void addJiansujiData(int data) {
        try {
            String word = "INSERT INTO jiansuji VALUES(?)";
            PreparedStatement ps = conn.prepareStatement(word);
            ps.setInt(1, data);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void addQitaData(int data) {
        try {
            String word = "INSERT INTO qita VALUES(?)";
            PreparedStatement ps = conn.prepareStatement(word);
            ps.setInt(1, data);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}