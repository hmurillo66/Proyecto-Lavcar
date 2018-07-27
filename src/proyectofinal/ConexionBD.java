
package proyectofinal;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hanse
 */
public class ConexionBD {
    
    // creamos la variable tipo conexion y la declaramos con el nombre de conectar
    Connection conectar=null;
    
    // creamos el metodo tipo connection para realizar la conexion
public Connection conexion(){   
    
  try{
      
      //.newInstance();
    Class.forName("org.gjt.mm.mysql.Driver");
                                                                                    // aca se coloca el nombre de la base de datos
    conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/sistema_lavacar","root","");
    
    
  }catch(SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos");
                                   }catch(ClassNotFoundException ex) {          }
  return conectar;
}


    
    
}
