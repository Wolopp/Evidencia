import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

public class Paciente {

    private int id = 0;
    private String nombre;
    private int telefono = 0;
    private String curp;

    public Paciente() {
        nombre = "";
        telefono = 0;
        curp = "";
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public Paciente Creap() {


        Scanner scanner = new Scanner(System.in);
        ArrayList<Paciente> listapaciente = new ArrayList();
        Paciente paciente = new Paciente();
        System.out.println("Ingresa el id del paciente");
        paciente.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Ingresa el nombre del paciente");
        paciente.setNombre(scanner.nextLine());
        System.out.println("Ingresa el curp del paciente");
        paciente.setCurp(scanner.nextLine());
        return paciente;


        /*String inputModificado = "D:\\Documentos\\Escuela\\Taller_de_java\\Evidencia\\Pacientes.txt";

        BufferedWriter bufferedWriter = null;


        try {

            BufferedWriter bufferedWriter = null;
            bufferedWriter = new BufferedWriter(new FileWriter(inputModificado));
            String Line;


        } catch (IOException e) {

            System.out.println("Error a leer el archvio" + e.getMessage());
        }
        finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }

            } catch (IOException e) {
                System.out.println("Error " + e.getMessage());
            }
        }*/
    }
}












