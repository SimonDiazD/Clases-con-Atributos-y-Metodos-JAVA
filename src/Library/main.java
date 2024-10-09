package Library;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario("Juan Pérez", "Calle Falsa 123", "555-1234", "U001", "juanperez@mail.com");
        Empleado empleado1 = new Empleado("Ana López", "Avenida Siempre Viva", "555-5678", "Bibliotecaria", 2500000);
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "978-3-16-148410-0");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.registrarUsuario(usuario1);
        biblioteca.agregarLibro(libro1);

        Prestamo prestamo1 = new Prestamo(libro1, usuario1, LocalDate.now(), LocalDate.now().plusWeeks(2));
        biblioteca.prestarLibro(libro1, usuario1, prestamo1);
        biblioteca.devolverLibro(prestamo1);
    }
}
