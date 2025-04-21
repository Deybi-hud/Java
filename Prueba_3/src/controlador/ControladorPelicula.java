
package controlador;
import BDD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Pelicula;



public class ControladorPelicula {  
    
 public boolean agregar(Pelicula pelicula){
        
    try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO Produccion (idProduccion,nombre,formato,duracion,anioEstreno,clasificacion,precio,idsello) values (?,?,?,?,?,?,?,?)";
        
            PreparedStatement ps = cx.prepareStatement(sql);
           
            ps.setInt(1, pelicula.getIdProduccion());
            ps.setString(2, pelicula.getNombre());
            ps.setString(3, pelicula.getFormato());
            ps.setString(4, pelicula.getDuracion());
            ps.setString(5, pelicula.getAnioEstreno());
            ps.setString(6, pelicula.getClasificacion());
            ps.setInt(7, pelicula.getPrecio());
            ps.executeUpdate();
            ps.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public boolean actualizar(Pelicula pelicula)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "UPDATE Produccion SET idProduccion=?,nombre=?,formato=?,duracion=?,anioEstreno=?,clasificacion=?,precio=?,sello=? FROM Pelicula WHERE id=?";
        
            PreparedStatement ps = cx.prepareStatement(sql);
            
            ps.setInt(1, pelicula.getIdProduccion());
            ps.setString(2, pelicula.getNombre());
            ps.setString(3, pelicula.getFormato());
            ps.setString(4, pelicula.getDuracion());
            ps.setString(5, pelicula.getAnioEstreno());
            ps.setString(6, pelicula.getClasificacion());
            ps.setInt(7, pelicula.getPrecio());
      
            
            ps.executeUpdate();
            ps.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public boolean eliminar(int id)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "DELETE FROM Pelicula WHERE id=?";
        
            PreparedStatement ps = cx.prepareStatement(sql);            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public Pelicula buscarPorId(int id)
    {
        Pelicula pelicula = null;
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT idProduccion,nombre,formato,duracion,anioEstreno,clasificacion,precio,sello FROM Pelicula WHERE id=?";
        
            PreparedStatement ps = cx.prepareStatement(sql);            
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            
            
            
            if(rs.next())
            {
                 if(rs.next()){
                     
                pelicula = new Pelicula();               
                pelicula.setIdProduccion(rs.getInt("IdProduccion"));
                pelicula.setNombre(rs.getString("Nombre"));
                pelicula.setFormato(rs.getString("Formato"));
                pelicula.setDuracion(rs.getString("Duracion"));
                pelicula.setAnioEstreno(rs.getString("AnioEstreno"));
                pelicula.setClasificacion(rs.getString("Clasificacion"));
                pelicula.setPrecio(rs.getInt("Precio"));
                
            }
            
                
            }
            
            ps.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return pelicula;
    }
    
    public ArrayList<Pelicula> buscarTodo()
    {
        ArrayList<Pelicula> listado = new ArrayList<Pelicula>();
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT idProduccion,nombre,formato,duracion,anioEstreno,clasificacion,precio,sello FROM Pelicula WHERE id=?";
        
            PreparedStatement ps = cx.prepareStatement(sql);            

            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                  if(rs.next())
            {
                Pelicula pelicula = new Pelicula();
                pelicula.setIdProduccion(rs.getInt("id"));
                pelicula.setNombre(rs.getString("Nombre"));
                pelicula.setFormato(rs.getString("idCategoria"));
                pelicula.setDuracion(rs.getString("codigo"));
                pelicula.setAnioEstreno(rs.getString("anioEstreno"));
                pelicula.setClasificacion(rs.getString("clasificacion"));
                pelicula.setPrecio(rs.getInt("precioCosto"));
                listado.add(pelicula);
            }
            
            }
            
            ps.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return listado;
    }   
}
