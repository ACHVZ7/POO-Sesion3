package modelos;

public class Ciudad {
    private String nombre;
    private int poblacion;

    public Ciudad() {
    }

    public Ciudad(String nombre, int poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ciudad{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", poblacion=").append(poblacion);
        sb.append('}');
        return sb.toString();
    }
}
