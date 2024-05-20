public class Persona {

    private int id;
    public String nombre;
    public String apellido;
    public int edad;
    private char sexo;
    public String direccion;

    public Persona(int id, String nombre, String apellido, int edad, char sexo, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}
