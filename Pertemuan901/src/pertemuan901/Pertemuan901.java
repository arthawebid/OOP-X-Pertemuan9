package pertemuan901;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Made Artha
 * TGL 17 Mei 2025
 */
public class Pertemuan901 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        dbkoneksi dbk = new dbkoneksi();
        
        Statement stm = dbk.koneksi().createStatement();
        String sql = "SELECT * FROM mhs;";
        ResultSet rs = stm.executeQuery(sql);
        
        while( rs.next() ){
            System.out.println("Nama : " + rs.getString("NAMA"));
        }
    
}}
