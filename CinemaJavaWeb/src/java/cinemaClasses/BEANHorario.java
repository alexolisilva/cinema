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
public class BEANHorario {
    
    private int id_horario;
    private String dia;
    private String horario_inicio;
    private float preco;

    public BEANHorario() {
    }

    public BEANHorario(int id_horario, String dia, String horario_inicio, float preco) {
        this.id_horario = id_horario;
        this.dia = dia;
        this.horario_inicio = horario_inicio;
        this.preco = preco;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
