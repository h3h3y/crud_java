package latihan_uts.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import latihan_uts.entity.Mahasiswa;
public class MahasiswaModel {
    private Connection connection;
    
    public MahasiswaModel(Connection connection){
        this.connection = connection;
    }
    
    public void insert(Mahasiswa mahasiswa) throws SQLException{
        String sql = "INSERT INTO "
                + "tabel_mhs("
                    + "nim, "
                    + "nama, "
                    + "kelas, "
                    + "jenis_kelamin, "
                    + "alamat, "
                    + "no_telepon"
                + ") "
            + "VALUES ("
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?"
            + ")";
        
        PreparedStatement statemen = connection.prepareStatement(sql);
        statemen.setString(1, mahasiswa.getNim());
        statemen.setString(2, mahasiswa.getNama());
        statemen.setString(3, mahasiswa.getKelas());
        statemen.setString(4, mahasiswa.getJenis_kelamin());
        statemen.setString(5, mahasiswa.getAlamat());
        statemen.setString(6, mahasiswa.getNo_telepon());
        statemen.executeUpdate();
        statemen.close();
    }
    
    public void update(Mahasiswa mahasiswa) throws SQLException{
        String sql = " UPDATE "
                        + " tabel_mhs "
                     + " SET "
                        + "nama = ?, "
                        + "kelas = ?, "
                        + "jenis_kelamin = ?, "
                        + "alamat = ?, "
                        + "no_telepon = ?"
                     + " WHERE "
                         + "nim = ?"
                     ;
        
        PreparedStatement statemen = connection.prepareStatement(sql);
        statemen.setString(1, mahasiswa.getNama());
        statemen.setString(2, mahasiswa.getKelas());
        statemen.setString(3, mahasiswa.getJenis_kelamin());
        statemen.setString(4, mahasiswa.getAlamat());
        statemen.setString(5, mahasiswa.getNo_telepon());
        statemen.setString(6, mahasiswa.getNim());
        statemen.executeUpdate();
        statemen.close();
    }
    
    public void delete(Mahasiswa mahasiswa) throws SQLException{
        String sql = 
                "DELETE FROM "
                    + "tabel_mhs "
                + "WHERE "
                    + "nim = ?"
                ;
        
        PreparedStatement statemen = connection.prepareStatement(sql);
        statemen.setString(1, mahasiswa.getNim());
        statemen.executeUpdate();
        statemen.close();
    }
}
