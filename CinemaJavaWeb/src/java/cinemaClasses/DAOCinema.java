
package cinemaClasses;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aos
 */
public class DAOCinema {
    
    private Connection conn;
    
    
    public DAOCinema () throws ClassNotFoundException{
        
        this.conn = new Conexao().getConnection();
    }

    public List<BEANFilme> listaFilmes() throws SQLException, ClassNotFoundException{
    
        ArrayList arrayFilmes = new ArrayList();
        String infoFilme;
        
        // pega a conexão e o Statement
        Connection conn = new Conexao().getConnection();
        PreparedStatement stmt = conn.prepareStatement("select id_filme, titulo, link_trailer from filme");
        // executa um select
        ResultSet rs = stmt.executeQuery();
        try{
            // itera no ResultSet
            while (rs.next()) {
                int id = rs.getInt("id_filme");
                String titulo = rs.getString("titulo");
                String link = rs.getString("link_trailer");
                System.out.println(id + " :: " + titulo + " :: " + link);
                infoFilme = id + " :: " + titulo + " :: " + link;
                arrayFilmes.add("infoFilme");
            }
        }
        catch (SQLException e){
            System.out.println("ERRO SQL E");
        }
        finally{
            rs.close();
            stmt.close();
            conn.close();
        }
        return arrayFilmes;
    }
    
}
