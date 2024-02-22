/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciono2;

/**
 *
 * @author ferna
 */
public class Canciones {
    private int idCancion;
    public String titulo;
    public String autor;
    public double duracion;
    public int annioCreacion;

        public Canciones(int idCancion, String titulo, String autor, double duracion, int annioCreacion) {
            this.idCancion = idCancion;
            this.titulo = titulo;
            this.autor = autor;
            this.duracion = duracion;
            this.annioCreacion = annioCreacion;
        }

    public int getIdCancion() {
        return idCancion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getDuracion() {
        return duracion;
    }

    public int getAnnioCreacion() {
        return annioCreacion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setAnnioCreacion(int annioCreacion) {
        this.annioCreacion = annioCreacion;
    }
    
    
    
}
   
