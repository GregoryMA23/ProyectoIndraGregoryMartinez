import java.util.ArrayList;

/**
 * Clase que representa un usuario del sistema de eventos sostenibles.
 */
public class Usuario {
    private String correo;
    private String nombre;
    private String contraseña;
    ArrayList<Evento> eventosInscritos = new ArrayList<>();

    /**
     * Constructor de la clase Usuario.
     * @param correo Correo electrónico del usuario.
     * @param nombre Nombre del usuario.
     * @param contraseña Contraseña del usuario.
     */
    public Usuario(String correo, String nombre, String contraseña) {
        this.correo = correo;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     * @return Correo electrónico.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del usuario.
     * @param correo Nuevo correo electrónico.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene el nombre del usuario.
     * @return Nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     * @param nombre Nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la contraseña del usuario.
     * @return Contraseña.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Establece la contraseña del usuario.
     * @param contraseña Nueva contraseña.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Inscribe al usuario en un evento, añadiéndolo a la lista de inscripciones del evento
     * y a la lista de eventos inscritos del usuario.
     * @param evento Evento al que inscribir al usuario.
     */
    public void inscribirEvento(Evento evento) {
        if (evento != null && !evento.inscripciones.contains(this)) {
            evento.inscripciones.add(this);
            eventosInscritos.add(evento);
        }
    }

    /**
     * Marca al usuario como participante en un evento, si ya está inscrito en él.
     * @param evento Evento en el que participar.
     */
    public void participarEvento(Evento evento) {
        if (evento != null && evento.inscripciones.contains(this)) {
            evento.particpantes.add(this);
        }
    }

    /**
     * Compara si dos usuarios son iguales según su correo electrónico.
     * @param obj Objeto a comparar.
     * @return true si los correos son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Usuario usuario = (Usuario) obj;
        return correo.equals(usuario.correo);
    }

    /**
     * Devuelve el código hash del usuario basado en su correo electrónico.
     * @return Código hash.
     */
    @Override
    public int hashCode() {
        return correo.hashCode();
    }

    /**
     * Cancela la inscripción del usuario en un evento, eliminándolo de la lista de inscripciones
     * del evento y de la lista de eventos inscritos del usuario.
     * @param evento Evento del que cancelar la inscripción.
     */
    public void cancelarInscripcion(Evento evento) {
        if (evento != null && evento.inscripciones.contains(this)) {
            evento.inscripciones.remove(this);
            eventosInscritos.remove(evento);
        }
    }
}