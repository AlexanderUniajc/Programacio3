public class Trabajador{
    private String cedula;
    private String nombre;
    private double salario;

    public Trabajador(String cedula, String nombre, double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.salario = salario;

}

    public String getCedula() {
        return cedula;
        }
    
    public String getNombre() {
        return nombre;
        }
    
    public double getSalario() {
        return salario;
        }

    public String toString() {
        return "Trabajador{cedula: " + cedula + ", nombre: " + nombre + ", salario: " + salario + "}";
        }

    public double Pagar(double incremento){
        return salario +(salario * incremento);
        }
        

}