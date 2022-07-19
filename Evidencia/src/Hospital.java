import java.util.Scanner;

public class Hospital {

    public static void main(String[] arg){

    Paciente pa = new Paciente();
    Doctores da = new Doctores();
    Cita ca = new Cita();

    Scanner inicio = new Scanner(System.in);
    int opcion = 0;
    do{
        System.out.println("1. Agregar paciente");
        //System.out.println("2. Eliminar paciente");
        //System.out.println("3. Modificar paciente");
        //System.out.println("4. Mostrar pacientes ");
        System.out.println("5. Agregar Doctor");
        //System.out.println("6. Eliminar Doctor");
        //System.out.println("7. Modificar Doctor");
         System.out.println("8. Crar cita ");
        //System.out.println("9. Eliminar cita ");
        //System.out.println("10. Modificar cita ");
        System.out.println("11. Salir");
        opcion = inicio.nextInt();

        switch (opcion){
            case 1:
                pa.Creap();
                break;
            //case 2:
               // break;
            //case 3:
                //break;
            //case 4:
                //break;
            case 5:
                da.CreaD();
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                ca.CreaCi();
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                System.out.println("Adios");
                break;
        }

    } while (opcion !=11);


    }
}