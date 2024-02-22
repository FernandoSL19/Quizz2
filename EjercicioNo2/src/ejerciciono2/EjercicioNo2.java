/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciono2;

import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class EjercicioNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        int idCancion = Integer.parseInt(JOptionPane.showInputDialog("Cual es el id de la cancion?"));
        String titulo = JOptionPane.showInputDialog("Cual es el titulo de la cancion?");
        String autor = JOptionPane.showInputDialog("Cual es el autor de la cancion?");
        double duracion = Double.parseDouble(JOptionPane.showInputDialog("Cuál es la duracion de la cancion?"));
        int annioCreacion = Integer.parseInt(JOptionPane.showInputDialog("Digite el annio de creacion de la cancion:"));
        
        Canciones canciones = new Canciones(idCancion, titulo, autor, duracion, annioCreacion);
        
        System.out.println ("Informacion de la cancion:");
        System.out.println("ID de la cancion: " + canciones.getIdCancion());
        System.out.println("Titulo de la cancion: " + canciones.getTitulo());
        System.out.println("Autor de la cancion: " + canciones.getAutor());         
        System.out.println("Duracion de la cancion: " + canciones.getDuracion()+ "minutos");
        System.out.println("Año de creacion de la cancion: " + canciones.getAnnioCreacion());
        
        System.out.println ("Informacion de la nueva cancion:");
        canciones.setIdCancion(3);
        System.out.println("ID de la cancion: " + canciones.getIdCancion());
        canciones.setTitulo("Lover");
        System.out.println("Titulo nuevo:" +canciones.getTitulo());
        canciones.setAutor("Taylor Swift");
        System.out.println("Autor de la cancion: " + canciones.getAutor());
        canciones.setDuracion(3.41);
        System.out.println("Duracion de la cancion: " + canciones.getDuracion()+"minutos");
        canciones.setAnnioCreacion(2019);
        System.out.println("Año de creacion de la cancion: " + canciones.getAnnioCreacion());
        
        
        }
           
    }
    
