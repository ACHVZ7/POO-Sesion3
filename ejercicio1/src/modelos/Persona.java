package modelos;

public class Persona {
    private String nombres;
    private String apellidos;
    private int edad;
    private float altura;

    public Persona() {
    }

    public Persona(String nombres, String apellidos, int edad, float altura) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.altura = altura;
    }

    //metodos getter y setter


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


























}
