public class Usuario {
    private String correo;
    private String nombre;
    private String contraseña;

    public Usuario(String correo, String nombre, String contraseña) {
        this.correo = correo;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void inscribirEvento(Evento evento) {
        if (evento != null && !evento.inscripciones.contains(this)) {
            evento.inscripciones.add(this);
        }
    }

    public void participarEvento(Evento evento) {
        if (evento != null && evento.inscripciones.contains(this)) {
            evento.particpantes.add(this);
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Usuario usuario = (Usuario) obj;
        return correo.equals(usuario.correo);
    }

    @Override
    public int hashCode() {
        return correo.hashCode();
}
}