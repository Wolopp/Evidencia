import java.util.ArrayList;
import java.util.Scanner;

public class Cita {


    private int id_doctor = 0;

    private int cedula = 0;
    private String especialidad;
    private String motivo;
    private String fecha;
    private String hora;

    public Cita() {
        motivo ="";
        fecha = "";
        hora = "";
        cedula = 0;
        especialidad = "";
    }


    public int getId_doctor() {
        return id_doctor;
    }

    public void setId_doctor(int id_doctor) {
        this.id_doctor = id_doctor;
    }


    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Cita CreaCi() {


        Scanner scanner = new Scanner(System.in);
        ArrayList<Cita> listacita = new ArrayList();
        Cita cita= new Cita();
        System.out.println("Ingresa el id del Doctor");
        cita.setId_doctor(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Ingresa la especialidad del Doctor");
        cita.setEspecialidad(scanner.nextLine());
        System.out.println("Ingresa la cedula del Doctor");
        cita.setCedula(scanner.nextInt());
        System.out.println("Ingresa la fecha de la cita");
        cita.setFecha(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Ingresa la hora de la cita");
        cita.setHora(scanner.nextLine());
        return cita;

    }
}
