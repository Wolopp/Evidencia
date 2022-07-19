import java.util.ArrayList;
import java.util.Scanner;

public class Doctores {

    private int id = 0;
    private String nombre;
    private int cedula = 0;
    private String especialidad;

    public Doctores() {
        id = 0;
        nombre = "";
        cedula = 0;
        especialidad = "";
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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


    public Doctores CreaD() {


        Scanner scanner = new Scanner(System.in);
        ArrayList<Doctores> listadoctor = new ArrayList();
        Doctores doctor = new Doctores();
        System.out.println("Ingresa el id del Doctor");
        doctor.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Ingresa el nombre del Doctor");
        doctor.setNombre(scanner.nextLine());
        System.out.println("Ingresa la cedula del Doctor");
        doctor.setCedula(scanner.nextInt());
        System.out.println("Ingresa la especialidad del Dcotor");
        doctor.setNombre(scanner.nextLine());
        doctor.setEspecialidad(scanner.nextLine());
        return doctor;

    }
}