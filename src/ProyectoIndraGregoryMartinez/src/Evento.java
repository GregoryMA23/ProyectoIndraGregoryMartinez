import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Evento {
    private String nombre;
    private Date fecha;
    private String categoria;
    private int duracion;
    private String ubicacion;
    Set<Usuario>inscripciones= new TreeSet<>();
    Set<Usuario>particpantes= new TreeSet<>();

    public Evento(String nombre, Date fecha, int duracion, String ubicacion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracion = duracion;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
