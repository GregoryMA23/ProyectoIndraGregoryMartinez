import java.util.Set;
import java.util.TreeSet;

/**
 * Clase que representa el portal de gestión de eventos sostenibles.
 */
public class Portal {
    private String nombre;
    private Set<Usuario> usuarios = new TreeSet<>();
    private Set<Organizador> organizadores = new TreeSet<>();
    private Set<Evento> eventos = new TreeSet<>();

    /**
     * Constructor de la clase Portal.
     * @param nombre Nombre del portal.
     */
    public Portal(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del portal.
     * @return Nombre del portal.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del portal.
     * @param nombre Nuevo nombre del portal.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el conjunto de usuarios registrados en el portal.
     * @return Conjunto de usuarios.
     */
    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Establece el conjunto de usuarios del portal.
     * @param usuarios Nuevo conjunto de usuarios.
     */
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * Obtiene el conjunto de organizadores registrados en el portal.
     * @return Conjunto de organizadores.
     */
    public Set<Organizador> getOrganizadores() {
        return organizadores;
    }

    /**
     * Establece el conjunto de organizadores del portal.
     * @param organizadores Nuevo conjunto de organizadores.
     */
    public void setOrganizadores(Set<Organizador> organizadores) {
        this.organizadores = organizadores;
    }

    /**
     * Registra un nuevo usuario en el portal si no existe previamente.
     * @param usuario Usuario a registrar.
     */
    public void registrarUsuario(Usuario usuario) {
        if (usuario != null && !usuarios.contains(usuario)) {
            usuarios.add(usuario);
        }
    }

    /**
     * Registra un nuevo organizador en el portal si no existe previamente.
     * @param organizador Organizador a registrar.
     */
    public void registrarOrganizador(Organizador organizador) {
        if (organizador != null && !organizadores.contains(organizador)) {
            organizadores.add(organizador);
        }
    }

    /**
     * Obtiene el conjunto de eventos registrados en el portal.
     * @return Conjunto de eventos.
     */
    public Set<Evento> getEventos() {
        return eventos;
    }

    /**
     * Establece el conjunto de eventos del portal.
     * @param eventos Nuevo conjunto de eventos.
     */
    public void setEventos(Set<Evento> eventos) {
        this.eventos = eventos;
    }
}
