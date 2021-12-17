public class Teacher {
    private String nombre;
    private int tipo;
    private int salarioBaseMensual =2000;
    private int comision = 500;
    private int bonus = 100;
    static final int ProfesorTP = 0;
    static final int ProfesorTc = 1;
    static final int administrativo = 2;
    Teacher(int type, String nombre) {
        tipo = type;
        this.nombre = nombre;

    }
    int Sueldo() {
        switch (tipo) {
            case ProfesorTP:
                return salarioBaseMensual;
            case ProfesorTc:
                return salarioBaseMensual + comision;
            case administrativo:
                return salarioBaseMensual + bonus;
            default:
                throw new RuntimeException("Empleado incorrecto");
        }
    }


    public int getTipo() {
        return tipo;
    }
}
