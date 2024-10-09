package Library;

public class Empleado extends Persona {
    private String puesto;
    private double salario;

    public Empleado(String nombre, String direccion, String telefono, String puesto, double salario) {
        super(nombre, direccion, telefono);
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + ", Puesto: " + puesto + ", Salario: " + salario;
    }
}
