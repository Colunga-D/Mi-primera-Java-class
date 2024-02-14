class Persona {
    // Atributos originales
    private String nombre;
    private String apellido;
    private int numeroDocumento;
    private int anoNacimiento;

    // Nuevos atributos
    private String paisNacimiento;
    private char genero;

    // Constructor original
    public Persona(String nombre, String apellido, int numeroDocumento, int anoNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.anoNacimiento = anoNacimiento;
    }

    // Constructor modificado
    public Persona(String nombre, String apellido, int numeroDocumento, int anoNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.anoNacimiento = anoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    // Método para imprimir los valores de los atributos
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Número de Documento: " + numeroDocumento);
        System.out.println("Año de Nacimiento: " + anoNacimiento);
        System.out.println("País de Nacimiento: " + paisNacimiento);
        System.out.println("Género: " + genero);
    }
}