
import java.util.Map;
import java.util.TreeMap;

public class Organizador {
    private String nombre;
    private String contacto;
    private Map<String, Evento> eventosOrganizados;

    public Organizador(String nombre, String contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.eventosOrganizados = new TreeMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public  void crearEvento(Evento evento) {
        if (evento != null && !eventosOrganizados.containsKey(evento.getNombre())) {
            eventosOrganizados.put(evento.getNombre(), evento);
        }   

    }
}
