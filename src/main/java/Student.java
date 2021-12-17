public class Student {
    private String nombre;
    private int tipo;
    private int notaBase =11;
    static final int Pregado = 0;
    static final int Maestria = 1;
    static final int Doctorado = 2;

    Student(int type, String nombre) {
        tipo = type;
        this.nombre = nombre;
    }
    int Grado() {
        switch (tipo) {
            case Pregado:
                return notaBase;
            case Maestria:
                return notaBase + 1;
            case Doctorado:
                return notaBase + 2;
            default:
                throw new RuntimeException("Empleado incorrecto");
        }
    }
}
