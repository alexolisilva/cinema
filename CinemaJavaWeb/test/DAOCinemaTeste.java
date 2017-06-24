/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cinemaClasses.BEANFilme;
import cinemaClasses.DAOCinema;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aos
 */
public class DAOCinemaTeste {
    
    public DAOCinemaTeste() {
    }
    
    @Test
    public void listaFilmes() throws SQLException, ClassNotFoundException{
        
        DAOCinema dao = new DAOCinema();
        
        for (BEANFilme f: dao.listaFilmes()){
            System.out.println("Cod. do Filme: " + f.getId_filme() +
                    " Titulo: " + f.getTitulo() + 
                    " Link do Trailer: " + f.getLink_trailer());
        }
    }
}
