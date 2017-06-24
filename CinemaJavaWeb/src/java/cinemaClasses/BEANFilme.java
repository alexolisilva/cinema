/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemaClasses;

/**
 *
 * @author aos
 */
public class BEANFilme {
    
    private int id_filme;
    private String titulo;
    private String link_trailer;

    public BEANFilme() {
    }

    public BEANFilme(int id_filme, String titulo, String link_trailer) {
        this.id_filme = id_filme;
        this.titulo = titulo;
        this.link_trailer = link_trailer;
    }

    public int getId_filme() {
        return id_filme;
    }

    public void setId_filme(int id_filme) {
        this.id_filme = id_filme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLink_trailer() {
        return link_trailer;
    }

    public void setLink_trailer(String link_trailer) {
        this.link_trailer = link_trailer;
    }
    
    
}
