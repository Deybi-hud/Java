
package controlador;
import BDD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Cargo;


public class ControladorCargo {
    
    public boolean agregar(Cargo cargo)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO Cargo (nombre) " +
                        " values (?)";
        
            PreparedStatement ps = cx.prepareStatement(sql);
           
            ps.setString(1, cargo.getNombreCargo());
            
            
            ps.executeUpdate();
            ps.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    
    public boolean actualizar(Cargo cargo)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "UPDATE Cargo SET Nombre=? WHERE idCargo=?";
        
            PreparedStatement ps = cx.prepareStatement(sql);
            
            ps.setString(1, cargo.getNombreCargo());
            ps.setInt(2, cargo.getIdCargo());
            
            
            ps.executeUpdate();
            ps.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
        
    }
    
    public boolean eliminar(int idCargo)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "DELETE FROM Cargo WHERE idCargo=?";
        
            PreparedStatement ps = cx.prepareStatement(sql);            
            ps.setInt(1, idCargo);
            
            ps.executeUpdate();
            ps.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    
    public Cargo buscarPorId(int idCargo)
    {
        Cargo cargo = null;
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT idCargo, nombre FROM Cargo WHERE idCargo=?";
        
            PreparedStatement ps = cx.prepareStatement(sql);            
            ps.setInt(1, idCargo);

            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                cargo = new Cargo();
                cargo.setIdCargo(rs.getInt("idCargo"));
                cargo.setNombreCargo(rs.getString("nombre"));
                
            }
            
            ps.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return cargo;
    }
    
    public ArrayList<Cargo> buscarTodo()
    {
        ArrayList<Cargo> listado = new ArrayList<Cargo>();
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT idCargo, nombre FROM Cargo";
        
            PreparedStatement ps = cx.prepareStatement(sql);            

            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                Cargo cargo = new Cargo();
                cargo.setIdCargo(rs.getInt("idCargo"));
                cargo.setNombreCargo(rs.getString("nombre"));                
                listado.add(cargo);
            }
            
            ps.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return listado;
    }
}

   

