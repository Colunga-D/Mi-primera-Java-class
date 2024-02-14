public class App {
    public static void main(String[] args) {
        // Crear dos personas utilizando el constructor original
        Persona persona1 = new Persona("Juan", "Perez", 12345678, 1990);
        Persona persona2 = new Persona("Maria", "Gomez", 98765432, 1985);

        // Mostrar los valores de las personas
        System.out.println("Persona 1:");
        persona1.imprimir();

        System.out.println("\nPersona 2:");
        persona2.imprimir();

        // Crear dos personas utilizando el constructor modificado
        Persona persona3 = new Persona("Carlos", "Lopez", 55555555, 2000, "Argentina", 'H');
        Persona persona4 = new Persona("Ana", "Rodriguez", 66666666, 1995, "España", 'M');

        // Mostrar los valores de las personas con los nuevos atributos
        System.out.println("\nPersona 3:");
        persona3.imprimir();

        System.out.println("\nPersona 4:");
        persona4.imprimir();
    }
}