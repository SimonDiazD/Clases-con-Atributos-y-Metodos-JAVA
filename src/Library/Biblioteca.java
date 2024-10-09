package Library;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void prestarLibro(Libro libro, Usuario usuario, Prestamo prestamo) {
        if (libros.contains(libro)) {
            prestamos.add(prestamo);
            System.out.println("El libro " + libro.getTitulo() + " ha sido prestado a " + usuario.getNombre());
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    public void devolverLibro(Prestamo prestamo) {
        prestamos.remove(prestamo);
        System.out.println("El libro ha sido devuelto.");
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }
}

