
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chiph_000
 */
public class TestJDBC {
    public static void main(String[] args) {
        // TODO code application logic here
         // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://localhost;databaseName=QLTV_Project1;user=sa;password=123456";

        try (Connection con = DriverManager.getConnection(connectionUrl); 
                Statement stmt = con.createStatement();) {
            String SQL = "SELECT TOP 10 * FROM NguoiDung";
            ResultSet rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("MaND") + " " + rs.getString("MatKhau") + " " + rs.getString("HoTen") + " " + rs.getString("VaiTro"));
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
