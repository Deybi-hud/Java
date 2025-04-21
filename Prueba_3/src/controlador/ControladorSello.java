
package controlador;

import BDD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Sello;

public class ControladorSello {



    
     public boolean agregar(Sello sello)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO Sello (nombre) " +
                        " values (?)";
        
            PreparedStatement ps = cx.prepareStatement(sql);
           
            ps.setString(1, sello.getNombreSello());
            
            
            ps.executeUpdate();
            ps.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    
    public boolean actualizar(Sello sello)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "UPDATE Sello SET Nombre=? WHERE idSello=?";
        
            PreparedStatement ps = cx.prepareStatement(sql);
            
            ps.setString(1, sello.getNombreSello());
            ps.setInt(2, sello.getIdSello());
            
            
            ps.executeUpdate();
            ps.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
        
    }
    
    public boolean eliminar(int idSello)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "DELETE FROM Sello WHERE idSello=?";
        
            PreparedStatement ps = cx.prepareStatement(sql);            
            ps.setInt(1, idSello);
            
            ps.executeUpdate();
            ps.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    
    public Sello buscarPorId(int idSello)
    {
        Sello sello = null;
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT idSello, nombre FROM Sello WHERE idSello=?";
        
            PreparedStatement ps = cx.prepareStatement(sql);            
            ps.setInt(1, idSello);

            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                sello = new Sello();
                sello.setIdSello(rs.getInt("idSello"));
                sello.setNombreSello(rs.getString("nombre"));
                
            }
            
            ps.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return sello;
    }
    
    public ArrayList<Sello> buscarTodo()
    {
        ArrayList<Sello> listado = new ArrayList<Sello>();
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT idSello, nombre FROM Sello";
        
            PreparedStatement ps = cx.prepareStatement(sql);            

            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                Sello sello = new Sello();
                sello.setIdSello(rs.getInt("idSello"));
                sello.setNombreSello(rs.getString("nombre"));                
                listado.add(sello);
            }
            
            ps.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return listado;
    }
}
    
    

