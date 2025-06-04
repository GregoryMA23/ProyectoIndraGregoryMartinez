import java.util.Map;
import java.util.TreeMap;

/**
 * Clase que representa a un organizador de eventos sostenibles.
 */
public class Organizador {
    private String nombre;
    private String contacto;
    private Map<String, Evento> eventosOrganizados;

    /**
     * Constructor de la clase Organizador.
     * @param nombre Nombre del organizador.
     * @param contacto Información de contacto del organizador.
     */
    public Organizador(String nombre, String contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.eventosOrganizados = new TreeMap<>();
    }

    /**
     * Obtiene el nombre del organizador.
     * @return Nombre del organizador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del organizador.
     * @param nombre Nuevo nombre del organizador.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la información de contacto del organizador.
     * @return Información de contacto.
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * Establece la información de contacto del organizador.
     * @param contacto Nueva información de contacto.
     */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /**
     * Crea un nuevo evento y lo añade al mapa de eventos organizados si no existe ya.
     * @param evento Evento a crear.
     */
    public void crearEvento(Evento evento) {
        if (evento != null && !eventosOrganizados.containsKey(evento.getNombre())) {
            eventosOrganizados.put(evento.getNombre(), evento);
        }
    }

    /**
     * Crea un nuevo evento, lo añade al mapa de eventos organizados y lo registra en el portal.
     * @param evento Evento a crear.
     * @param portal Referencia al portal donde registrar el evento.
     */
    public void crearEvento(Evento evento, Portal portal) {
        if (evento != null && !eventosOrganizados.containsKey(evento.getNombre())) {
            eventosOrganizados.put(evento.getNombre(), evento);
            if (portal != null) {
                portal.getEventos().add(evento);
            }
        }
    }

    /**
     * Modifica un evento existente en el mapa de eventos organizados.
     * @param nombreEvento Nombre del evento a modificar.
     * @param nuevoEvento Nuevo objeto Evento con los datos actualizados.
     */
    public void modificarEvento(String nombreEvento, Evento nuevoEvento) {
        if (eventosOrganizados.containsKey(nombreEvento)) {
            eventosOrganizados.put(nombreEvento, nuevoEvento);
        }
    }
}
