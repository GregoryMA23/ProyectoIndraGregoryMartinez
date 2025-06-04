import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

/**
 * Clase que representa un evento sostenible.
 */
public class Evento {
    private String nombre;
    private Date fecha;
    private String categoria;
    private int duracion;
    private String ubicacion;
    Set<Usuario> inscripciones = new TreeSet<>();
    Set<Usuario> particpantes = new TreeSet<>();

    /**
     * Constructor de la clase Evento.
     * @param nombre Nombre del evento.
     * @param fecha Fecha del evento.
     * @param duracion Duración del evento en horas.
     * @param ubicacion Ubicación del evento.
     */
    public Evento(String nombre, Date fecha, int duracion, String ubicacion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracion = duracion;
        this.ubicacion = ubicacion;
    }

    /**
     * Obtiene el nombre del evento.
     * @return Nombre del evento.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del evento.
     * @param nombre Nuevo nombre del evento.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la fecha del evento.
     * @return Fecha del evento.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha del evento.
     * @param fecha Nueva fecha del evento.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la duración del evento en horas.
     * @return Duración del evento.
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Establece la duración del evento en horas.
     * @param duracion Nueva duración del evento.
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Obtiene la ubicación del evento.
     * @return Ubicación del evento.
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Establece la ubicación del evento.
     * @param ubicacion Nueva ubicación del evento.
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Obtiene la categoría del evento.
     * @return Categoría del evento.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoría del evento.
     * @param categoria Nueva categoría del evento.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Obtiene el conjunto de usuarios inscritos en el evento.
     * @return Conjunto de usuarios inscritos.
     */
    public Set<Usuario> getInscripciones() {
        return inscripciones;
    }

    /**
     * Establece el conjunto de usuarios inscritos en el evento.
     * @param inscripciones Nuevo conjunto de inscripciones.
     */
    public void setInscripciones(Set<Usuario> inscripciones) {
        this.inscripciones = inscripciones;
    }

    /**
     * Obtiene el conjunto de usuarios participantes en el evento.
     * @return Conjunto de participantes.
     */
    public Set<Usuario> getParticpantes() {
        return particpantes;
    }

    /**
     * Establece el conjunto de usuarios participantes en el evento.
     * @param particpantes Nuevo conjunto de participantes.
     */
    public void setParticpantes(Set<Usuario> particpantes) {
        this.particpantes = particpantes;
    }
}
