package libros.demo.com_tuuniversidad_repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import libros.demo.com_tuuniversidad_models.Libro;

@Repository
public class LibroRepositoryImpl implements LibroRepository{
    private List<Libro> libros = new ArrayList<>();

    public LibroRepositoryImpl() {
        libros.add(new Libro(1L, "La culpa es de la vaca", "Jorge Luis del Pino", "Norma", 2000));
        libros.add(new Libro(2L, "athur", "Xavi Simons", "Vistana", 2020));
        libros.add(new Libro(3L, "Bajo las estrellas", "Cold Palmer", "Ranisa", 1999));
        libros.add(new Libro(4L, "Mas alla del universo", "Jose Luis Moscada", "Coquito", 2007));
    }

    public Libro getLibro (int id){
        for(Libro libro: libros){
            if(id == libro.getId())
                return libro;
        }

        return null;
        
    }

    public List<Libro> getLibros() {
        return libros;
    }


    public void postLibro(Libro libro) {
        libros.add(libro);
    }

}
